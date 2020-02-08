package com.openclassrooms.entrevoisins.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Model object representing a Neighbour
 */
public class Neighbour implements Serializable {

    /** Identifier */
    private Integer id;

    /** Full name */
    private String name;

    /** Avatar */
    private String avatarUrl;

    /** Phone number */
    private String number;

    /** Address contact */
    private String address;

    /** Mail Address */
    private String link;

    /**Presentation text*/
    private String aproposText;


    /**
     * Constructor
     * @param id
     * @param name
     * @param avatarUrl
     * @param number
     * @param address
     * @param link
     * @param aproposText
     */

    private boolean neighbourIsFav;



    public Neighbour(Integer id, String name, String avatarUrl, String number, String address, String link, String aproposText) {
        this.id = id;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.number = number;
        this.address = address;
        this.link = link;
        this.aproposText = aproposText;
        this.neighbourIsFav = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public boolean getNeighbourIsFav() {return this.neighbourIsFav;}

    public void setNeighbourIsFav(boolean neighbourIsFav) {this.neighbourIsFav = neighbourIsFav;}

    public String getNumber() {return number;}

    public void setNumber(String number) {this.number = number;}

    public String getAddress() {return address;}

    public void setAddress(String address) {this.address = address;}

    public String getLink() {return link;}

    public void setLink(String link) {this.link = link;}

    public String getAproposText() {return aproposText;}

    public void setAproposText(String aproposText) {this.aproposText = aproposText;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Neighbour neighbour = (Neighbour) o;
        return Objects.equals(id, neighbour.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
