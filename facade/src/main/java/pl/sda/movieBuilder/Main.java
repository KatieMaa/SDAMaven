package pl.sda.movieBuilder;

/**
 * Created by RENT on 2017-02-25.
 */
public class Main {

    public static void main(String[] args) {
        MovieBuilder movieBuilder = new MovieBuilder();

        Movie movie = movieBuilder.withTitle("La la land").withDirection("Damien Chazelle").withScenario("Damien Chazelle")
                .withType("Musical").withProduction("USA").build();

        System.out.println(movie.toString());
    }
}
