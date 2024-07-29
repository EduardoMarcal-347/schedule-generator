import model.CourseSchedule;
import processor.Populate;

public class Main {

    public static void main(String[] args) {
        Populate populateProcessor = new Populate();
        CourseSchedule initialPopulation = populateProcessor.generateInitialPopulation();
        initialPopulation.printSchedule();
    }

}