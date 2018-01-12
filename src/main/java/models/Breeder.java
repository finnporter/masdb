package models;

public class Breeder {

    private int id;
    private String first_name;
    private String last_name;
    private String country;

    public Breeder(String first_name, String last_name, String country) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.country = country;
    }

//GETTERS and SETTERS
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getLastLame() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
