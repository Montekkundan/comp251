package assignment1;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Key: " + key + ", Value: " + value;
    }

    public static void main(String[] args) {
        Pair<String, Integer> agePair = new Pair<>("Age", 25);
        Pair<String, Double> pricePair = new Pair<>("Price", 19.99);
        Pair<Integer, String> numberPair = new Pair<>(1, "One");

        System.out.println(agePair);
        System.out.println(pricePair);
        System.out.println(numberPair);

        agePair.setKey("Updated Age");
        agePair.setValue(30);

        System.out.println(agePair);
    }
}
