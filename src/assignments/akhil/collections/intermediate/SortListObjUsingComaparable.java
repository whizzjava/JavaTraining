package assignments.akhil.collections.intermediate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

class Movie1 implements Comparable<Movie1>
{
    String movieName;

    String hero;
    String heroine;
    LocalDate releaseDate;
    int collections;

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", hero='" + hero + '\'' +
                ", heroine='" + heroine + '\'' +
                ", releaseDate=" + releaseDate +
                ", collections=" + collections +
                '}';
    }
    @Override
    public int compareTo(Movie1 m1) {
        return this.movieName.compareTo(m1.movieName);
    }

    public Movie1(String movieName, String hero, String heroine, LocalDate releaseDate, int collections) {
        this.movieName = movieName;
        this.collections = collections;
        this.hero = hero;
        this.heroine = heroine;
        this.releaseDate = releaseDate;
    }
}
public class SortListObjUsingComaparable  {



    public static void main(String[] args) {
        ArrayList<Movie1> movies1=new ArrayList<>();
        movies1.add(new Movie1("Darling", "Prabhas", "Kajal", LocalDate.of(2010,4,23), 10000000));
        movies1.add(new Movie1("Baahubali", "Prabhas", "Anushka", LocalDate.of(2015, 7, 10), 150000000));
        movies1.add(new Movie1("Pushpa", "Allu Arjun", "Rashmika", LocalDate.of(2021, 12, 17), 130000000));

        Collections.sort(movies1);
        movies1.forEach(System.out::println);


    }
}
