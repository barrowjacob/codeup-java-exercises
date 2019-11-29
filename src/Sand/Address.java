package Sand;

import java.lang.module.ResolutionException;

public class Address {
    String street;
    String number;
    String town;
    String zipCode;
    boolean domestic;

    public Address(String street,
                   String number,
                   String town,
                   String zipCode,
                   boolean domestic) {
        this.street = street;
        this.number = number;
        this.town = town;
        this.zipCode = zipCode;
        this.domestic = domestic;
    }
}