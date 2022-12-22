package paciente;

public class TestePaciente {

	public static void main(String[] args) {
		
		Paciente novoPaciente = new Paciente(12, "João", "Enxaqueca", "Convênio", "Raio-x", 00f);
		System.out.println("Numero do quarto: " + novoPaciente.getNumeroDoQuarto());
		System.out.println("Nome do paciente: " + novoPaciente.getNomePaciente());
		System.out.println("Sintoma: " + novoPaciente.getNumeroDoQuarto());
		System.out.println("Convênio ou Particular: " + novoPaciente.getTipo());
		System.out.println("Exame: " + novoPaciente.getExame());
		System.out.println("Preço: " + novoPaciente.getConsulta()+ " R$");
	}
}
