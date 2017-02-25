package pl.sda.builder;


//POJO Plain Old Java Object
public class Person {
    private String firstName;
    private String lasName;
    private PersonAddress address;
    private String pesel;

    public String getFirstName() {
        return firstName;
    }

    public String getLasName() {
        return lasName;
    }

    public PersonAddress getAddress() {
        return address;
    }

    public String getPesel() {
        return pesel;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public void setAddress(PersonAddress address) {
        this.address = address;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lasName='" + lasName + '\'' +
                ", address=" + address +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
