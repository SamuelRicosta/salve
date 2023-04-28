package pacote;

//import modelo.Matricula;

public class Prova {

	private String horarioInicio;
	private String horarioTermino;
	private Questao[] questoes = new Questao[10];

	public Prova(String horarioInicio, String horarioTermino) {

		this.horarioInicio = horarioInicio;
		this.horarioTermino = horarioTermino;

	}

	// gets e sets

	public String getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(String horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public String getHorarioTermino() {
		return horarioTermino;
	}

	public void setHorarioTermino(String horarioTermino) {
		this.horarioTermino = horarioTermino;
	}

	public Questao[] getQuestoes() {
		return questoes;
	}

	public void setQuestoes(Questao[] questoes) {
		this.questoes = questoes;
	}

	// Metodo da classe
	public void imprime() {

		System.out.println(getHorarioInicio());
		System.out.println(getHorarioTermino());
	}
	
	
	@Override
	public String toString() {
		return "HorarioInicio: " + horarioInicio + ", HorarioTermino: " + horarioTermino + ", Questoes: " + questoes;  
	}

}
