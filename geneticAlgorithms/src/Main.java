import model.CourseSchedule;
import processor.Populate;

public class Main {

    public static void main(String[] args) {
        Populate populateProcessor = new Populate();
        CourseSchedule[] initialPopulation = populateProcessor.generateInitialPopulation( );
        initialPopulation[0].printSchedule();


        for ( CourseSchedule courseSchedule : initialPopulation ) {
            System.out.println("Avaliation of individual genetics: " + courseSchedule.getGeneticAvaliation());
        }
    }

}