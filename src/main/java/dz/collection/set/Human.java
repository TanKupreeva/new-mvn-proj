package dz.collection.set;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;


@Data
@AllArgsConstructor
public class Human implements Comparable<Human> {
    private String name;
    private int age;
    private int iq;

    @Override
    public int compareTo(Human o) {
        int result = this.getName().compareTo(o.getName());
        if (result != 0) {
            return result;
        } else {
            int result2 = new Integer(this.getAge()).compareTo(o.getAge());
            if (result2 != 0) {
                return result2;
            } else {
                return new Integer(this.getIq()).compareTo(o.getIq());
            }
        }
    }
}

@AllArgsConstructor
class HumanComporatorByIQ implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        int result = new Integer(o1.getIq()).compareTo(o2.getIq());
        if (result != 0) {
            return result;
        } else {
            int result2 = o1.getName().compareTo(o2.getName());
            if (result2 != 0) {
                return result2;
            } else {
                return new Integer(o1.getAge()).compareTo(o2.getAge());
            }
        }
    }
}