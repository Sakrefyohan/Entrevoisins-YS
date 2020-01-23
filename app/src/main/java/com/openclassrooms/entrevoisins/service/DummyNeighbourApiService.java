package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Dummy mock for the Api
 */
public class DummyNeighbourApiService implements  NeighbourApiService {

    private List<Neighbour> neighbours = DummyNeighbourGenerator.generateNeighbours();


    /**
     * {@inheritDoc}
     */
    @Override
    public List<Neighbour> getNeighbours() {
        return neighbours;
    }

    @Override
    public void changeFavoriteNeighbour(int id) {

        for (Neighbour neighbour:neighbours)
        {
            if(neighbour.getId() == id){
                neighbour.setNeighbourIsFav(!neighbour.getNeighbourIsFav());
            }

        }

    }

    @Override
    public List<Neighbour> getFavoriteNeighbour() {

        List<Neighbour> favNeighbour = new ArrayList<Neighbour>();



        for (Neighbour neighbour:neighbours)
        {
           if (neighbour.getNeighbourIsFav()){
                favNeighbour.add(neighbour);
           }

        }
        return favNeighbour;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteNeighbour(Neighbour neighbour) {
        neighbours.remove(neighbour);
    }
}
