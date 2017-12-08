package edu.orangecoastcollege.cs273.dreyna3.ocgreensave;

/**
 * Created by Daniel on 12/1/2017.
 * Bale Object
 */

public class Bale {
    private int id;
    private String user;
    private String date;
    private String type;
    private double weight;

    /**
     * Creates a new Bale Object
     * @param id database id
     * @param user current user logging
     * @param date timestamp of the log
     * @param type type of the bale
     * @param weight weight of the bale
     */
    public Bale(int id, String user, String date, String type, double weight) {
        this.id = id;
        this.user = user;
        this.date = date;
        this.type = type;
        this.weight = weight;
    }

    /**
     * Constructs an empty Bale object
     */
    public Bale() {}

    /**
     * Returns the bale id
     * @return bale id
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the bale's logger
     * @return bale's logger
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the logger of the bale
     * @param user logger of the bale
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * Returns the bale timestamp
     * @return bale timestamp
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the bale's timestamp
     * @param date bale's timestamp
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Returns the bale's type
     * @return bale's type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the bale's type
     * @param type bale's type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Returns bale's weight
     * @return bale's weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the bale's weight
     * @param weight bale's weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Formats the object to be displayed in a string message
     * @return the String message
     */
    @Override
    public String toString() {
        return "Bale{" +
                "user='" + user + '\'' +
                ", type='" + type + '\'' +
                ", date='" + date + '\'' +
                ", weight=" + weight +
                '}';
    }
}
