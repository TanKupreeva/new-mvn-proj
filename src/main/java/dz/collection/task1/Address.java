package dz.collection.task1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    private String populatedPlace;
    private String country;
    private String populatedPlaceName;
    private String street;
    private int houseNumber;
    private  int postalCode;

}
