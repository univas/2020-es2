package br.edu.univas.si3.es2;

import java.util.ArrayList;

public class Professor extends Colaborador implements Pesquisador {

	private String maiorTitulacao;
	private float valorDaHora;
	
	private ArrayList<Disciplina> disciplinas;
	
	public float calcularCargaHoraria() {
		// TODO: implementar
		return 0f;
	}
	
	@Override
	public String gerarCurriculo() {
		// TODO: implementar
		return null;
	}
	
	@Override
	public float calcularSalario() {
		// TODO: implementar
		return 0;
	}
}
