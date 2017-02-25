package pl.sda.movieBuilder;

/**
 * Created by RENT on 2017-02-25.
 */
public class Movie {

    private String title;
    private String direction;
    private String scenario;
    private String type;
    private String production;

    public String getTitle() {
        return title;
    }

    public String getDirection() {
        return direction;
    }

    public String getScenario() {
        return scenario;
    }

    public String getType() {
        return type;
    }

    public String getProduction() {
        return production;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "Movie{" + "\n" +
                "title='" + title + '\'' + "\n" +
                "direction='" + direction + '\'' + "\n" +
                "scenario='" + scenario + '\'' + "\n" +
                "type='" + type + '\'' + "\n" +
                "production='" + production + '\'' + "\n" +
                '}';
    }
}
