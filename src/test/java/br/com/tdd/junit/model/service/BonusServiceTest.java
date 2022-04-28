package br.com.tdd.junit.model.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.tdd.junit.model.Funcionario;

class BonusServiceTest {

	@Test
	void bonusZeroParaFuncionarioComSalarioAlto() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calculaBonus(new Funcionario(0L, "Victor", LocalDate.now(), new BigDecimal("35000")));
		Assertions.assertEquals(new BigDecimal("0.00"), bonus);
	}
	
	@Test
	void bonus10PorCentoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calculaBonus(new Funcionario(0L, "Victor", LocalDate.now(), new BigDecimal("3500")));
		Assertions.assertEquals(new BigDecimal("350.00"), bonus);
	}
	
	@Test
	void bonusExatamente1000() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calculaBonus(new Funcionario(0L, "Victor", LocalDate.now(), new BigDecimal("10000")));
		Assertions.assertEquals(new BigDecimal("1000.00"), bonus);
	}
	
}
