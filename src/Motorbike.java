
public class Motorbike extends Vehicle {

	public static void main(String[] args) {

	}

	public void exampleMethod() {

	}

	public Motorbike() {

	}

	public Motorbike(String make, String model, String colour, String propultion, int speed, int occupancy, int wheels,
			boolean isDirty) {
		super(make, model, colour, propultion, speed, occupancy, wheels, isDirty);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car [getMake()=" + getMake() + ", getModel()=" + getModel() + ", getColour()=" + getColour()
				+ ", getPropultion()=" + getPropultion() + ", getSpeed()=" + getSpeed() + ", getOccupancy()="
				+ getOccupancy() + ", getWheels()=" + getWheels() + ", isDirty()=" + isDirty() + "]";
	}
}
