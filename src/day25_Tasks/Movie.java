package day25_Tasks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country;
    public String title;
    public String Genre;
    public LocalDate releaseDate;
    public String director;
    public ArrayList<String> casts = new ArrayList<>();

    public Movie(String country, String title, LocalDate releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    public void addCast(String cast){
        casts.add(cast);
    }

    public void addCasts(String[] array){
        casts.addAll(Arrays.asList(array));
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", total casts=" + casts.size() +
                '}';
    }
}
