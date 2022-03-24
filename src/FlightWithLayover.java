/**
 * FlightWithLayover
 * @author Evam Scales
 */
import java.util.*;
public class FlightWithLayover extends Flight {

    private ArrayList<Flight> flights;
    private int numStops;
    private double discountPercent;

    /**
     * 
     * @param date
     * @param departingAirport
     * @param destAirport
     * @param takeOffTime
     * @param landingTime
     * @param totalTime
     * @param pricing
     * @param flights
     * @param numStop
     * @param discountPercent
     */
    FlightWithLayover(Date date, String departingAirport, String destAirport,
    String takeOffTime, String landingTime, String totalTime,
    HashMap<String, Integer> pricing, ArrayList<Flight> flights,
    int numStop, double discountPercent) {
        // Make a constrcutor in Flights just for flights with layovers
        // Do not include info for objecttobebooked for that constructor, besides pricing
        // This type of object will never be stored i
        
    }

    FlightWithLayover(String gay) {
        
    }

    // Member functions

    /**
     * 
     * @param flight
     */
    public void addFlight(Flight flight) {

    }

    /**
     * 
     * @param flight
     */
    public void removeFlight(Flight flight) {

    }


    /**
     * 
     */
    // @Override
    public void print() {

    }

    /**
     * 
     */
    public void discountPrices() {

    }

    // Setters

    /**
     * 
     * @param flights
     */
    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    /**
     * 
     * @param numStops
     */
    public void setNumStops(int numStops) {
        this.numStops = numStops;
    }

    /**
     * 
     * @param discountPercent
     */
    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    // Getters

    /**
     * 
     * @return
     */
    public ArrayList<Flight> getFlights() {
        return this.flights;
    }

    /**
     * 
     * @return
     */
    public int getNumStops() {
        return this.numStops;
    }

    /**
     * 
     * @return
     */
    public double getDiscountPercent() {
        return this.discountPercent;
    }
}