package day25_Tasks;

import java.time.LocalDate;
import java.util.Arrays;

public class TestMovieObjects {

    public static void main(String[] args) {


        Movie movie = new Movie("USA", "Java Developer: Zero to Hero", LocalDate.of(2021,4,18), "Kuzzat Altay");
        movie.addCast("Ozzy");
        String[] casts = {"Ali", "Muhtar", "Dilbar", "Alvis"};
        movie.addCasts(casts);

        System.out.println(movie);


    }
}
