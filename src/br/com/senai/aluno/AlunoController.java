package br.com.senai.aluno;

import java.util.List;
import java.util.Scanner;

public class AlunoController {
	
	private Scanner tec;
	
	public  AlunoController() {
		tec = new Scanner(System.in);
	}
	
	public int leOpcao() {
		System.out.print("> ");
		return tec.nextInt();
	
	}
	
	public Aluno cadastrarAluno() {
		Aluno aluno = new Aluno();
		
		System.out.println("--- CADASTRAR ALUNO ---");
		System.out.println("informe o nome: ");
		tec.nextLine();
		aluno.setNomeAluno(tec.nextLine());
		
		System.out.println("Informe o ano de Nascimento: ");
		aluno.setAnoDeNascimento(tec.nextInt());
		
		System.out.println("informe o País: ");
		tec.nextLine();
		aluno.setNomeDoPais(tec.nextLine());
		
		System.out.println("informe a sigla do pais: ");
		aluno.setSiglaDoPais(tec.nextLine());
		
		System.out.println("informe o Estado: ");
		aluno.setNomeDoEstado(tec.nextLine());
		
		System.out.println("informe o UF do Estado: ");
		aluno.setUf(tec.nextLine());
		
		System.out.println("informe a cidade: ");
		aluno.setNomeDaCidade(tec.nextLine());
		
		return aluno;
		
	}
	
	public List<Aluno> listarAlunos(List<Aluno> alunos) {
		
		if (alunos.isEmpty()) {
			System.out.println("Não possui dados para listar.");
			return null;
		}
		
		System.out.println("--- ALUNOS CADASTRADOS ---");
		
		System.out.printf(
				"| %2s | %8s | %4s | %5s | %6s | %6s | %5s | %10s | %5s |\n", "id", "Nome", "Ano", "Idade",
				"Pais", "Sigla", "Estado", "UF", "Cidade");
		System.out.println("---------------------------------------------------------------------------------------");
		for (int i = 0; i < alunos.size(); i++) {
			System.out.printf(
					"| %2s | %8s | %4d | %5d | %6.2f | %6s | %5s | %10s | %5s |\n",
					i + 1, alunos.get(i).getNomeAluno(), alunos.get(i).getAnoDeNascimento(), alunos.get(i).getIdadeAluno(),
					alunos.get(i).getNomeDoPais(), alunos.get(i).getSiglaDoPais(), alunos.get(i).getNomeDoEstado(),
					alunos.get(i).getUf(), alunos.get(i).getNomeDaCidade());
			
		}
		
		return alunos;
	}
	
	public List<Aluno> editarAlunos(List<Aluno> alunos) {

		Aluno aluno = new Aluno();
		listarAlunos(alunos);

		if (alunos.isEmpty()) {
			return null;
		}
		
		System.out.println("Informe o Id do aluno para ser editado:  ");
		int idAluno = tec.nextInt() - 1;
		
		System.out.println("1) Nome do aluno");
		System.out.println("2) Ano de Nascimento");
		
		
		int opcao = tec.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("--- EDITAR NOVO NOME ---");
			System.out.println("Informe o novo nome do aluno: ");
			aluno.setNomeAluno(tec.next());
			
			aluno.setAnoDeNascimento(alunos.get(idAluno).getAnoDeNascimento());
			aluno.setNomeDoPais(alunos.get(idAluno).getNomeDoPais());
			aluno.setSiglaDoPais(alunos.get(idAluno).getSiglaDoPais());
			aluno.setNomeDoEstado(alunos.get(idAluno).getNomeDoEstado());
			aluno.setUf(alunos.get(idAluno).getUf());
			aluno.setNomeDaCidade(alunos.get(idAluno).getNomeDaCidade());
			
			alunos.set(idAluno, aluno);
			break;
			
		case 2:
			System.out.println("--- EDITAR DATA DE NASCIMENTO ---");
			System.out.println("Informe a nova data: ");
			aluno.setAnoDeNascimento(tec.nextInt());
			
			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setNomeDoPais(alunos.get(idAluno).getNomeDoPais());
			aluno.setSiglaDoPais(alunos.get(idAluno).getSiglaDoPais());
			aluno.setNomeDoEstado(alunos.get(idAluno).getNomeDoEstado());
			aluno.setUf(alunos.get(idAluno).getUf());
			aluno.setNomeDaCidade(alunos.get(idAluno).getNomeDaCidade());
			
			alunos.set(idAluno, aluno);
			break;
			
		case 3:
			System.out.println("--- EDITAR PAIS ---");
			System.out.println("Informe o novo pais: ");
			aluno.setNomeDoPais(tec.next());
			
			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setAnoDeNascimento(alunos.get(idAluno).getAnoDeNascimento());
			aluno.setSiglaDoPais(alunos.get(idAluno).getSiglaDoPais());
			aluno.setNomeDoEstado(alunos.get(idAluno).getNomeDoEstado());
			aluno.setUf(alunos.get(idAluno).getUf());
			aluno.setNomeDaCidade(alunos.get(idAluno).getNomeDaCidade());
			
			alunos.set(idAluno, aluno);
			break;
			
		case 4:
			System.out.println("--- EDITAR SIGLA ---");
			System.out.println("Informe a nova sigla");
			aluno.setSiglaDoPais(tec.next());
			
			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setAnoDeNascimento(alunos.get(idAluno).getAnoDeNascimento());
			aluno.setNomeDoPais(alunos.get(idAluno).getNomeDoPais());
			aluno.setNomeDoEstado(alunos.get(idAluno).getNomeDoEstado());
			aluno.setUf(alunos.get(idAluno).getUf());
			aluno.setNomeDaCidade(alunos.get(idAluno).getNomeDaCidade());
			
			alunos.set(idAluno, aluno);
			break;
			
		case 5:
			System.out.println("--- EDITAR ESTADO ---");
			System.out.println("Informe o novo Estado");
			aluno.setNomeDoEstado(tec.next());
			
			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setAnoDeNascimento(alunos.get(idAluno).getAnoDeNascimento());
			aluno.setNomeDoPais(alunos.get(idAluno).getNomeDoPais());
			aluno.setSiglaDoPais(alunos.get(idAluno).getSiglaDoPais());
			aluno.setUf(alunos.get(idAluno).getUf());
			aluno.setNomeDaCidade(alunos.get(idAluno).getNomeDaCidade());
			
			alunos.set(idAluno, aluno);
			break;
			
		case 6:
			System.out.println("--- EDITAR UF ---");
			System.out.println("Informe novo UF");
			aluno.setUf(tec.next());
			
			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setAnoDeNascimento(alunos.get(idAluno).getAnoDeNascimento());
			aluno.setNomeDoPais(alunos.get(idAluno).getNomeDoPais());
			aluno.setSiglaDoPais(alunos.get(idAluno).getSiglaDoPais());
			aluno.setNomeDoEstado(alunos.get(idAluno).getNomeDoEstado());
			aluno.setNomeDaCidade(alunos.get(idAluno).getNomeDaCidade());
			
			alunos.set(idAluno, aluno);
			break;
			
		case 7:
			System.out.println("--- EDITAR CIDADE ---");
			System.out.println("Informe nova cidade");
			aluno.setNomeDaCidade(tec.next());
			
			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setAnoDeNascimento(alunos.get(idAluno).getAnoDeNascimento());
			aluno.setNomeDoPais(alunos.get(idAluno).getNomeDoPais());
			aluno.setSiglaDoPais(alunos.get(idAluno).getSiglaDoPais());
			aluno.setNomeDoEstado(alunos.get(idAluno).getNomeDoEstado());
			aluno.setUf(alunos.get(idAluno).getUf());
			
			alunos.set(idAluno, aluno);
			break;
			
		default:
			System.out.println("Opção Invalida");
			break;
			
		}
		return alunos;
	}
	
		public void excluirAluno(List<Aluno> alunos) {
		
			listarAlunos(alunos);
			if(alunos.isEmpty()) {
				return;
		}
			System.out.println("----Excluir Aluno----");
		
			System.out.println("Informe o id do Aluno para excluir: ");
			int idAluno = tec.nextInt() - 1;
		
			if(alunos.size() <= idAluno) {
				System.out.println("Aluno não cadastrado.");
				return;
		}
			
			alunos.remove(idAluno);
			
		}
		
		public void menu(List<Aluno> alunos) {
			System.out.println("\n********* MENU *********");
			System.out.println("1) Cadastrar Aluno");
			System.out.println("2) Listar Alunos");
			System.out.println("3) Editar Alunos");
			System.out.println("4) excluir Alunos");

			System.out.println("Informe a opção desejada: ");
		}
			
	
	
	
					
		

}
