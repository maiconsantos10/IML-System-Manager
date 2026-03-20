package entities;

public class Corpo {
	
	private int id;
	private String nome;
	private String causaDaMorte;
	private String status;
	
	public Corpo(int id, String nome, String causaDaMorte) {
		this.id = id;
		this.nome = nome;
		this.causaDaMorte = causaDaMorte;
		this.status = "RECEBIDO";
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCausaDaMorte() {
		return causaDaMorte;
	}
	
	
}
