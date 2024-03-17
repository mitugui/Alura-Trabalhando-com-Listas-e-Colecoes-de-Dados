package br.com.screenmatch.main;

import java.util.ArrayList;

import br.com.screenmatch.models.Film;
import br.com.screenmatch.models.Serie;
import br.com.screenmatch.models.Tittle;

public class MainWithLists {
    public static void main(String[] args) {
        Film favoriteMovie = new Film("The Matrix", 1999);
        Film otherMovie = new Film("John Wick", 2014);
        Film mituguiMovie = new Film("Past Lives", 2023);
        Serie favoriteSerie = new Serie("The Office", 2005);
        
        ArrayList<Tittle> watchedList = new ArrayList<>();
        watchedList.add(favoriteMovie);
        favoriteMovie.setRating(9);
        watchedList.add(otherMovie);
        otherMovie.setRating(6);
        watchedList.add(mituguiMovie);
        mituguiMovie.setRating(8);
        watchedList.add(favoriteSerie);

        for (Tittle item:watchedList) {
            System.out.print(item.getName());
            Film film = (Film) item;
            System.out.println(" - " + film.getClassification());
        }

        // Outra opção de foreach (lambda):
        // watchedList.forEach(item -> {
        //     System.out.println(item.getName());
        //     Film film = (Film) item;
        //     System.out.println(" - " + film.getClassification());
        // });

        // Outra opção de for-each (Method Reference):
        // watchedList.forEach(System.out::println);
    }
}
