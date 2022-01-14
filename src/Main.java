public class Main {

	public static void main(String[] args) {
		Garage g1 = new Garage();
		String[] a = { "bmw", "x4", "black", "petrol", "155", "5", "4", "false" };
		String[] b = { "tesla", "model y", "white", "electric", "155", "5", "4", "false" };
		String[] c = { "saab", "95", "grey", "diesel", "140", "5", "4", "True" };
		g1.addVehicle("Car", "Grov", a);
		g1.addVehicle("Car", "GFut", b);
		g1.addVehicle("Car", "Mari", c);
		g1.calculateBills();

	}
}
