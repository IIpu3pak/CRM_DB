package org.servicecrm.catalogs.addresses;


public class Addresses {

    private String steet;

    private String city;

    private String houseNumber;

    private String postalCode;

    public Addresses() {

    }

    public String getSteet() {
        return steet;
    }

    public void setSteet(String steet) {
        this.steet = steet;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Addresses addresses = (Addresses) o;

        if (steet != null ? !steet.equals(addresses.steet) : addresses.steet != null) return false;
        if (city != null ? !city.equals(addresses.city) : addresses.city != null) return false;
        if (houseNumber != null ? !houseNumber.equals(addresses.houseNumber) : addresses.houseNumber != null)
            return false;
        return !(postalCode != null ? !postalCode.equals(addresses.postalCode) : addresses.postalCode != null);

    }

    @Override
    public int hashCode() {
        int result = steet != null ? steet.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (houseNumber != null ? houseNumber.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        return result;
    }
}
