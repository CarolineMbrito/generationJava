package aviao;

public class Aviao {

	// atributos-caracteristicas do objeto
				private String modeloAviao;
				private String cor;
				private String nomePiloto;
				private String rota;
				private float gasolina;
				private int passageiros;
			 
			//metodos construtores da classe Conta Bancaria	
				public Aviao(String modeloAviao, String cor, String nomePiloto, String rota, float gasolina, int passageiros) {
					this.modeloAviao = modeloAviao;
					this.cor = cor;
					this.nomePiloto = nomePiloto;
					this.rota = rota;
					this.gasolina = gasolina;
					this.passageiros = passageiros;
						
				}
				public Aviao() {}
				public String getModeloAviao() {
					return modeloAviao;
				}
				public void setModeloAviao(String modeloAviao) {
					this.modeloAviao = modeloAviao;
				}
				public String getCor() {
					return cor;
				}
				public void setCor(String cor) {
					this.cor = cor;
				}
				public String getNomePiloto() {
					return nomePiloto;
				}
				public void setNomePiloto(String nomePiloto) {
					this.nomePiloto = nomePiloto;
				}
				public String getRota() {
					return rota;
				}
				public void setRota(String rota) {
					this.rota = rota;
				}
				public float getGasolina() {
					return gasolina;
				}
				public void setGasolina(float gasolina) {
					this.gasolina = gasolina;
				}
				public int getPassageiros() {
					return passageiros;
				}
				public void setPassageiros(int passageiros) {
					this.passageiros = passageiros;
				}
				
}
