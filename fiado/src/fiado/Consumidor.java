package fiado;

public class Consumidor {
	
	protected String nome;
	protected int [] fiados;
	protected int telefone;
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String n) {
		this.nome = n;
	}	
	public int getTelefone() {
		return this.telefone;
	}
	public void setTelefone(int t) {
		this.telefone = t;
	}
	
}
