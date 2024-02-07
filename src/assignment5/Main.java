package assignment5;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Contents of the ArrayList:");
        System.out.println(numbers.toString());
    }
}

//public class Main {
//    public static void main(String[] args) {
//        int capacity = 17;
//        ArrayList<Integer> data = new ArrayList<>(capacity);
//
//        // Adding i + 2 to the list at index i
//        for (int i = 0; i < capacity; i++) {
//            data.add(i, i + 2);
//        }
//
//        System.out.println("Contents of the ArrayList before filtering:");
//        System.out.println(data.toString());
//
//        // Using Iterator to filter out even numbers
//        Iterator<Integer> iterator = data.iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next() % 2 == 0) {
//                iterator.remove();
//            }
//        }
//
//        System.out.println("Contents of the ArrayList after filtering:");
//        System.out.println(data.toString());
//    }
//}

//public class Main {
//
//    public static void main(String[] args) {
//        ArrayList<Integer> data = populateList();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Contents of the List:");
//        System.out.println(data);
//
//        System.out.print("Enter an integer that you want to find in the list: ");
//        int userInput = scanner.nextInt();
//
//        boolean containsValue = contains(data, userInput);
//        if (containsValue) {
//            System.out.println("Yes, the element of value " + userInput + " is included in the list.");
//        } else {
//            System.out.println("No, the element of value " + userInput + " is NOT included in the list.");
//        }
//        scanner.close();
//    }
//
//    private static ArrayList<Integer> populateList() {
//        int capacity = 17;
//        ArrayList<Integer> data = new ArrayList<>(capacity);
//        for (int i = 0; i < capacity; i++) {
//            data.add(i, i + 2);
//        }
//        return data;
//    }
//
//    private static boolean contains(ArrayList<Integer> list, Integer value) {
//        for (Integer item : list) {
//            if (item.equals(value)) {
//                return true;
//            }
//        }
//        return false;
//    }
//}
