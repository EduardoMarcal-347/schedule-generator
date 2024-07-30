import model.CourseSchedule;
import processor.Ordenate;
import processor.Populate;

public class Main {

    public static void main(String[] args) {
        Populate populateProcessor = new Populate();
        CourseSchedule[] initialPopulation = populateProcessor.generateInitialPopulation( );
        CourseSchedule[] ordenatedPop = Ordenate.ordenatePopulationAvaliation( initialPopulation );

        for ( CourseSchedule courseSchedule : ordenatedPop ) {
            System.out.println("Avaliation of individual genetics: " + courseSchedule.getGeneticAvaliation());
        }
    }

}