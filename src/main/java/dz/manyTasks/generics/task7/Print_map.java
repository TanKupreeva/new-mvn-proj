package dz.manyTasks.generics.task7;


public class Print_map<K, V> {
    private K key;
    private V value;

    public Print_map(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void print() {
        System.out.println(getKey() + " : " + getValue());
    }

    public static void main(String[] args) {
        Print_map<String, String> p1 = new Print_map<>("Germany", "Berlin");
        Print_map<String, String> p2 = new Print_map<>("Belarus", "Minsk");
        Print_map<String, String> p3 = new Print_map<>("Ukraine", "Kiev");
        Print_map<String, Integer> p4 = new Print_map<>("Black", 1);
        Print_map<String, Integer> p5 = new Print_map<>("White", 0);
        Print_map<Integer, Double> p6 = new Print_map<>(1, 1.0);
        Print_map<Integer, String> p7 = new Print_map<>(5, "Five");
        p1.print();
        p2.print();
        p3.print();
        p4.print();
        p5.print();
        p6.print();
        p7.print();
    }
}
