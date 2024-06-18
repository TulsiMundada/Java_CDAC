package day4;

public class Consultant implements TaxPayer{
    private String name;
	private double invoice;
	
	
	public Consultant(String name, double invoice) {
		super();
		this.name = name;
		this.invoice = invoice;
	}


	@Override
	public String toString() {
		return "Consultant [name=" + name + ", invoice=" + invoice + "]";
	}


	@Override
	public double calculateTax() {
		return invoice * 0.1;
	}

}
