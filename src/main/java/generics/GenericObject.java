package generics;

public class GenericObject<T> {
    private T value;

    public GenericObject(T value) {
        this.value = value;
    }


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class GenericTest {
    public static void main(String[] args) {
        GenericObject<String> gen = new GenericObject<String>("ABC");
        String val = gen.getValue();
        GenericObject<Integer> gen2 = new GenericObject<Integer>(123);
        int val2  = gen2.getValue();

        gen2.setValue(54);// 54-> new Integer(54)
        gen2.setValue(new Integer(123));

        int i_1 = gen2.getValue().intValue();
        Double d_1 = 10.5;
        Double d_2 = new Double(80);



        GenericObject<Boolean> gen3 = new GenericObject<>(true);
        gen3.getValue();

        Integer i =new Integer(155);
        Double d = new Double("1.5");
        System.out.println(d.doubleValue());
    }
}