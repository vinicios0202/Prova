package br.com.senai;


import java.util.ArrayList;
import java.util.List;

import br.com.senai.aluno.Aluno;
import br.com.senai.aluno.AlunoController;
import br.com.senai.cursos.NomeCursoController;
import br.com.senai.cursos.NomeCursos;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<>();
		List<NomeCursos> nomeCursos = new ArrayList<>();
		
		AlunoController alunoController = new AlunoController();
		NomeCursoController nomeCursoController = new NomeCursoController();
		
		boolean sair = false;
		
		do {
			System.out.println("\n-------- MENU ---------");
			System.out.println("1) Menu de Alunos");
			System.out.println("2) Menu de Cursos");

			int opcao = alunoController.leOpcao();
			
			switch(opcao){
			
				case 1:
					alunoController.menu(alunos);
					break;

				case 2:
					nomeCursoController.menu(nomeCursos);
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
			
		
		
	
		
