package class01;


		// Java program to demonstrate of() method
		  
		import java.util.*;
		import java.io.*;
		import java.time.*;
		import java.time.chrono.*;
		import java.time.temporal.*;
		  
		public class Hijri {
		    public static void main(String[] args)
		    {
		        try {
		  
		            // Creating and initializing
		            // HijrahDate Object
		            // By using of() method
		            HijrahDate hidate
		                = HijrahDate.of(1444, 04, 24);
		  
		            // Display the result
		            System.out.println("HijrahDate: "
		                               + hidate);
		        }
		        catch (DateTimeException e) {
		            System.out.println("passed parameter can" + " not form a date");
		            System.out.println("Exception thrown: " + e);
		        }
		    }
		}


