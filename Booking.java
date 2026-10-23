
package FlightBooking;

import java.util.Arrays;

public class Booking implements verification {
	
private int TicketNum ;
private Flight flight ;
private Passenger[] passengers;


public Booking(int ticketNum, Flight flight, Passenger[] passengers) {
	TicketNum = ticketNum;
	this.flight = flight;
	this.passengers = passengers;
}


public Booking() {
}


public int getTicketNum() {
	return TicketNum;
}


public void setTicketNum(int ticketNum) {
	TicketNum = ticketNum;
}


public Flight getFlight() {
	return flight;
}


public void setFlight(Flight flight) {
	this.flight = flight;
}


public Passenger[] getPassengers() {
	return passengers;
}


public void setPassengers(Passenger[] passengers) {
	this.passengers = passengers;
}


@Override
public String toString() {
	return "Booking details [\nTicket Number:" + TicketNum +
			"\n flight:" + flight +
			"\n passengers=" + Arrays.toString(passengers)
			+ "]";
}
@Override
public boolean CheckAvailable() {
    if (verification.MaxTickets <= 10) {
        return true;
    }
    else {
        return false;
    }}}
