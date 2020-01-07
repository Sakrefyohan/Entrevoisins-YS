package com.openclassrooms.entrevoisins.events;

import com.openclassrooms.entrevoisins.model.Neighbour;

public class UsersDetailsEvent {

    // Activité a lancer

    public Neighbour mNeighbour;

    public UsersDetailsEvent(Neighbour neighbour) {
        mNeighbour = neighbour;
    }
}
