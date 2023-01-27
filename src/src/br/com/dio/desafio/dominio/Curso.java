package src.br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
	
	private int cargaHoraria;
	
	@Override
	public double calcularXP() {
		return XP_PADRAO + cargaHoraria;
	}
	
	public Curso() {
	}
	
	//Getters e Setters
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}
		
	
}
