package tollboothassignment;


public class FordTruck implements Truck {
	private int axles;
	private int weight; // in kg
	private final String make = "Ford";
	public FordTruck(int axles, int weight) {
		this.axles = axles;
		this.weight = weight;
	}

	@Override
	public int getAxles() {
		return axles;
	}
	@Override
	public int getWeight() {
		return weight;
	}
	
	@Override
	public String getMake() {
		return make;
	}
}
