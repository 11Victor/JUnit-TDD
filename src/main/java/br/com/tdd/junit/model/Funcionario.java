package br.com.tdd.junit.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "dataAdmisssao")
	private LocalDate dataAdmisssao;

	@Column(name = "salario")
	private BigDecimal salario;

	public Funcionario(long id, String nome, LocalDate dataAdmisssao, BigDecimal salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataAdmisssao = dataAdmisssao;
		this.salario = salario;
	}

	public Funcionario() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataAdmisssao() {
		return dataAdmisssao;
	}

	public void setDataAdmisssao(LocalDate dataAdmisssao) {
		this.dataAdmisssao = dataAdmisssao;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public void reajustarSalario(BigDecimal reajuste) {
		this.salario = this.salario.add(reajuste);
		arredondarSalario();
	}

	private void arredondarSalario() {
		this.salario = this.salario.setScale(2, RoundingMode.HALF_UP);
	}

}
