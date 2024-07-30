package processor;

import model.CourseSchedule;

import java.util.ArrayList;
import java.util.Map;

public class Selection {

    public static ArrayList<Map.Entry<CourseSchedule, CourseSchedule>> selectWithoutElitism(CourseSchedule[] courseSchedules) {
        ArrayList<Map.Entry<CourseSchedule, CourseSchedule>> parentsPair = new ArrayList<>();
        int counter = 1;

        for (int i = 0; i < courseSchedules.length; i++ ) {
            parentsPair.add(Map.entry(courseSchedules[i], courseSchedules[courseSchedules.length - counter]));
            counter ++;
        }

        return parentsPair;
    }


}
