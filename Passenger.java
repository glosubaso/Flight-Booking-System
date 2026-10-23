package FlightBooking;

public class Passenger {
	private  String Name ;
	private  int IDnum ;
	private  int PassportNum  ;
	
	public Passenger(String name, int iDnum, int passportNum2) {
		Name = name;
		IDnum = iDnum;
		PassportNum = passportNum2;
	}
	
	public Passenger() {
		super();
	}

	
	

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getIDnum() {
		return IDnum;
	}
	public void setIDnum(int iDnum) {
		IDnum = iDnum;
	}
	public int getPassportNum() {
		return PassportNum;
	}
	public void setPassportNum(int passportNum) {
		PassportNum = passportNum;
	}
	@Override
	public String toString() {
		return "Passenger information "
				+ "[\n Name:" + Name + 
				"\n ID Number:" + IDnum + 
				"\n Passport Number:" + PassportNum + "]";
	}

}
