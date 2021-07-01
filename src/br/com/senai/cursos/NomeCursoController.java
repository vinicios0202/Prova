package br.com.senai.cursos;

import java.util.List;
import java.util.Scanner;

public class NomeCursoController {
	

	private Scanner tec;

	public NomeCursoController() {
		tec = new Scanner(System.in);
	}

	public int leOpcao() {
		System.out.print("> ");
		return tec.nextInt();
	}
	
	public NomeCursos cadastrarCursos() {
		NomeCursos nomeCurso = new NomeCursos();
		
		System.out.println("--- CADASTRAR CURSOS ---");
		
		System.out.println("Nome do Curso: ");
		nomeCurso.setNomeCursos(tec.next());
		
		return nomeCurso;
		
	}
	
	public List<NomeCursos> listarCursos(List<NomeCursos> nomeCursos) {
		
		if(nomeCursos.isEmpty()) {
			System.out.println("Não Possui produtos listados.");
			return null;
		}
		
		System.out.println("---- CURSOS CADASTRADOS ----");

		System.out.printf("| %2s | %10s |\n", "id", "Curso");
		System.out.println(" -------------------------------------------------");
		for (int i = 0; i < nomeCursos.size(); i++) {
			System.out.printf("| %2d | %10s |\n",
					i + 1,
					nomeCursos.get(i).getNomeCursos());
			
		}
		
		return nomeCursos;
	}
	
	public List<NomeCursos> editarCursos(List<NomeCursos> nomeCursos) {
		
		NomeCursos nomeCursos2 = new NomeCursos();
		listarCursos(nomeCursos);
		
		if(nomeCursos.isEmpty()) {
			return null;
		}
		
		System.out.println("Informe o Id do Curso para editar: ");
		int idCurso = tec.nextInt() - 1;
		
		System.out.println("1) Nome do Curso");
		int opcao = tec.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("--- EDITAR CURSO ---");
			System.out.println("informe o novo nome do curso: ");
			nomeCursos2.setNomeCursos(tec.next());
			
			nomeCursos.set(idCurso, nomeCursos2);
			break;
			
		default:
			System.out.println("Opção inválida");
			break;
		}
		return nomeCursos;
		
	}
	public void excluirCurso(List<NomeCursos> nomeCursos) {
		
		listarCursos(nomeCursos);
		if(nomeCursos.isEmpty()) {
			return;
		}
		System.out.println("----Excluir Curso ----");
		
		System.out.println("Infomre o id do Curso para excluir: ");
		int idCurso = tec.nextInt() - 1;
		
		if(nomeCursos.size() <= idCurso) {
			System.out.println("Curso não cadastrado.");
			return;
		}
		
		nomeCursos.remove(idCurso);
	}
	public void menu(List<NomeCursos> nomeCursos){
		System.out.print("\n-------- MENU ---------");
		System.out.print("1) Cadastrar Cursos");
		System.out.print("2) Listar Cursos");
		
		int opcao = tec.nextInt();
		switch (opcao) {
		}
		}
}
