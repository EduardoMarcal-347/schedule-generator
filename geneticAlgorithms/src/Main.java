import model.CourseSchedule;
import processor.CrossBreed;
import processor.Ordenate;
import processor.Populate;
import processor.Selection;

import java.util.ArrayList;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Populate populateProcessor = new Populate();
        CourseSchedule[] initialPopulation = populateProcessor.generateInitialPopulation( );
        CourseSchedule[] ordenatedPop = Ordenate.ordenatePopulationAvaliation( initialPopulation );
        ArrayList<Map.Entry<CourseSchedule,CourseSchedule>> parents = Selection.selectWithoutElitism( ordenatedPop );

        for ( CourseSchedule courseSchedule : ordenatedPop ) {
            System.out.println("Avaliation of individual genetics: " + courseSchedule.getGeneticAvaliation());
        }

        System.out.println( "parents size: " + parents.size() );
        for ( Map.Entry<CourseSchedule, CourseSchedule> parent : parents ) {
            System.out.println( "Pai: " + parent.getKey().getGeneticAvaliation() + ", Mãe: " + parent.getValue().getGeneticAvaliation());
        }

        CourseSchedule[] mixedSchedules = CrossBreed.crossSchedulesGenetics( parents );
        for ( CourseSchedule mixedSchedule : mixedSchedules ) {
            System.out.println("Avaliation of individual genetics 2º generation: " + mixedSchedule.getGeneticAvaliation() );
        }

    }

}