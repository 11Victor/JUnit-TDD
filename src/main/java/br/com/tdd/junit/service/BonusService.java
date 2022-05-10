package br.com.tdd.junit.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.tdd.junit.model.Funcionario;

public class BonusService {
	
	public BigDecimal calculaBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000"))>0) {
			throw new IllegalArgumentException("O funcionário possui salário maior que R$ 10.000,00 logo não recebe bonus!");
		}
		return valor.setScale(2, RoundingMode.HALF_UP);
	}
	
}
