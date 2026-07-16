package activies;

import java.util.ArrayList;
import java.util.Collections;

public class FifthClass {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the array of integers
        System.out.print("Array elements: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Convert the array to an ArrayList
        ArrayList<Integer> numberList = new ArrayList<>();

        // add elements from the array to the ArrayList
        for (int number : numbers) {
            numberList.add(number);
        }

        // Create an array of Strings
        String[] names = {"Italo","Gilmara", "Alessandro", "Euller"};

        // Convert the array to an ArrayList
        ArrayList<String> nameList = new ArrayList<>();

        // add elements the array to the ArrayList
        Collections.addAll(nameList, names);

    }


}
