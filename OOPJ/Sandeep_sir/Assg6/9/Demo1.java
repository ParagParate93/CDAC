package org.example_7_9;

/*

    9. You need to implement a system to manage airplane seat assignments. The airplane has seats 
    arranged in rows and columns. Implement functionalities to:
    
    • Initialize the seating arrangement with a given number of rows and columns.
    • Book a seat to mark it as occupied.
    • Cancel a booking to mark a seat as available.
    • Check seat availability to determine if a specific seat is available.
    • Display the current seating chart.

 */


public class Demo1 {

	public static void main(String[] args) {
		AeroplaneSeatManager a = new AeroplaneSeatManager();
//		a.seatAvailable();
		a.currentSeatChart();
		a.bookSeat();
		a.currentSeatChart();

	}

}