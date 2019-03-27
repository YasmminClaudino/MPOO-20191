package estudos;

import java.util.Date;

public class Application {

	public static void main(String[] args) {
		
		Date data = new Date();
		Professor professor = new Professor();
		Endereco enderecoProf = new Endereco();

		
		Cadastro cadPessoa01 = new Cadastro();
		cadPessoa01.setProfessor(professor);
		Pessoa pessoa01 = new Pessoa();
		pessoa01.setNome("Gabriel");
		pessoa01.setCpf("21123");
	
		
		professor.setAdimissao(data);
		enderecoProf.setRua("Rua imaginaria");
		enderecoProf.setNumero(23);
		enderecoProf.setComplemento("B");
		enderecoProf.setCidade("Recife");
		pessoa01.setEndereco(enderecoProf);
		pessoa01.setCadastro(cadPessoa01);

		pessoa01.imprimir();
		pessoa01.setCadastro(null);
		System.out.println();
		
		Aluno aluno = new Aluno();
		Endereco enderecoAlu = new Endereco();
		
		Cadastro cadPessoa02 = new Cadastro();
		cadPessoa02.setAluno(aluno);		
		Pessoa pessoa02 = new Pessoa();
		
		pessoa02.setNome("Yasmmin");
		pessoa02.setCpf("123123");
		aluno.setAnoEntrada(2017);
		aluno.setPeriodoEntrada(20172);
		enderecoAlu.setRua("Rua Iracema");
		enderecoAlu.setNumero(27);
		enderecoAlu.setComplemento("A");
		enderecoAlu.setCidade("Olinda");
		pessoa02.setEndereco(enderecoAlu);
		pessoa02.setCadastro(cadPessoa02);
		
		
		pessoa02.imprimir();
		System.out.println();
		pessoa02.setCadastro(null);
		
		//cadastrando Yasmmin como professora agora
		
		
		cadPessoa02.setProfessor(professor);
		pessoa02.setCadastro(cadPessoa02);
		pessoa02.imprimir();
		System.out.println();
	
		

	}

}
