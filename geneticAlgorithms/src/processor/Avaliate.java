package processor;

import model.CourseSchedule;
import model.LessonSession;

import java.util.Arrays;
import java.util.HashMap;

public class Avaliate {

    public static CourseSchedule avaliateGenetics( CourseSchedule courseSchedule ) {
        HashMap<String, String> teacherPeriods = new HashMap<>( );
        HashMap<String, Integer> subjectPeriods = new HashMap<>( );
        StringBuilder teacherPeriodsStr;

        for ( LessonSession session : courseSchedule.getSessions( ) ) {
            teacherPeriodsStr = new StringBuilder( session.getDayOfWeek( ) ).append( Arrays.toString( session.getLessonPeriods( ) ) ).append( session.getTeacher( ) );

            if ( teacherPeriods.containsKey( teacherPeriodsStr.toString( ) ) ) {
                courseSchedule.decreaseAvaliation( 0.50 );
                session.setAvaliation( 0 );
            }
            if ( subjectPeriods.containsKey( session.getSubject() ) && subjectPeriods.get( session.getSubject() ) != session.getSemester( ) ) {
                courseSchedule.decreaseAvaliation(0.25);
                session.setAvaliation( 0 );
            }
            teacherPeriods.put( String.valueOf( teacherPeriodsStr ), session.getTeacher( ) );
            subjectPeriods.put( session.getSubject( ), session.getSemester() );
        }
        return courseSchedule;
    }

}
