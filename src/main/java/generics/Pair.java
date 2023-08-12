package generics;

public interface Pair<K, V> {
    K getKey();

    V getValue();

    default void print() {
        System.out.println(getKey() + " : " + getValue());
    }
}


class Assoc<K, V> implements Pair<K, V> {
    private K key;
    private V value;


    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    public Assoc(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

class PairTest {
    public static void main(String[] args) {
        Assoc<String, String> assoc1 = new Assoc<>("Main", "Главный");
        Assoc<String, String> assoc2 = new Assoc<>("Cat", "Кот");
        Assoc<String, String> assoc3 = new Assoc<>("Dog", "Песик");
        System.out.println(assoc2.getValue());
        assoc1.print();

        Storage<Assoc<String, String>> assocs = new Storage<>();
        assocs.add(assoc1);
        assocs.add(assoc2);
        assocs.add(assoc3);
        System.out.println(assocs.get(2).getValue());

        //EN
        Assoc<Integer, String> assocIntStr1 = new Assoc<>(1, "One");
        Assoc<Integer, String> assocIntStr2 = new Assoc<>(2, "Two");
        Assoc<Integer, String> assocIntStr3 = new Assoc<>(3, "Three");
        Assoc<Integer, String> assocIntStr4 = new Assoc<>(4, "Four");
        Assoc<Integer, String> assocIntStr5 = new Assoc<>(5, "Five");
        Assoc<Integer, String> assocIntStr6 = new Assoc<>(6, "Six");
        Assoc<Integer, String> assocIntStr7 = new Assoc<>(7, "Seven");
        Assoc<Integer, String> assocIntStr8 = new Assoc<>(8, "Eight");
        Assoc<Integer, String> assocIntStr9 = new Assoc<>(9, "Nine");
        Assoc<Integer, String> assocIntStr10 = new Assoc<>(10, "Ten");

        Storage<Assoc<Integer, String>> assocsIntStrEN = new Storage<>();
        assocsIntStrEN.add(assocIntStr1);
        assocsIntStrEN.add(assocIntStr2);
        assocsIntStrEN.add(assocIntStr3);
        assocsIntStrEN.add(assocIntStr4);
        assocsIntStrEN.add(assocIntStr5);
        assocsIntStrEN.add(assocIntStr6);
        assocsIntStrEN.add(assocIntStr7);
        assocsIntStrEN.add(assocIntStr8);
        assocsIntStrEN.add(assocIntStr9);
        assocsIntStrEN.add(assocIntStr10);

        //RU
        Assoc<Integer, String> assocIntStrRu1 = new Assoc<>(1, "Один");
        Assoc<Integer, String> assocIntStrRu2 = new Assoc<>(2, "Два");
        Assoc<Integer, String> assocIntStrRu3 = new Assoc<>(3, "Три");
        Assoc<Integer, String> assocIntStrRu4 = new Assoc<>(4, "Четыре");
        Assoc<Integer, String> assocIntStrRu5 = new Assoc<>(5, "Пять");
        Assoc<Integer, String> assocIntStrRu6 = new Assoc<>(6, "Шесть");
        Assoc<Integer, String> assocIntStrRu7 = new Assoc<>(7, "Cемь");
        Assoc<Integer, String> assocIntStrRu8 = new Assoc<>(8, "Восемь");
        Assoc<Integer, String> assocIntStrRu9 = new Assoc<>(9, "Девять");
        Assoc<Integer, String> assocIntStrRu10 = new Assoc<>(10, "Десять");

        Storage<Assoc<Integer, String>> assocsIntStrRu = new Storage<>();
        assocsIntStrRu.add(assocIntStrRu1);
        assocsIntStrRu.add(assocIntStrRu2);
        assocsIntStrRu.add(assocIntStrRu3);
        assocsIntStrRu.add(assocIntStrRu4);
        assocsIntStrRu.add(assocIntStrRu5);
        assocsIntStrRu.add(assocIntStrRu6);
        assocsIntStrRu.add(assocIntStrRu7);
        assocsIntStrRu.add(assocIntStrRu8);
        assocsIntStrRu.add(assocIntStrRu9);
        assocsIntStrRu.add(assocIntStrRu10);

        Assoc<String, Storage<Assoc<Integer, String>>> globalEN = new Assoc<>("EN", assocsIntStrEN);
        Assoc<String, Storage<Assoc<Integer, String>>> globalRU = new Assoc<>("RU", assocsIntStrRu);

        Storage<Assoc<String, Storage<Assoc<Integer, String>>>> globalStorage = new Storage<>();
        globalStorage.add(globalEN);
        globalStorage.add(globalRU);

        System.out.println(assocsIntStrRu.size());
        System.out.println(globalRU.getKey());
    }
}