package estudos;

public class Application {

	public static void main(String[] args) {
		Professor professor = new Professor();
		Aluno aluno = new Aluno();
		Endereco enderecoProf = new Endereco();
		Endereco enderecoAlu = new Endereco();
		
		professor.setNome("Gabriel");
		professor.setCpf("123123");
		//professor.setAdimissao(2018/29/12);
		enderecoProf.setRua("Rua imaginaria");
		enderecoProf.setNumero(23);
		enderecoProf.setComplemento("B");
		enderecoProf.setCidade("Recife");
		professor.setEndereco(enderecoProf);

		professor.imprimir();
		
		aluno.setNome("Yasmmin");
		aluno.setCpf("123123");
		aluno.setAnoEntrada(2017);
		aluno.setPeriodoEntrada(20172);
		enderecoAlu.setRua("Rua Iracema");
		enderecoAlu.setNumero(27);
		enderecoAlu.setComplemento("A");
		enderecoAlu.setCidade("Olinda");
		aluno.setEndereco(enderecoAlu);
		

	}

}
