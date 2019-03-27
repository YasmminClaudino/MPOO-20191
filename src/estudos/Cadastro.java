package estudos;
/*Classe cadastro criada pra integrar as classes
 * aluno e professor e poder fazer a mudança de 
 * associção em tempo de execução utilizando composição,
 * no qual pode setar um objeto do tipo aluno para ser professor ou vice e versa.
 * Dessa forma, podendo retirar a herança do código; 
 */
public class Cadastro {
	Aluno aluno;
	Professor professor;
	
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public void imprimeCadastro() {
		if(aluno != null) {
			System.out.println("Aluno: " );
			System.out.println();
			System.out.println("Ano entrada: " + aluno.anoEntrada());
			System.out.println("Periodo Entrada: " + aluno.periodoEntrada());
		} 
		if(professor != null) {
			System.out.println("Professor: ");
			System.out.println();
			System.out.println("Data de Admissão: " + professor.getAdimissao());
		}
		
			
		}
	}
