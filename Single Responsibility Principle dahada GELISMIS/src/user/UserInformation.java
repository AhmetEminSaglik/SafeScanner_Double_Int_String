package user;

import user.address.AddressInfo;

public class UserInformation {

    String name, surname;
    AddressInfo address= new AddressInfo();

    public UserInformation() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public AddressInfo getAddress() {
        return address;
    }

    public void setAddress(AddressInfo address) {
        this.address = address;
    }

}
