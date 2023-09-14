package dz.collection.task1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Data
@AllArgsConstructor
public class House implements Comparable<House> {
    private int uid;
    private int area;
    private int numberOfFloors;
    private String type;
    private int territoryArea;
    private String wallMaterial;
    private String foundationType;
    private List<String> communication;
    private Address address;
    private int price;

    @Override
    public int compareTo(House o) {
        if (this.getUid() == o.getUid()) {
            return 0;
        }
        if (this.getUid() > o.getUid()) {
            return 1;
        } else return -1;
    }


}

class HouseByCountryComparator implements Comparator<House> {
    private boolean asc = true;

    public HouseByCountryComparator(boolean asc) {
        this.asc = asc;
    }

    @Override
    public int compare(House o1, House o2) {
        return asc ? (o1.getAddress().getCountry().compareTo(o2.getAddress().getCountry())) :
                (o2.getAddress().getCountry().compareTo(o1.getAddress().getCountry()));
    }
}

class HouseByCountryCityComparator implements Comparator<House> {
    private boolean asc = true;

    public HouseByCountryCityComparator(boolean asc) {
        this.asc = asc;
    }

    @Override
    public int compare(House o1, House o2) {
        int res = 0;
        if (asc == true) {
            res = o1.getAddress().getCountry().compareTo(o2.getAddress().getCountry());
            if (res == 0) {
                res = o1.getAddress().getPopulatedPlaceName().compareTo(o2.getAddress().getPopulatedPlaceName());
            }
        } else {
            res = o2.getAddress().getCountry().compareTo(o1.getAddress().getCountry());
            if (res == 0) {
                res = o2.getAddress().getPopulatedPlaceName().compareTo(o1.getAddress().getPopulatedPlaceName());
            }
        }
        return res;
    }
}