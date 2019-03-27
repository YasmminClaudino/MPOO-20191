package estudos;

public class Pessoa {
		private String nome;
		private String cpf;
		private Endereco endereco;
		private Cadastro cadastro;
		
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

		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}
		public Endereco getEndereco() {
			return endereco;
		}

		
		public void setCadastro(Cadastro cadastro) {
			this.cadastro = cadastro;
		}
		public Cadastro getCadastro() {
			return cadastro;
		}

		

		public void imprimir() {
			this.cadastro.imprimeCadastro();
			System.out.println("Nome: " + this.getNome());
			System.out.println("CPF: " + this.getCpf());
			this.endereco.imprimirEndereco();
			
			

		}

}
