package assignments.akhil.collections.intermediate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

//SortListObjUsingComptrAndComprbl
class Movie
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

    public Movie(String movieName, String hero, String heroine, LocalDate releaseDate, int collections) {
        this.movieName = movieName;
        this.collections = collections;
        this.hero = hero;
        this.heroine = heroine;
        this.releaseDate = releaseDate;
    }
}
class MovieNameComparator implements Comparator<Movie>{

    @Override
    public int compare(Movie m1, Movie m2) {
       return m1.movieName.compareTo(m2.movieName);
    }


}

class MovieHeroComparator implements Comparator<Movie>{

    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.hero.compareTo(m2.hero);
    }


}
class MovieHeroineComparator implements Comparator<Movie>{

    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.heroine.compareTo(m2.heroine);
    }


}

class MovieReleaseDateComparator implements Comparator<Movie>{

    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.releaseDate.compareTo(m2.releaseDate);
    }


}

class MovieCollectionsComparator implements Comparator<Movie>{

    @Override
    public int compare(Movie m1, Movie m2) {
        if(m1.collections>m2.collections)
        {
            return 1;
        } else if (m1.collections< m2.collections) {
            return -1;
        }
        else
            return 0;
    }


}
public class SortListObjUsingComptrAndComprbl {

    public static void main(String[] args) {
        ArrayList<Movie> movies=new ArrayList<>();

        movies.add(new Movie("Darling", "Prabhas", "Kajal", LocalDate.of(2010,4,23), 10000000));
        movies.add(new Movie("Baahubali", "Prabhas", "Anushka", LocalDate.of(2015, 7, 10), 150000000));
        movies.add(new Movie("Pushpa", "Allu Arjun", "Rashmika", LocalDate.of(2021, 12, 17), 130000000));

//        movies.sort(new MovieHeroComparator());
//        movies.sort(new MovieCollectionsComparator());
//        movies.sort(new MovieHeroineComparator());
        movies.sort(new MovieReleaseDateComparator());
        movies.forEach(System.out::println);
    }
}
