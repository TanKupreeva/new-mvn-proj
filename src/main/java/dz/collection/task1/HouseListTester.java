package dz.collection.task1;

import java.util.ArrayList;
import java.util.List;

public class HouseListTester {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("heating");
        l1.add("electricity");
        l1.add("sewerage");
        l1.add("waterSupply");
        List<String> l2 = new ArrayList<>();
        l2.add("electricity");
        l2.add("waterSupply");
        List<String> l3 = new ArrayList<>();
        l3.add("electricity");


        House h1 = new House(1, 535, 2, "villa", 1759, "кирпич",
                "столбчатый", l1,
                new Address("city", "Spain", "Benidorm", "Calle Gerona",
                        5, 3508));
        House h2 = new House(2, 123, 3, "villa", 2100,
                "монолитные железобетонные стены", "ленточный", l1,
                new Address("city", "France", "Cannes", "Rue Mace", 66, 6150));
        House h3 = new House(3, 50, 1, "cottage", 100, "кирпич", "cвайный", l1,
                new Address("city", "Belarus", "Minsk", "Sosnovaya", 9, 220000));
    }
}
