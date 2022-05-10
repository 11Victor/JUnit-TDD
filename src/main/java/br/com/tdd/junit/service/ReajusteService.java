package br.com.tdd.junit.service;

import java.math.BigDecimal;

import br.com.tdd.junit.enums.Desempenho;
import br.com.tdd.junit.model.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
			BigDecimal percentual = desempenho.percentualReajuste();
			BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
			funcionario.reajustarSalario(reajuste);
	}

}