package dz.collection.task1;

import java.util.*;

import static dz.collection.task1.HouseUtils.*;

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
                        5, 3508), 1000000);
        House h2 = new House(13, 535, 2, "villa", 1759, "кирпич",
                "столбчатый", l1,
                new Address("city", "Spain", "Benidorm", "Calle Gerona",
                        9, 3508), 9000000);
        House h3 = new House(5, 123, 3, "villa", 2100,
                "монолитные железобетонные стены", "ленточный", l1,
                new Address("city", "France", "Cannes", "Rue Mace",
                        66, 6150), 999000);
        House h4 = new House(3, 50, 1, "cottage", 100, "кирпич",
                "cвайный", l2,
                new Address("city", "Belarus", "Minsk", "Severnaya",
                        9, 220000), 50988);
        House h5 = new House(9, 50, 1, "cottage", 100, "кирпич",
                "cвайный", l2,
                new Address("city", "Belarus", "Brest", "Sosnovaya",
                        9, 220000), 29988);
        House h6 = new House(8, 50, 1, "cottage", 100, "дерево",
                "cвайный", l2,
                new Address("city", "Belarus", "Grodno", "Ugnaya",
                        9, 220000), 23988);
        House h7 = new House(45, 50, 1, "cottage", 80, "дерево",
                "cвайный", l2,
                new Address("city", "Belarus", "Vitebsk", "Vostochnaya",
                        9, 220000), 10988);
        House h8 = new House(83, 50, 1, "cottage", 90, "дерево",
                "cвайный", l2,
                new Address("city", "Belarus", "Lida", "Zapadnaya",
                        9, 220000), 8988);
        House h9 = new House(82, 50, 1, "cottage", 70, "дерево",
                "cвайный", l2,
                new Address("city", "Belarus", "Gomel", "Orehovaya",
                        9, 220000), 5988);
        House h10 = new House(81, 50, 1, "cottage", 40, "дерево",
                "cвайный", l2,
                new Address("city", "Belarus", "Orsha", "Mirnaya",
                        9, 220000), 988);
        House h11 = new House(84, 50, 1, "cottage", 60, "дерево",
                "cвайный", l3,
                new Address("city", "Belarus", "Mozyr", "Lesnaya",
                        9, 220000), 3988);
        House h12 = new House(89, 50, 1, "cottage", 77, "дерево",
                "cвайный", l2,
                new Address("city", "Belarus", "Slonim", "Belaruskaya",
                        9, 220000), 1988);
        House h13 = new House(98, 50, 1, "cottage", 60, "дерево",
                "cвайный", l3,
                new Address("city", "Belarus", "Osipovichi", "Gorodskaya",
                        9, 220000), 15988);
        House h14 = new House(78, 50, 1, "cottage", 10, "дерево",
                "cвайный", l2,
                new Address("city", "Belarus", "Bobryisk", "Zelenaya",
                        9, 220000), 1188);
        House h15 = new House(58, 50, 1, "cottage", 100, "дерево",
                "cвайный", l3,
                new Address("city", "Belarus", "Baranovichi", "Vinogradnaya",
                        9, 220000), 5988);
        House h16 = new House(48, 50, 1, "cottage", 70, "дерево",
                "cвайный", l3,
                new Address("city", "Belarus", "Molodechno", "Gryshevaya",
                        9, 220000), 6988);
        House h17 = new House(38, 50, 1, "cottage", 30, "дерево",
                "cвайный", l3,
                new Address("city", "Belarus", "Ostrovec", "Nochnaya",
                        9, 220000), 4988);


        List<House> houseList = new ArrayList<>(Arrays.asList(h1, h2, h3, h4, h5, h6, h7, h8, h9, h10, h11, h12, h13, h14, h15, h16, h17));
        printAllHouses(houseList);
        System.out.println("****************************");
        printAllMinskHouses(houseList);
        System.out.println("****************************");
        printHouses(houseList, 100);
        System.out.println("get house '5'");
        System.out.println(getHouses(houseList, "5"));
        System.out.println("****************************");
        System.out.println("get house 'no'");
        System.out.println(getHouses(houseList, "no"));
        System.out.println("****************************");
        System.out.println(getHouses(houseList, 100));
        System.out.println(getHousesWall(houseList, "кирпич"));
        getHouseByCommunication(houseList, "heating");
        Collections.sort(houseList);
        System.out.println("sort by id");
        printAllHouses(houseList);
        System.out.println("*****************************");
        Collections.sort(houseList, new HouseByCountryComparator(true));
        System.out.println("sort by country");
        printAllHouses(houseList);
        System.out.println("*****************************");

        Collections.sort(houseList, new HouseByCountryCityComparator(true));
        System.out.println("sort by city");
        printAllHouses(houseList);
    }
}
