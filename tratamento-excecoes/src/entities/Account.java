package entities;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
	
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalane() {
		return balance;
	}

	public void setBalane(Double balane) {
		this.balance = balane;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	

	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public String validateWithdraw(double amount) {
		if(amount > getWithdrawLimit()) {
			return "Erro de saque: A quantia excede o limite de saque";
			
		}
		if(amount > getBalane()) {
			return "Erro de saqaue: Saldo insuficiente";
		}
		return null;	
	}
	
	
}
