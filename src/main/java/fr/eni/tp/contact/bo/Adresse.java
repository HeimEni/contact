package fr.eni.tp.contact.bo;

public class Adresse {
    private long id;
    private String street;
    private int nbStreet;
    private String city;
    private String State;
    private int cp;

    public Adresse(long id, String street, int nbStreet, String city, String state, int cp) {
        this(id,street,nbStreet,city);
        this.State = state;
        this.cp = cp;
    }

    public Adresse(long id, String street, int nbStreet, String city) {
        this.id = id;
        this.street = street;
        this.nbStreet = nbStreet;
        this.city = city;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNbStreet() {
        return nbStreet;
    }

    public void setNbStreet(int nbStreet) {
        this.nbStreet = nbStreet;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }
}
