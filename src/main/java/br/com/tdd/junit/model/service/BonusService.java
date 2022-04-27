package br.com.tdd.junit.model.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.tdd.junit.model.Funcionario;

public class BonusService {
	
	public BigDecimal calculaBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000"))>0) {
			valor = BigDecimal.ZERO;
		}
		return valor.setScale(2, RoundingMode.HALF_UP);
	}
	
}
