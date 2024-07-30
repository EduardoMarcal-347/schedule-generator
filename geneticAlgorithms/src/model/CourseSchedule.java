package model;

import utils.GlobalEnv;

import java.util.ArrayList;
import java.util.Arrays;

public class CourseSchedule {

    private ArrayList<LessonSession> sessions = new ArrayList<>(  );
    private double geneticAvaliation;

    public CourseSchedule() {
        this.geneticAvaliation = GlobalEnv.MAXIMUM_AVALIATION_VALUE;
    }

    public CourseSchedule( ArrayList<LessonSession> sessions ) {
        this.sessions = sessions;
        this.geneticAvaliation = GlobalEnv.MAXIMUM_AVALIATION_VALUE;
    }

    public void decreaseAvaliation() {
        this.geneticAvaliation -= 0.25;
    }

    public void addSession( LessonSession session ) {
        sessions.add( session );
    }

    public ArrayList<LessonSession> getSessions( ) {
        return sessions;
    }

    public void setSessions( ArrayList<LessonSession> sessions ) {
        this.sessions = sessions;
    }

    public double getGeneticAvaliation( ) {
        return geneticAvaliation;
    }

    public void setGeneticAvaliation( double geneticAvaliation ) {
        this.geneticAvaliation = geneticAvaliation;
    }

    public void printSchedule() {
        for( LessonSession session : sessions) {
            System.out.println("Semester: " + session.getSemester() + " | Subject: " + session.getSubject() + " | Day: " +
                    session.getDayOfWeek() + " | Professor: " + session.getTeacher() + " | Periods: " + Arrays.toString( session.getLessonPeriods( ) ) );
        }
    }
}
