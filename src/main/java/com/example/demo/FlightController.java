package com.example.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.*;

/**
 * Servlet implementation class FlightController
 */
@WebServlet(name = "FlighController", urlPatterns = { "/api/v1.0/flight" })
public class FlightController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	@RequestMapping(path = "/airline/register", method = RequestMethod.POST)
	public void bookNewAirline(@PathVariable String airlineName,@PathVariable String logo,@PathVariable String contactNumber,@PathVariable String contactAddress) {
		System.out.println("A new airline named "+airlineName + " has been registered");
	}
	
	@RequestMapping(path = "/admin/login", method = RequestMethod.POST)
	public void adminLogin(@PathVariable String userName,@PathVariable String password) {
		System.out.println("Hello "+userName+" You have been successfully logged in");
	}
	
	@RequestMapping(path = "/search", method = RequestMethod.POST)
	public void searchFlight(@PathVariable String date,@PathVariable String time,@PathVariable String source,@PathVariable String destimation,@PathVariable boolean isRoundTrip) {
		System.out.println("Your fligts are following");
	}
	
	@RequestMapping(path = "/booking", method = RequestMethod.POST)
	public void ticketBooking(@RequestParam String ticketId) {
		System.out.println("Your ticket with ID "+ticketId+" has been successfully generated");
	}
	
	@RequestMapping(path = "/ticket", method = RequestMethod.GET)
	public void searchFlight(@RequestParam String pnrCode) {
		System.out.println("Fetching all the ticket details based on your PNR Code " +pnrCode);
	}
	
	@RequestMapping(path = "/booking/history", method = RequestMethod.GET)
	public void getPastTicketsDetails(@RequestParam String emailId) {
		System.out.println("Fetching all the tickets' details based on the email id" +emailId);
	}
	
	@RequestMapping(path = "/ticket", method = RequestMethod.DELETE)
	public void cancelFlight(@RequestParam String pnrCode) {
		System.out.println("Your ticket with " +pnrCode + " has been successfully cancelled");
	}
	
    public FlightController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
