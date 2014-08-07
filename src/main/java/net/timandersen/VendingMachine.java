package net.timandersen;

public class VendingMachine {

	private Double credit = 0.0;
	
	public void takeMoney(Double amount) {
		this.credit += amount;
	}

	public String displayCredit() {
		return "$"+ String.format("%.2f", credit);
	}

	public void selectProduct(String code) {
		credit = credit - 0.75;
	}

}
