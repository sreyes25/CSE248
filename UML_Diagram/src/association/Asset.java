package association;

public class Asset {
	private double value;
	private String type;
	private Bank bank;
	
	public Asset(Bank bank) {
		this.bank = bank;
	}
}
