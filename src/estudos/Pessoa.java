package estudos;

public class Pessoa {
		private String nome;
		private String cpf;
		private Endereco endereco;
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getCpf() {
			return cpf;
		}

		public Endereco getEndereco() {
			return endereco;
		}

		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}

		public void imprimir() {
			System.out.println("Nome: " + this.getNome());
			System.out.println("CPF: " + this.getCpf());
			this.endereco.imprimirEndereco();
			
			

		}

}
