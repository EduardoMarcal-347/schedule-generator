public class SessionSchedule {

    private Session[] sessions = new Session[50];

    public SessionSchedule() {
    }

    public SessionSchedule(Session[] sessions) {
        this.sessions = sessions;
    }

    public Session[] getSessions() {
        return sessions;
    }

    public void setSessions(Session[] sessions) {
        this.sessions = sessions;
    }

    public void printSchedule() {
        for(Session session : sessions) {
            System.out.println("Semester: " + session.getSemester() + " | Subject: " + session.getSubject() + " | Day" +
                    session.getDayOfWeek() + " | Professor: " + session.getProfessor() + " | Periods: " + session.getSessionPeriod());
        }
    }
}
