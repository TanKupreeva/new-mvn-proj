package dz.collection.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HouseUtils {
    public static void printAllHouses(List<House> houses) {
        Iterator<House> iterator = houses.iterator();
        while (iterator.hasNext()) {
            House h = iterator.next();
            System.out.println(h.getUid() + " " + h.getAddress().getCountry() + " " + h.getAddress().getPopulatedPlaceName());
        }
    }

    public static void printAllMinskHouses(List<House> houses) {
        Iterator<House> iterator = houses.iterator();
        while (iterator.hasNext()) {
            House h = iterator.next();
            if (h.getAddress().getPopulatedPlaceName().equals("Minsk")) {
                System.out.println(h);
            }
        }
    }

    public static void printHouses(List<House> houses, int minArea) {
        Iterator<House> iterator = houses.iterator();
        while (iterator.hasNext()) {
            House h = iterator.next();
            if (h.getArea() < minArea) {
                System.out.println(h);
            }
        }
    }


    public static List<House> getHouses(List<House> houses, String address) {
        List<House> result = new ArrayList<>();
        Iterator<House> iterator = houses.iterator();
        while (iterator.hasNext()) {
            House h = iterator.next();
            if (String.valueOf(h.getAddress().getHouseNumber()).contains(address) ||
                    String.valueOf(h.getAddress().getPostalCode()).contains(address) ||
                    h.getAddress().getCountry().toLowerCase().contains(address.toLowerCase()) ||
                    h.getAddress().getPopulatedPlace().toLowerCase().contains(address.toLowerCase()) ||
                    h.getAddress().getStreet().toLowerCase().contains(address.toLowerCase())) {
                result.add(h);
            }
        }
        return result;
    }

    public static List<House> getHouses(List<House> houses, int minArea) {
        List<House> result = new ArrayList<>();
        Iterator<House> iterator = houses.iterator();
        while (iterator.hasNext()) {
            House h = iterator.next();
            if (h.getArea() > minArea) {
                result.add(h);
            }
        }
        return result;
    }

    public static List<House> getHousesWall(List<House> houses, String wallMaterial) {
        List<House> result = new ArrayList<>();
        Iterator<House> iterator = houses.iterator();
        while (iterator.hasNext()) {
            House h = iterator.next();
            if (h.getWallMaterial().toLowerCase().equals(wallMaterial.toLowerCase())) {
                result.add(h);
            }
        }
        return result;
    }

    public static void getHouseByCommunication(List<House> houses, String communication) {
        Iterator<House> iterator = houses.iterator();
        while (iterator.hasNext()) {
            House h = iterator.next();
            if (h.getCommunication().contains(communication.toLowerCase())) {
                System.out.println(h);
            }
        }
    }
}
