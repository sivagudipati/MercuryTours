package org.MercuryTours.pages;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JUnitTest {
	
	@Test()
	public void aSignInTest()
	{
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
