package estudos;

public class Aluno extends Pessoa{
		private int anoEntrada;
		private int periodoEntrada;
		
		public void setAnoEntrada(int anoEntrada) {
			this.anoEntrada = anoEntrada;
		}
		public int anoEntrada() {
			return anoEntrada;
		}
		
		public void setPeriodoEntrada(int periodoEntrada) {
			this.periodoEntrada = periodoEntrada;
		}
		public int periodoEntrada() {
			return periodoEntrada;
		}

	
}
