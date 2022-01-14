
public abstract class Vehicle {

	private String make;
	private String model;
	private String colour;
	private String propultion;
	private int speed;
	private int occupancy;
	private int wheels;
	private boolean isDirty;

	public static void main(String[] args) {

	}

	public abstract void exampleMethod();

	public Vehicle() {

	}

	public Vehicle(String make, String model, String colour, String propultion, int speed, int occupancy, int wheels,
			boolean isDirty) {
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.propultion = propultion;
		this.speed = speed;
		this.occupancy = occupancy;
		this.wheels = wheels;
		this.isDirty = isDirty;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getPropultion() {
		return propultion;
	}

	public void setPropultion(String propultion) {
		this.propultion = propultion;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getOccupancy() {
		return occupancy;
	}

	public void setOccupancy(int occupancy) {
		this.occupancy = occupancy;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public boolean isDirty() {
		return isDirty;
	}

	public void setDirty(boolean isDirty) {
		this.isDirty = isDirty;
	}

}
