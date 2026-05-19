package ARRAYLIST;
import java.util.ArrayList;
public class A1 {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> cities = new ArrayList<>();

        // 1. add()
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Nashik");
        cities.add("Nagpur");

        System.out.println("Original List:");
        System.out.println(cities);

        // 2. add(index, value)
        cities.add(1, "Kolhapur");

        System.out.println("\nAfter Adding at Index 1:");
        System.out.println(cities);

        // 3. get()
        System.out.println("\nCity at index 2:");
        System.out.println(cities.get(2));

        // 4. set()
        cities.set(3, "Solapur");

        System.out.println("\nAfter Updating:");
        System.out.println(cities);

        // 5. remove()
        cities.remove("Mumbai");

        System.out.println("\nAfter Removing Mumbai:");
        System.out.println(cities);

        // 6. size()
        System.out.println("\nTotal Cities:");
        System.out.println(cities.size());

        // 7. contains()
        System.out.println("\nContains Pune?");
        System.out.println(cities.contains("Pune"));

        // 8. isEmpty()
        System.out.println("\nIs List Empty?");
        System.out.println(cities.isEmpty());

        // 9. loop through ArrayList
        System.out.println("\nUsing For Loop:");

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        // 10. clear()
        cities.clear();

        System.out.println("\nAfter Clear:");
        System.out.println(cities);
    }
}