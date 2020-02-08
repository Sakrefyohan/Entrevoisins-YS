package com.openclassrooms.entrevoisins.events;

import com.openclassrooms.entrevoisins.model.Neighbour;

public class UsersDetailsEvent {

    // Activity to launch

    public Neighbour mNeighbour;

    public UsersDetailsEvent(Neighbour neighbour) {
        mNeighbour = neighbour;
    }
}
