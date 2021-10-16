package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Informe os dados da conta");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double balance = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double withdrawLimit = sc.nextDouble();
		
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		System.out.print("\nInforme uma quantia para sacar: ");
		double amount = sc.nextDouble();
		
		String error = acc.validateWithdraw(amount);
		if(error != null) {
			System.out.println(error);
		}else {
			acc.withdraw(amount);
			System.out.printf("Novo saldo: %.2f\n",  acc.getBalane());
			//System.out.printf("Novo saldo: " + String.format("%.2f", acc.getBalane()));
	
		}

		sc.close();
		
	}

}
