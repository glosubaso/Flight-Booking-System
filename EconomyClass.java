
package FlightBooking;

public class EconomyClass extends Flight {

	private boolean haveMeal;

	public EconomyClass(int flightNumber, double price, String from, String destination, int numSeats,
			Airplane airplane, Airport airport, Date date, boolean someFlag) {
		super();
		this.haveMeal = someFlag;
	}

	public EconomyClass() {
		super();
	}

	public boolean getHaveMeal() {
		return haveMeal;
	}

	public void setHaveMeal(boolean haveMeal) {
		this.haveMeal = haveMeal;
	}

	@Override
	public String toString() {

		return " Economy Class  [" + super.toString() + " Have a  Meal:" + haveMeal + "]";

	}

	@Override
	public double calcFlightCost() {
		double cost3 = getPrice();
		if (haveMeal == true) {
			System.out.println("Have a Meal? Yes");
			return cost3 += 99;
		} else {
			System.out.println("Have a Meal? No");
			return cost3;
		}
	}

}
