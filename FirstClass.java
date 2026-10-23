

package FlightBooking;

public class FirstClass extends Flight  {
	
	private boolean haveFancyMeal;

	
	public FirstClass() {
		super();
	}

	public FirstClass(int flightNumber, double price, String from, String destination, int numSeats, Airplane airplane,
			Airport airport, Date date, boolean haveFancyMeal) {
		super();
		this.haveFancyMeal=haveFancyMeal;
	}

	public boolean getHaveFancyMeal() {
		return haveFancyMeal;
	}

	public void setHaveFancyMeal(boolean haveFancyMeal) {
		this.haveFancyMeal = haveFancyMeal;
	}

	
	@Override
	public String toString() {
		
		return "First Class ["+ super.toString()+" Fancy Meal:" + haveFancyMeal + "]";
		
	}

	

	@Override
	public double  calcFlightCost() {
		 double cost = getPrice();
	        if (haveFancyMeal == true) {
	        	System.out.println( "Have Fancy Meal? Yes");
	          return   cost += 199;
	        }
	        else {
	        	System.out.println( "Have Fancy Meal? No");
		        return cost;	
	        }}
	       
	


	public static double luggageWeight () {
		double weight  = 23.5; 
		return weight ;
		}}



