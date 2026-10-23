
package FlightBooking;

public class BusinessClass extends Flight {
	
	private boolean haveGift ;

	public BusinessClass() {
		super();
	}

	public BusinessClass(int flightNumber, double price, String from, String destination, int numSeats,
			Airplane airplane, Airport airport, Date date, boolean haveGift) {
		
		this.haveGift=haveGift;
	}

	public boolean getHaveGift() {
		return haveGift;
	}

	public void setHaveGift(boolean haveGift) {
		this.haveGift = haveGift;
	}

	@Override
	public String toString() {
		
		return "Bussins Class ["+ super.toString()+"  Have a Gift:" + haveGift + "]";
		
	}

	@Override
	public double calcFlightCost() {
		 double cost2 = getPrice();
	        if (haveGift == true) {
	        	System.out.println( "Have a Gift ? Yes");
	          return   cost2 += 250;
	        }
	        else {
	        	System.out.println( "Have Gift ? No");
		        return cost2;	
	        }}}
	



