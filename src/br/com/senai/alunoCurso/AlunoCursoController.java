package br.com.senai.alunoCurso;

import java.util.List;
import java.util.Scanner;

import br.com.senai.aluno.Aluno;
import br.com.senai.aluno.AlunoController;
import br.com.senai.cursos.NomeCursoController;
import br.com.senai.cursos.NomeCursos;

public class AlunoCursoController {
	
	private Scanner tec;
	private AlunoController alunoController;
	private NomeCursoController nomeCursoController;
	
	public AlunoCursoController() {
		tec = new Scanner(System.in);
		alunoController = new AlunoController();
		nomeCursoController = new NomeCursoController();
		
	}
	
	public int leOpcao() {
		System.out.println("> ");
		return tec.nextInt();
		
	}
	
	public List<AlunoCurso> listarAlunoCurso(List<AlunoCurso> alunoCurso){
		
		System.out.println("---- Cursos Cadatrados ----");
		
		System.out.printf("| %2s | %10s | %10s |\n", "id", "Aluno", "Curso");
		System.out.println("-----------------------------------------------------------------"
				+ "--------------------------------------------------------------------------");
		for(int i = 0; i < alunoCurso.size(); i++) {
			System.out.printf("| %2s | %10s | %10s |\n",
					i + 1, alunoCurso.get(i).getAluno().getNomeAluno(),
					alunoCurso.get(i).getNomeCurso().getNomeCursos());

	}
		return alunoCurso;
	}
	
	public AlunoCurso cadastrarAlunoCurso(List<NomeCursos> nomeCursos, List<Aluno> alunos) {
		
		if(nomeCursos.isEmpty() || alunos.isEmpty()) {
			System.out.println("Impossivel realizar cadastro sem Alunos e Cursos Listados.");
			return null;
	    }
		alunoController.listarAlunos(alunos);
		nomeCursoController.listarCursos(nomeCursos);
		
		AlunoCurso alunoCurso = new AlunoCurso();
		NomeCursos nomeCursos2 = new NomeCursos();
		Aluno aluno = new Aluno();
		
		System.out.println("Informe o id do Aluno: ");
		int idAluno = tec.nextInt() - 1;
		
		aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
		aluno.setAnoDeNascimento(alunos.get(idAluno).getAnoDeNascimento());
		
		alunoCurso.setAluno(aluno);
		
		System.out.println("Infomre o id do Curso: ");
		int idCurso = tec.nextInt() - 1;
		
		nomeCursos2.setNomeCursos(nomeCursos.get(idCurso).getNomeCursos());
		
		alunoCurso.setNomeCurso(nomeCursos2);
		
		return alunoCurso;
	}
	
		public void excluirAlunoCurso(List<AlunoCurso> alunoCurso) {
		
			listarAlunoCurso(alunoCurso);
			if(alunoCurso.isEmpty()) {
				return;
		}
			System.out.println("---- Excluir Curso com aluno ----");
		
			System.out.println("Infomre o id do Curso com aluno para excluir: ");
			int idCurso = tec.nextInt() - 1;
		
			if(alunoCurso.size() != idCurso) {
				System.out.println("Impossivel excluir o curso.");
				return;
			}
			
			alunoCurso.remove(idCurso);
		}

	public void menu(List<AlunoCurso> alunoCurso, List<NomeCursos> nomeCursos, List<Aluno> alunos){
			
		System.out.println("\n************ MENU ***********");
		System.out.println("1) Cadastrar Alunos e Cursos");
		System.out.println("2) Listar Cursos com alunos");
		System.out.println("3) Excluir Curso com aluno Listado");
			
		int opcao = tec.nextInt();
		switch (opcao) {
			
		case 1:
			alunoCurso.add(cadastrarAlunoCurso(nomeCursos, alunos));
			break;
				
		case 2:
			listarAlunoCurso(alunoCurso);
			break;
			
		case 3:
			excluirAlunoCurso(alunoCurso);
			break;
				
		default:
			System.out.println("Opção Incorreta");
			break;
			}
				
		}
		
		

}
