package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DummyNeighbourGenerator {

    public static List<Neighbour> DUMMY_NEIGHBOURS = Arrays.asList(
            new Neighbour(1, "Caroline", "http://i.pravatar.cc/150?u=a042581f4e29026704d", "01.95.18.76749", "23  place Maurice-Charretier à 3km","4668s44hpv6@yaho.com","Soigner va quoi costume parents m’encourageaient minutes j'étais ceux jour grêle appellera. "),
            new Neighbour(2, "Jack", "http://i.pravatar.cc/150?u=a042581f4e29026704e", "01.95.18.76749", "79  Rue de Verdun à 2km","4668s44hpv6@youhou.com","C'est village lorsqu’il luxe capitale crains région journée maintenant et. Andrew près studio basilique aider aller d'être sur pleuvoir détestait. Va changer remplie tombe encore parce dans avoir promène. Temps n'ai qu'on docteur lycéen. Croissants lui pied. Glace délicieux pleurait policier que."),
            new Neighbour(3, "Chloé", "http://i.pravatar.cc/150?u=a042581f4e29026704f", "04.56.81.77611", "89  avenue Voltaire à 21km","4668s44hpv6@bientot.net","Moi peu s21h beaux. Volontaire en si aux. Rêves côté tombe votre m’encourageaient a policier que alors cœur risques mais. Un 30 donc jour aura lycéen repas serveur dieu sommet quoi. Si n'est-ce aussi changer n'est-ce nous je produits."),
            new Neighbour(4, "Vincent", "http://i.pravatar.cc/150?u=a042581f4e29026704a", "04.56.81.77658", "100  Square de la Couronne à 1km","9ym7awpo0gv@fini.com"," pas. Puissiez défendre durer ascenseurs et temps choisir pizzas savoir ruelles. Pourtant semaine ma pompier météo plats bien garnier pied grêle. Glace délicieux pleurait policier que."),
            new Neighbour(5, "Elodie", "http://i.pravatar.cc/150?u=a042581f4e29026704b", "01.63.95.77709", "122  Rue Hubert de Lisle à 5km","46687857pv6@le.fr","Souvent sera près disponible bcou temps choisir pizzas savoir ruelles. Pourtant semaine ma pompier météo plats bien garnier pied grêle. Glace délicieux pleurait policier que."),
            new Neighbour(6, "Sylvain", "http://i.pravatar.cc/150?u=a042581f4e29026704c", "01.63.95.77919", "129  Rue Hubert de Lisle à 3km","gferggerv6@projet.co.uk","Soigner va quoi costume parents m’encourageaient minutes j'étais clace délicieux pleurait policier que."),
            new Neighbour(8, "Dan", "http://i.pravatar.cc/150?u=a042581f4e29026703b", "04.56.73.84347", "89  rue de la Hulotais à 3km","78typv6@Jesuisheureux.zip"," L'art sans. Tard vérifier 21h gens village mathématiques savoir passion. Il sommet j'avais peins.fompier météo plats bien garnier pied grêle. Glace délicieux pleurait policier que."),
            new Neighbour(9, "Joseph", "http://i.pravatar.cc/150?u=a042581f4e29026704d", "04.56.73.84326", "127  rue de la Hulotais à 5km","rth694hpv6@gravelong.gg"," 21h région sont il près tables congélation. Beaucoup peine montmartre voulais visitant victor. Manger obée. Splendide garemps choisir pizzas savoir ruelles. Pourtant semaine ma pompier météo plats bien garnier pied grêle. Glace délicieux pleurait policier que."),
            new Neighbour(10, "Emma", "http://i.pravatar.cc/150?u=a042581f4e29026706d", "01.37.06.34065", "143  rue Banaudon à 9km","rg28v6@detoutremplir.fr","21h l'île qu'on éclair pourrez pense lorsqu’il roman. Neige café pleurait ça quel détestait paris rêves demander d'avocat. Pouvait près dentiste bar disponible occupés notre ou unger avec julie. Problème ma pas. Puissiez défendre durer ascenseurs et temps choisir pizzas savoir ruelles. Pourtant semaine ma pompier météo plats bien garnier pied grêle. Glace délicieux pleurait policier que."),
            new Neighbour(11, "Patrick", "http://i.pravatar.cc/150?u=a042581f4e29026702d", "01.37.06.34419", "113  rue de la République à 7km","4erg1hpv6@alamain.fr","Souvent sera près disdre durer ascenseurs et temps choisir pizzas savoir ruelles. Pourtant semaine ma pompier météo plats bien garnier pied grêle. Glace délicieux pleurait policier que."),
            new Neighbour(12, "Ludovic", "http://i.pravatar.cc/150?u=a042581f3e39026702d", "01.44.55.87717", "83  rue de la République à 10km","75257gh@classesmail.net","30 après excusez-moi vue verdure ruelles fait promène l'ambiatant semaine ma pompier météo plats bien garnier pied grêle. Glace délicieux pleurait policier que.")
    );

    static List<Neighbour> generateNeighbours() {
        return new ArrayList<>(DUMMY_NEIGHBOURS);
    }
}
