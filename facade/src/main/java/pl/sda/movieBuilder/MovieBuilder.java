package pl.sda.movieBuilder;

/**
 * Created by RENT on 2017-02-25.
 */
public class MovieBuilder {
    private Movie movie;

    public MovieBuilder() {
        movie = new Movie();
    }

    public MovieBuilder withTitle(String title) {
        movie.setTitle(title);
        return this;
    }

    public MovieBuilder withDirection(String direction) {
        movie.setDirection(direction);
        return this;
    }

    public MovieBuilder withScenario(String scenario) {
        movie.setScenario(scenario);
        return this;
    }

    public MovieBuilder withType(String type) {
        movie.setType(type);
        return this;
    }

    public MovieBuilder withProduction(String production) {
        movie.setProduction(production);
        return this;
    }

    public Movie build() {
        return movie;
    }

}
