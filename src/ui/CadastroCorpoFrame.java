package ui;

import entities.Caso;
import entities.Corpo;
import service.CasoService;

import java.awt.GridLayout;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastroCorpoFrame extends JFrame {

    private static final AtomicInteger SEQUENCIA_IDS = new AtomicInteger(1);
    private static final AtomicInteger SEQUENCIA_CASOS = new AtomicInteger(1);

    private final CasoService casoService;

    public CadastroCorpoFrame() {
        this(new CasoService());
    }

    public CadastroCorpoFrame(CasoService casoService) {
        this.casoService = casoService;

        setTitle("Registrar corpo");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 2));

        panel.add(new JLabel("Nome: "));
        JTextField campoNome = new JTextField();
        panel.add(campoNome);

        panel.add(new JLabel("Causa da morte: "));
        JTextField campoCausa = new JTextField();
        panel.add(campoCausa);

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(e -> salvarCaso(campoNome, campoCausa));

        panel.add(btnSalvar);

        add(panel);
        setVisible(true);
    }

    private void salvarCaso(JTextField campoNome, JTextField campoCausa) {
        String nome = campoNome.getText().trim();
        String causa = campoCausa.getText().trim();

        if (nome.isEmpty() || causa.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha nome e causa da morte.", "Campos obrigatórios",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        int id = SEQUENCIA_IDS.getAndIncrement();
        String numeroCaso = "CASO-" + SEQUENCIA_CASOS.getAndIncrement();

        Corpo corpo = new Corpo(id, nome, causa);
        Caso caso = new Caso(id, numeroCaso, corpo);

        try {
            casoService.adicionarCaso(caso);
            System.out.println("Caso registrado no banco: " + numeroCaso + " | Nome: " + nome + " | Causa: " + causa);
            JOptionPane.showMessageDialog(this, "Caso salvo com sucesso no banco de dados.");
            campoNome.setText("");
            campoCausa.setText("");
        } catch (IllegalStateException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro ao salvar caso", JOptionPane.ERROR_MESSAGE);
        }
    }
}
