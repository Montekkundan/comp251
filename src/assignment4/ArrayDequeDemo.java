package assignment4;

import java.util.ArrayDeque;

class Pair {
    String key;
    Integer value;

    public Pair(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "[" + key + "," + value + "]";
    }
}

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Pair> a = new ArrayDeque<>();

        Pair P1 = new Pair("Laptops", 2);
        Pair P2 = new Pair("Mobiles", 3);
        Pair P3 = new Pair("Books", 4);
        Pair P4 = new Pair("Boards", 5);

        a.addFirst(P1);
        a.addLast(P2);
        a.addLast(P3);
        a.addLast(P4);

        System.out.println("The contents of Deque are: " + a);
    }
}
