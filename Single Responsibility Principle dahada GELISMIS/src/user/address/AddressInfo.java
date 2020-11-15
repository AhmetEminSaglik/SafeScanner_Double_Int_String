package user.address;

public class AddressInfo {

    String country, city, town;
    int postCode;

    public AddressInfo() {
    }

    public AddressInfo(String country, String city, String town, int postCode) {
        this.country = country;
        this.city = city;
        this.town = town;
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return " Country : " + country + "\n City : " + city + "\n town : " + town + "\n postCode : " + postCode + "\n";
    }

}
