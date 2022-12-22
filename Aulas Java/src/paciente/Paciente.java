package paciente;

public class Paciente {
		// atributos-caracteristicas do objeto
			private int numeroDoQuarto;
			private String nomePaciente;
			private String sintoma;
			private String tipo;
			private String exame;
			private float consulta;
		 
		//metodos construtores da classe Conta Bancaria	
			public Paciente(int numeroDoQuarto, String nomePaciente, String sintoma, String tipo, String exame, float consulta) {
				this.numeroDoQuarto = numeroDoQuarto;
				this.nomePaciente = nomePaciente;
				this.sintoma = sintoma;
				this.tipo = tipo;
				this.exame = exame;
				this.consulta = consulta;
					
			}
			public Paciente() {}
			public int getNumeroDoQuarto() {
				return numeroDoQuarto;
			}
			public void setNumeroDoQuarto(int numeroDoQuarto) {
				this.numeroDoQuarto = numeroDoQuarto;
			}
			public String getNomePaciente() {
				return nomePaciente;
			}
			public void setNomePaciente(String nomePaciente) {
				this.nomePaciente = nomePaciente;
			}
			public String getSintoma() {
				return sintoma;
			}
			public void setSintoma(String sintoma) {
				this.sintoma = sintoma;
			}
			public String getTipo() {
				return tipo;
			}
			public void setTipo(String tipo) {
				this.tipo = tipo;
			}
			public String getExame() {
				return exame;
			}
			public void setExame(String exame) {
				this.exame = exame;
			}
			public float getConsulta() {
				return consulta;
			}
			public void setConsulta(float consulta) {
				this.consulta = consulta;
			}

		
}

	
