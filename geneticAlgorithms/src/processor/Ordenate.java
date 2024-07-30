package processor;

import model.CourseSchedule;

public class Ordenate {

    public static CourseSchedule[] ordenatePopulationAvaliation(CourseSchedule[] array) {
        for (int i = 1; i < array.length; i++) {
            CourseSchedule currentSchedule = array[i];
            int counter = i - 1;
            while (counter >= 0 && array[counter].getGeneticAvaliation() < currentSchedule.getGeneticAvaliation()) {
                array[counter + 1] = array[counter];
                counter--;
            }
            array[counter + 1] = currentSchedule;
        }
        return array;
    }

}
