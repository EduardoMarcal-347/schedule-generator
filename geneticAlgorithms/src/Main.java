import model.CourseSchedule;
import processor.*;

import java.util.ArrayList;
import java.util.Map;

public class Main {

    public static void main( String[] args ) {

        CourseSchedule[] parentsPopulation = new CourseSchedule[100];
        int counter = 0;
        Mutate mutationStage = new Mutate( );
        Populate populateProcessor = new Populate( );
        parentsPopulation = populateProcessor.generateInitialPopulation( );
        parentsPopulation[0].printSchedule();


//        while ( true ) {
//            if (parentsPopulation[0] == null) {
//                parentsPopulation = populateProcessor.generateInitialPopulation( );
//            }
//
//            Ordenate.ordenatePopulationAvaliation( parentsPopulation );
//            ArrayList<Map.Entry<CourseSchedule, CourseSchedule>> parents = Selection.selectWithoutElitism( parentsPopulation );
//            CourseSchedule[] population = CrossBreed.crossSchedulesGenetics( parents );
//            CourseSchedule[] mutatedPopulation = mutationStage.mutatePopulation( population, 0.9 );
//            CourseSchedule result = SearchResult.searchIdealIndividual( mutatedPopulation );
//            if ( result != null ) {
//                System.out.println( "resultado encontrado na "+ counter + " geração." );
//                result.printSchedule( );
//                break;
//            }
//            else {
//                for ( CourseSchedule mutatedIndividual : mutatedPopulation ) {
//                    System.out.println( "Avaliation of mutated individual genetics " + counter + "° generation: " + mutatedIndividual.getGeneticAvaliation( ) );
//                }
//            }
//            parentsPopulation = mutatedPopulation;
//            counter++;
//        }

    }


}