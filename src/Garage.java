import java.util.ArrayList;
import java.util.List;

public class Garage {
	public List<Car> Cars = new ArrayList<>();
	public List<Motorbike> Motorbikes = new ArrayList<>();
	public List<Bus> Buses = new ArrayList<>();

	public static void main(String[] args) {

	}

	public void addVehicle(String type, String name, String[] args) {
		switch (type) {
		case "Car":
			Car newCar = new Car(args[0], args[1], args[2], args[3], Integer.parseInt(args[4]),
					Integer.parseInt(args[5]), Integer.parseInt(args[6]), Boolean.parseBoolean(args[7]));
			// String make, String model, String colour, String propultion, int speed, int
			// occupancy, int wheels, boolean isDirty
			Cars.add(newCar);
			break;
		case "Motorbike":
			Motorbike newMB = new Motorbike(args[0], args[1], args[2], args[3], Integer.parseInt(args[4]),
					Integer.parseInt(args[5]), Integer.parseInt(args[6]), Boolean.parseBoolean(args[7]));
			// String make, String model, String colour, String propultion, int speed, int
			// occupancy, int wheels, boolean isDirty
			Motorbikes.add(newMB);
			break;
		case "Bus":
			Bus newBus = new Bus(args[0], args[1], args[2], args[3], Integer.parseInt(args[4]),
					Integer.parseInt(args[5]), Integer.parseInt(args[6]), Boolean.parseBoolean(args[7]));
			// String make, String model, String colour, String propultion, int speed, int
			// occupancy, int wheels, boolean isDirty
			Buses.add(newBus);
			break;
		default:
			System.out.println("Error: Please Input a type of Vehicle");
		}
	}

	public void removeVehicle(String type, int ID) {
		switch (type) {
		case "Car":
			Cars.remove(ID);
			break;
		case "Motorbike":
			Motorbikes.remove(ID);
			break;
		case "Bus":
			Buses.remove(ID);
			break;
		default:
			System.out.println("Error: Please Input a type of Vehicle");
		}
	}

	public void calculateBills() {
		System.out.println("===== Cars =====");
		for (int i = 0; i < Cars.size(); i++) {
			System.out.println("ID:" + i + " " + Cars.get(i).toString());
			System.out.println("Bill is:" + Bill("Car", Cars.get(i)));
		}
		System.out.println("== Motorbikes ==");
		for (int i = 0; i < Motorbikes.size(); i++) {
			System.out.println("ID:" + i + " " + Motorbikes.get(i).toString());
			System.out.println("Bill is:" + Bill("Motorbike", Motorbikes.get(i)));
		}
		System.out.println("==== Buses  ====");
		for (int i = 0; i < Buses.size(); i++) {
			System.out.println("ID:" + i + " " + Buses.get(i).toString());
			System.out.println("Bill is:" + Bill("Bus", Buses.get(i)));
		}
	}

	public void fixVehicle(String type, int ID) {
		switch (type) {
		case "Car":
			System.out.println("ID:" + ID + " " + Cars.get(ID).toString());
			System.out.println("Bill is:" + Bill("Car", Cars.get(ID)));
			Cars.remove(ID);
			break;
		case "Motorbike":
			System.out.println("ID:" + ID + " " + Motorbikes.get(ID).toString());
			System.out.println("Bill is:" + Bill("Motorbike", Motorbikes.get(ID)));
			Motorbikes.remove(ID);
			break;
		case "Bus":
			System.out.println("ID:" + ID + " " + Buses.get(ID).toString());
			System.out.println("Bill is:" + Bill("Bus", Buses.get(ID)));
			Buses.remove(ID);
			break;
		default:
			System.out.println("Error: Please Input a type of Vehicle");
		}
	}

	public int Bill(String type, Vehicle vhcl) {
		switch (type) {
		case "Car":
			if (vhcl.getPropultion() == "diesel") {
				return ((int) (vhcl.getSpeed() * vhcl.getOccupancy() * 1.4));
			} else if (vhcl.getPropultion() == "electric" || vhcl.getPropultion() == "hybrid") {
				return (vhcl.getSpeed() * vhcl.getOccupancy() - 100);
			} else {
				return (vhcl.getSpeed() * vhcl.getOccupancy());
			}
		case "Motorbike":
			return (vhcl.getSpeed() * 5 * vhcl.getOccupancy());
		case "Bus":
			return (vhcl.getSpeed() * (vhcl.getOccupancy() / 6) + 200);
		default:
			return 0;
		}

	}

	public void ClearV(String type) {
		switch (type) {
		case "Car":
			Cars.clear();
			break;
		case "Motorbike":
			Motorbikes.clear();
			break;
		case "Bus":
			Buses.clear();
			break;
		}

	}
}
