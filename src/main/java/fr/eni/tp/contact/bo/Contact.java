package fr.eni.tp.contact.bo;

public class Contact {
    private long id;
    private String firstName;
    private String lastName;
    private String nbTelephone;
    private String email;
    private Adresse adresse;

    public Contact(long id, String firstName, String lastName, String nbTelephone, String email, Adresse adresse) {
        this(id,firstName,lastName,nbTelephone);
        this.adresse = adresse;
    }

    public Contact(long id, String firstName, String lastName, String nbTelephone, String email) {
        this(id,firstName,lastName,nbTelephone);
        this.email = email;
    }

    public Contact(long id, String firstName, String lastName, String nbTelephone) {
        this(id,firstName,lastName);
        this.nbTelephone = nbTelephone;
    }

    public Contact(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Contact() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNbTelephone() {
        return nbTelephone;
    }

    public void setNbTelephone(String nbTelephone) {
        this.nbTelephone = nbTelephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
