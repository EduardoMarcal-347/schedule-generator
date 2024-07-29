package model;

import java.util.ArrayList;
import java.util.Arrays;

public class CourseSchedule {

    private ArrayList<LessonSession> sessions = new ArrayList<>(  );

    public CourseSchedule() {
    }

    public CourseSchedule( ArrayList<LessonSession> sessions ) {
        this.sessions = sessions;
    }

    public ArrayList<LessonSession> getSessions( ) {
        return sessions;
    }

    public void setSessions( ArrayList<LessonSession> sessions ) {
        this.sessions = sessions;
    }

    public void addSession( LessonSession session ) {
        sessions.add( session );
    }

    public void printSchedule() {
        for( LessonSession session : sessions) {
            System.out.println("Semester: " + session.getSemester() + " | Subject: " + session.getSubject() + " | Day: " +
                    session.getDayOfWeek() + " | Professor: " + session.getTeacher() + " | Periods: " + Arrays.toString( session.getLessonPeriods( ) ) );
        }
    }
}
