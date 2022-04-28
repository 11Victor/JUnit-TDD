package br.com.tdd.junit.model.service;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.tdd.junit.model.Funcionario;

class ReajusteServiceTest {

	@Test
	public void reajusteTresPorcentoDesempenhoADesejar() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario(0L, "Ana", LocalDate.now(), new BigDecimal("1000"));
		
		service.concederReajuste(funcionario, Desempenho.A_Desejar);
		
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}

}
