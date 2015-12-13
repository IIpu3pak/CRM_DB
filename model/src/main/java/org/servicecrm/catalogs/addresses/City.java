package org.servicecrm.catalogs.addresses;


public class City {

    private String name;
    private String postalCode;

    public City() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (name != null ? !name.equals(city.name) : city.name != null) return false;
        return !(postalCode != null ? !postalCode.equals(city.postalCode) : city.postalCode != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        return result;
    }
}
