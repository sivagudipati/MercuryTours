package groupid1;
import static org.junit.Assert.*;
import org.MercuryTours.pages.FlightDetails;

import org.junit.Test;

import groupid1.FlightDetails;
import groupid1.PassengerDetails;
import groupid1.ReserveFlights;
import groupid1.SignInDetails;

public class mercury_junitcases {

	@Test
	public void test() {
		
		SignInDetails signIn = new SignInDetails();
		signIn.signIn();
		
	}
	
	@Test()
	public void bFlightDetailsTest()
	{
		
		FlightDetails fd = new FlightDetails();
		fd.enterFlightDetails();
	}
	
	@Test()
	public void cReserveFlight()
	{
		ReserveFlights rf = new ReserveFlights();
		rf.reserveFlight();
	}
	
	@Test
	public void dPassengerDetailsTest()
	{
		PassengerDetails pd = new PassengerDetails();
		pd.passengerDetails();
	
	}

}
