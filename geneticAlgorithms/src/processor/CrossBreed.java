package processor;

import model.CourseSchedule;

import java.util.ArrayList;
import java.util.Map;

public class CrossBreed {

    public static CourseSchedule[] crossSchedulesGenetics (ArrayList<Map.Entry<CourseSchedule,CourseSchedule>> parents) {
        CourseSchedule[] crossBreededSchedules = new CourseSchedule[parents.size()];
        int counter = 0;
        for ( Map.Entry<CourseSchedule, CourseSchedule> parent : parents ) {
            crossBreededSchedules[counter] = mixSchedules( parent.getKey(), parent.getValue(), 3 );
            crossBreededSchedules[counter] = Avaliate.avaliateGenetics( crossBreededSchedules[counter] );
            counter++;
        }
        return crossBreededSchedules;
    }

    public static CourseSchedule mixSchedules ( CourseSchedule primaryParent, CourseSchedule secondaryParent, int crossPoint ) {
        CourseSchedule mixedSchedule = new CourseSchedule();
        int counter = 0;
        boolean usePrimaryGenetics = true;

        for (int i = 0; i<50; i++) {
            if (usePrimaryGenetics) mixedSchedule.addSession( primaryParent.getSessions().get(i) );
            else mixedSchedule.addSession( secondaryParent.getSessions().get(i) );

            counter++;
            if(counter > crossPoint) {
                counter = 0;
                usePrimaryGenetics = false;
            }
            i++;
        }
        return mixedSchedule;
    }

}
