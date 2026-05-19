package ARRAYLIST;

import java.util.ArrayList;
import java.util.Arrays;


public class A2 {

    public static void main(String[] args) {

        // Array
        String city[] = {
                "Pune",
                "Mumbai",
                "Nashik",
                "Ahmedabad",
                "Solapur",
                "Banglore",
                "Chennai",
                "Kolhapur",
                "Jalgaon",
                "Nagpur",
                "Beed"
        };

        // Array to ArrayList Conversion
        ArrayList<String> cities =
                new ArrayList<>(Arrays.asList(city));

        // Print ArrayList
        System.out.println("All Cities:");
        System.out.println(cities);

        // Add new city
        cities.add("Satara");

        // Remove city
        cities.remove("Beed");

        // Print updated list
        System.out.println("\nUpdated Cities:");
        System.out.println(cities);

        // Total number of cities
        System.out.println("\nTotal Cities:");
        System.out.println(cities.size());

        // Check city exists or not
        System.out.println("\nContains Pune?");
        System.out.println(cities.contains("Pune"));

        // Print cities starting with N
        System.out.println("\nCities Starting With N:");

        for (String c : cities) {

            if (c.startsWith("N")) {
                System.out.println(c);
            }
        }

        // Print cities having length > 5
        System.out.println("\nCities Length Greater Than 5:");

        for (String c : cities) {

            if (c.length() > 5) {
                System.out.println(c);
            }
        }
    }
}


