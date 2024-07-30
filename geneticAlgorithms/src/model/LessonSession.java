package model;

import utils.GlobalEnv;

public class LessonSession {

    private int semester;
    private String dayOfWeek;
    private String teacher;
    private String subject;
    private int[] lessonPeriods = new int[2];


    public LessonSession( String teacher, int semester, String subject, int[] sessionPeriod, String dayOfWeek) {
        this.teacher = teacher;
        this.semester = semester;
        this.subject = subject;
        this.lessonPeriods = sessionPeriod;
        this.dayOfWeek = dayOfWeek;
    }

    public LessonSession( LessonSession entity) {
        this.teacher = entity.teacher;
        this.semester = entity.semester;
        this.subject = entity.subject;
        this.lessonPeriods = entity.lessonPeriods;
        this.dayOfWeek = entity.dayOfWeek;
    }

    public LessonSession() {
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher( String teacher ) {
        this.teacher = teacher;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int[] getLessonPeriods() {
        return lessonPeriods;
    }

    public void setLessonPeriods( int[] lessonPeriods ) {
        this.lessonPeriods = lessonPeriods;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}
