package br.com.senai;


import java.util.ArrayList;
import java.util.List;

import br.com.senai.aluno.Aluno;
import br.com.senai.aluno.AlunoController;
import br.com.senai.alunoCurso.AlunoCurso;
import br.com.senai.alunoCurso.AlunoCursoController;
import br.com.senai.cursos.NomeCursoController;
import br.com.senai.cursos.NomeCursos;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<>();
		List<NomeCursos> nomeCursos = new ArrayList<>();
		List<AlunoCurso> alunoCurso = new ArrayList<>();
		
		AlunoController alunoController = new AlunoController();
		NomeCursoController nomeCursoController = new NomeCursoController();
		AlunoCursoController alunoCursoController = new AlunoCursoController();
		
		boolean sair = false;
		
		do {
			System.out.println("\n************ MENU ************");
			System.out.println("1) Menu de Alunos");
			System.out.println("2) Menu de Cursos");
			System.out.println("3) Menu de AlunoCurso");
			System.out.println("0) sair");

			int opcao = alunoController.leOpcao();
			
			switch(opcao){
			
				case 1:
					alunoController.menu(alunos);
					break;

				case 2:
					nomeCursoController.menu(nomeCursos);
					break;
					
				case 3:
					alunoCursoController.menu(alunoCurso, nomeCursos, alunos);
					break;
					
				case 0:
					sair = true;
					break;
					
				default:
					System.out.println("Opção Inválida");
					break;
			}
		}while(!sair);
		
		System.out.println("Sistema Finalizado!");
	}
}
			
		
		
	
		
