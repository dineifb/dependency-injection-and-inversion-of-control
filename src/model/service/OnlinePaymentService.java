package model.service;

public interface OnlinePaymentService {
	
	public Double paymentFee(double amount);
	public Double interest(Double amount, int months);

}
