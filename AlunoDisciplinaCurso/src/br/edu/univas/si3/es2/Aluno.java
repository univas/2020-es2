package br.edu.univas.si3.es2;

import java.util.ArrayList;

public class Aluno implements Pesquisador {

	private String nome;
	private int matricula;
	private int idade;
	
	private Curso curso;
	private ArrayList<Situacao> situacoes;
	
	public float calcularMediaGeral() {
		//TODO: implementar
		return 0f;
	}
	
	@Override
	public String gerarCurriculo() {
		//TODO: implementar
		return null;
	}
}
