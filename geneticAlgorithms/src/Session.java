public class Session {
    private String professor;
    private int semester;
    private String subject;
    private int[] sessionPeriod = new int[2];
    private String dayOfWeek;

    public Session(String professor, int semester, String subject, int[] sessionPeriod, String dayOfWeek) {
        this.professor = professor;
        this.semester = semester;
        this.subject = subject;
        this.sessionPeriod = sessionPeriod;
        this.dayOfWeek = dayOfWeek;
    }

    public Session(Session entity) {
        this.professor = entity.professor;
        this.semester = entity.semester;
        this.subject = entity.subject;
        this.sessionPeriod = entity.sessionPeriod;
        this.dayOfWeek = entity.dayOfWeek;
    }

    public Session() {
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
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

    public int[] getSessionPeriod() {
        return sessionPeriod;
    }

    public void setSessionPeriod(int[] sessionPeriod) {
        this.sessionPeriod = sessionPeriod;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}
