package service;

import entities.Caso;
import repository.CasoRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CasoService {

    private final List<Caso> casos = new ArrayList<>();
    private final CasoRepository casoRepository;

    public CasoService() {
        this(new CasoRepository());
    }

    public CasoService(CasoRepository casoRepository) {
        this.casoRepository = casoRepository;
    }

    public void adicionarCaso(Caso caso) {
        casoRepository.salvarCaso(caso);
        casos.add(caso);
    }

    public List<Caso> listarCasos() {
        return Collections.unmodifiableList(casos);
    }
}
