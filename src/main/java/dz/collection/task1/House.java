package dz.collection.task1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
public class House {
    private int uid;
    private int area;
    private int numberOfFloors;
    private String type;
    private int territoryArea;
    private String wallMaterial;
    private String foundationType;
    private List<String> communication = new ArrayList<>();
    private Address address;
//    private boolean heating;
//    private boolean electricity;
//    private boolean sewerage;
//    private boolean waterSupply;
}
