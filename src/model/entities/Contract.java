package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	
	private int number;
	private LocalDate date;
	private double totalValue;
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	List<Installment> installments = new ArrayList<>();
	
	public Contract() {
		
	}

	public Contract(int number, LocalDate date, double totalValue) {

		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	public void setInstallments(List<Installment> installments) {
		this.installments = installments;
	}

	@Override
	public String toString() {
		return "Contract number : " 
				+ number 
				+ ", date : " 
				+ dtf.format(date) 
				+ ", totalValue : " 
				+ String.format("%.2f", totalValue);
	}
	
	
	
	
	
	
	
	

}
