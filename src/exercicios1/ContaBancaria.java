package exercicios1;

public class ContaBancaria {
	 private Integer numeroConta;
	 private String nomeTitular;
	 private Double saldo;

	public ContaBancaria(Integer numeroConta, String nomeTitular, Double saldo) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void depositar(Double valorParaAdicionar) {
		this.saldo += valorParaAdicionar;
	}

	public void sacar(Double valorParaSacar) {
		if(!(valorParaSacar > saldo)) {
			this.saldo -= valorParaSacar;
		}
	}

}
