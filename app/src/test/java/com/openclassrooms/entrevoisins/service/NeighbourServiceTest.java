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

    //Test créer

    //Test Liste favoris de voisins
    @Test
    public void getNeighbourFavoritesWithSuccess() {
        List<Neighbour> neighbours = service.getNeighbours();
        service.changeFavoriteNeighbour(neighbours.get(0).getId());
        service.changeFavoriteNeighbour(neighbours.get(1).getId());
        service.changeFavoriteNeighbour(neighbours.get(2).getId());
        List<Neighbour> neighboursFavorites = service.getFavoriteNeighbour();
        assertEquals(neighboursFavorites.size(), 3);

    }

    //Test de suppression de la liste des favoris
    @Test
    public void deleteNeighbourFavoritesWithSuccess() {
        //Recupere un neigbour
        List<Neighbour> neighbours = service.getNeighbours();
        //Mets un neighbour favoris
        service.changeFavoriteNeighbour(neighbours.get(0).getId());
        //Recupere la liste des neighbour favoris
        List<Neighbour> neighboursFavorites = service.getFavoriteNeighbour();
        //Verifie qu'il y a bien un voisin dans la liste favoris
        assertEquals(neighboursFavorites.size(), 1);
        //Supprime un voisin
        Neighbour neighbourToDelete = service.getFavoriteNeighbour().get(0);
        service.deleteNeighbour(neighbourToDelete);
        //Verifier si la liste contient bien le voisins a supprimer
        assertFalse(service.getFavoriteNeighbour().contains(neighbourToDelete));


    }
}

