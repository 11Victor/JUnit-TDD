package br.com.tdd.junit.service;

import java.math.BigDecimal;

import br.com.tdd.junit.enums.Desempenho;
import br.com.tdd.junit.model.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
		if (desempenho == Desempenho.A_Desejar) {
			BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
			funcionario.reajustarSalario(reajuste);
		}
		
	}

}
