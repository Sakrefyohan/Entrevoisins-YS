package com.openclassrooms.entrevoisins.service;

import android.content.Intent;

import com.openclassrooms.entrevoisins.di.DI;
import com.openclassrooms.entrevoisins.model.Neighbour;

import org.hamcrest.collection.IsIterableContainingInAnyOrder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

import static com.openclassrooms.entrevoisins.ui.neighbour_list.NeighbourFragment.NEIGHBOUR;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

/**
 * Unit test on Neighbour service
 */
@RunWith(JUnit4.class)
public class NeighbourServiceTest {

    private NeighbourApiService service;



    @Before
    public void setup() {
        service = DI.getNewInstanceApiService();
    }


    //Test for deletion from favorites list
    @Test
    public void deleteNeighbourFavoritesWithSuccess() {

        // Recover a neigbour
        NeighbourApiService service = DI.getNewInstanceApiService();
        List<Neighbour> neighbours = service.getNeighbours();
        // Put a favorite neighbor
        service.changeFavoriteNeighbour(neighbours.get(0).getId());
        // Get the list of favorite neighbors
        List<Neighbour> neighboursFavorites = service.getFavoriteNeighbour();
        // Check that there is a neighbor in the favorites list
        assertEquals(1, neighboursFavorites.size());
        // Unfavoriting neigbour
        service.changeFavoriteNeighbour(neighboursFavorites.get(0).getId());
        neighboursFavorites = service.getFavoriteNeighbour();
        // Check if the neighbour have been unfavorited
        assertEquals(0, neighboursFavorites.size());


    }

    @Test
    public void getNeighboursWithSuccess() {
        List<Neighbour> neighbours = service.getNeighbours();
        List<Neighbour> expectedNeighbours = DummyNeighbourGenerator.DUMMY_NEIGHBOURS;
        assertThat(neighbours, IsIterableContainingInAnyOrder.containsInAnyOrder(expectedNeighbours.toArray()));
    }



    @Test
    public void deleteNeighbourWithSuccess() {
        Neighbour neighbourToDelete = service.getNeighbours().get(0);
        service.deleteNeighbour(neighbourToDelete);
        assertFalse(service.getNeighbours().contains(neighbourToDelete));
    }


    //Test Favourite list of neighbours
    @Test
    public void addNeighbourFavoritesWithSuccess() {
        NeighbourApiService service = DI.getNewInstanceApiService();
        List<Neighbour> neighbours = service.getNeighbours();
        service.changeFavoriteNeighbour(neighbours.get(0).getId());
        service.changeFavoriteNeighbour(neighbours.get(1).getId());
        service.changeFavoriteNeighbour(neighbours.get(2).getId());
        List<Neighbour> neighboursFavorites = service.getFavoriteNeighbour();
        assertEquals(neighboursFavorites.size(), 3);
        service.changeFavoriteNeighbour(neighbours.get(0).getId());
        service.changeFavoriteNeighbour(neighbours.get(1).getId());
        service.changeFavoriteNeighbour(neighbours.get(2).getId());
        assertEquals(service.getFavoriteNeighbour().size(), 0);

    }


}

