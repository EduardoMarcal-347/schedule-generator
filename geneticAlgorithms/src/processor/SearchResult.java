package processor;

import model.CourseSchedule;
import utils.GlobalEnv;

public class SearchResult {

    public static CourseSchedule searchIdealIndividual(CourseSchedule[] population) {
        for ( CourseSchedule individual : population ) {
            if (individual.getGeneticAvaliation() == GlobalEnv.MAXIMUM_AVALIATION_VALUE ) return individual;
        }
        return null;
    }

}
