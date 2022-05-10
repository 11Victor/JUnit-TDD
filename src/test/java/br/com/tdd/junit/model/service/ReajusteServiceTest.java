package br.com.tdd.junit.model.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.tdd.junit.enums.Desempenho;
import br.com.tdd.junit.model.Funcionario;
import br.com.tdd.junit.service.ReajusteService;

class ReajusteServiceTest {

	private ReajusteService service;
	private Funcionario funcionario;

	// A anotação Before Each roda antes de cada teste
	@BeforeEach
	public void inicialização() {
		System.out.println("Inicialização!");
		this.service = new ReajusteService();
		this.funcionario = new Funcionario(0L, "Victor", LocalDate.now(), new BigDecimal("1000"));
	}

	// A anotação After Each roda após cada teste
	@AfterEach
	public void finalizar() {
		System.out.println("Teste realizado!");
	}

	// A anotação Before All roda antes de todos testes
	@BeforeAll
	public static void antesDeTodos() {
		System.out.println("Antes de Todos!!");
	}

	// A anotação After All roda depois de todos testes
	@AfterAll
	public static void depoisDeTodos() {
		System.out.println("Depois de Todos!!");
	}

	@Test
	public void reajusteTresPorcentoDesempenhoADesejar() {
		service.concederReajuste(funcionario, Desempenho.A_Desejar);
		Assertions.assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}

	@Test
	public void reajusteQuinzePorcentoDesempenhoBom() {
		service.concederReajuste(funcionario, Desempenho.Bom);
		Assertions.assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}

	@Test
	public void reajusteOtimoPorcentoDesempenhoOtimo() {
		service.concederReajuste(funcionario, Desempenho.Otimo);
		Assertions.assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}

}
