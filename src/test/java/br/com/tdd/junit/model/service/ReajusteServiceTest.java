package br.com.tdd.junit.model.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.tdd.junit.enums.Desempenho;
import br.com.tdd.junit.model.Funcionario;
import br.com.tdd.junit.service.ReajusteService;

class ReajusteServiceTest {

	@Test
	public void reajusteTresPorcentoDesempenhoADesejar() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario(0L, "Victor", LocalDate.now(), new BigDecimal("1000"));
		
		service.concederReajuste(funcionario, Desempenho.A_Desejar);
		
		Assertions.assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}
	
	@Test
	public void reajusteQuinzePorcentoDesempenhoBom() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario(0L, "Stephany", LocalDate.now(), new BigDecimal("1000"));
		
		service.concederReajuste(funcionario, Desempenho.Bom);
		
		Assertions.assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}
	
	@Test
	public void reajusteOtimoPorcentoDesempenhoOtimo() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario(0L, "Vera", LocalDate.now(), new BigDecimal("1000"));
		
		service.concederReajuste(funcionario, Desempenho.Otimo);
		
		Assertions.assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}

}
