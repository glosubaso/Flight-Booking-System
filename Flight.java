
    package FlightBooking;

	public abstract class Flight implements verification {

		private int flightNumber;
		private final int MAX_CAPACITY = 863;
		private double price;
		private String from;
		private String destination;
		private int numSeats;

		private Airplane airplane ; 
		private Airport airport ;
		private Date date ;
		
		
		public Flight(int flightNumber, double price, String from, String destination, int numSeats,
                Airplane airplane, Airport airport, Date date) {
      this.flightNumber = flightNumber;
      this.price = price;
      this.from = from;
      this.destination = destination;
      this.numSeats = numSeats;
      this.airplane = airplane;
      this.airport = airport;
      this.date = date;
  }
		
			public Flight() {
				super();
			}
			

		public int getFlightNumber() {
				return flightNumber;
			}
			public void setFlightNumber(int flightNumber) {
				this.flightNumber = flightNumber;
			}
			public double getPrice() {
				return price;
			}
			public void setPrice(double price) {
				this.price = price;
			}
			public String getFrom() {
				return from;
			}
			public void setFrom(String from) {
				this.from = from;
			}
			public String getDestination() {
				return destination;
			}
			public void setDestination(String destination) {
				this.destination = destination;
			}
			public int getNumSeats() {
				return numSeats;
			}
			public void setNumSeats(int numSeats) {
				this.numSeats = numSeats;
			}
			public Airplane getAirplane() {
				return airplane;
			}
			public void setAirplane(Airplane airplane) {
				this.airplane = airplane;
			}
			public Airport getAirport() {
				return airport;
			}
			public void setAirport(Airport airport) {
				this.airport = airport;
			}
			public Date getDate() {
				return date;
			}
			public void setDate(Date date) {
				this.date = date;
			}
			public int getMAX_CAPACITY() {
				return MAX_CAPACITY;
			}
			
             @Override
			public String toString() {
				return " Flight Number:" + flightNumber + 
						"\n Max Capacity:" + MAX_CAPACITY +
						"\n Price:" + price
						+ "\n From:" + from +
						"\n Destination:" + destination +
						"\n Number of Seats:" + numSeats + 
						"\n Airplane:"
						+ airplane + "\n Airport:" +
						airport + "\n Date:" +
						date ;
			}
             
             
public abstract double calcFlightCost();




@Override
public boolean CheckAvailable() {
if (numSeats > MAX_CAPACITY) {
	this.numSeats = MAX_CAPACITY;
	return false ;
}else {
	this.numSeats = numSeats;
	return true ;
}

}}
