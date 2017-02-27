package pl.sda.mvc.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-02-27.
 */
public class ModelFacade {

    public static List<Long> getValuesThroughFaced() {
        return Model.getValues();
    }

    public static void addValueThroughFaced(long newValue) {
        Model.addValue(newValue);
    }
}
