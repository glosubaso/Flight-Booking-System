package FlightBooking;

class Airplane  {
    
private String airplaneCompany;
private String Type;




public Airplane(String airplaneCompany, String type) {
	super();
	this.airplaneCompany = airplaneCompany;
	Type = type;
}



public Airplane() {
}


public String getAirplaneCompany() {
	return airplaneCompany;
}



public void setAirplaneCompany(String airplaneCompany) {
	this.airplaneCompany = airplaneCompany;
}



public String getType() {
	return Type;
}

public void setType(String type) {
	Type = type;
}

@Override
public String toString() {
	return "Airplane information [\n airplane Company:" + airplaneCompany + 
			"\n Type:" + Type  + "]";
}

}