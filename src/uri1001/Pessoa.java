package uri1001;

public class Pessoa {

	private String nome;
	private String SobreNome;

	public Pessoa(String nome, String sobreNome) {
		this.nome = nome;
		this.SobreNome = sobreNome;

	}

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public Pessoa() {

	}

	protected int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return SobreNome;
	}

	public void setSobreNome(String sobreNome) {
		SobreNome = sobreNome;
	}

}