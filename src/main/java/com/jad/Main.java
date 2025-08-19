package com.jad;

import java.util.ArrayList;
import java.util.List;

import com.jad.customer.ISpectator;
import com.jad.customer.Spectator;
import com.jad.show.DefaultShowFactory;
import com.jad.show.IShow;
import com.jad.show.MovieType;
import com.jad.show.ShowFactory;

@SuppressWarnings("UtilityClassCanBeEnum")
public final class Main {
    public static void main(final String[] args) {
        final ISpectator jad = new Spectator("Jean-Aymeric", "Diet");

        // On utilise la fabrique au lieu des "new"
        final ShowFactory factory = new DefaultShowFactory();

        final List<IShow> shows = new ArrayList<>();
        shows.add(factory.makeMovieShow(
                "Titre du film",
                "Description du film",
                "Nom du réalisateur",
                "2023",
                MovieType.SCIENCE_FICTION
        ));
        shows.add(factory.makeTheaterShow(
                "Titre du spectacle de théâtre",
                "Description du spectacle de théâtre",
                "Nom du metteur en scène",
                "Nom de l'acteur 1",
                "Nom de l'acteur 2",
                "Nom de l'acteur 3"
        ));
        shows.add(factory.makeStreetShow(
                "Titre du spectacle de rue",
                "Description du spectacle de rue",
                "Nom de l'artiste 1",
                "Nom de l'artiste 2",
                "Nom de l'artiste 3"
        ));
        shows.add(factory.makeConcertShow(
                "Titre du concert",
                "Description du concert",
                "Nom de l'artiste ou du groupe"
        ));

        // Le spectateur assiste aux shows
        for (final IShow show : shows) {
            show.accept(jad);
        }
    }
}
