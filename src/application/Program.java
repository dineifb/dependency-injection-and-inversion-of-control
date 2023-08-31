package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;
import model.service.PaypalService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter contract datas");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date: ");
		LocalDate date = LocalDate.parse(sc.next(),dtf);
		System.out.print("Contract value: ");
		double value = sc.nextDouble();
		
		Contract contract = new Contract(number, date, value);
		
		//System.out.println(contract);
		
		System.out.print("Enter quantity of installments: ");
		int installments = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, installments);
		
		System.out.println();
		System.out.println("Installments");
		for(Installment i : contract.getInstallments()) {
			System.out.println(i);
		}
		
		
		
		sc.close();
	}

}
