package generics;

import model.Person;
import org.junit.Assert;
import org.junit.Test;

public class StorageTest {
    @Test
    public void testStorage1(){
        Storage<Person> personStorage = new Storage<>();
        personStorage.add(new Person(12, "Bob", "Ivanov",33));
        personStorage.add(new Person(22, "Mike", "Ivanov",33));
        personStorage.add(new Person(34, "John", "Ivanov",33));

        Assert.assertTrue(personStorage.size()==3);
    }

    @Test(expected = NumberFormatException.class)
    public void testStorage2(){
        Storage<Number> numbers = new Storage<>();
        numbers.add(3.44);//boxing double 3.44 -> new Double(3.44) -> (Number)
        numbers.add(new Long(123));

        numbers.add(new Double("123,123"));

    }

    @Test
    public void testStorage3(){
        Storage<String> str = new Storage<>();
        str.add("123");
        str.add("Test");
        str.add(new String(" "));

        String s = str.get(str.size()+1);
        Assert.assertNull(s);
    }
}
