package tollboothassignment;


public class DaewooTruck implements Truck {
	private int axles;
	private int weight;
	private final String make = "Daewoo";
	public DaewooTruck(int axles, int weight) {
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
