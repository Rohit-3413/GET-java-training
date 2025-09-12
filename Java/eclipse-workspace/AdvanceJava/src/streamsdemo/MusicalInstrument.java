package streamsdemo;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 12, 2025
 * Time     :10:36:41 AM
 * project  :AdvanceJava
*/

public class MusicalInstrument {
	
	private String name;
	private String type;
	private double price;
	
	public MusicalInstrument(String name, String type, double price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MusicalInstrument [name=" + name + ", type=" + type + ", price=" + price + "]";
	}
	
}
