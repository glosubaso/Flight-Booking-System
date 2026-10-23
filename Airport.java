package FlightBooking;

public class Airport  {
	private String Name ;
	private  String City ;
	
	
	
	public Airport(String name, String city) {
		Name = name;
		City = city;
	}
	
	public Airport() {
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
	    return String.format("Airport Name is %s%s"
	    		+ "\n City is = %s%n", Name, City);
	}}

