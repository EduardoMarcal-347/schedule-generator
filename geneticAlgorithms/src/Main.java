import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {

    static int[] semesters = {1, 2, 3, 4, 5};
    static int[] sessionPeriods = {1, 2, 3, 4};
    static ArrayList<String> subjects = new ArrayList<>(Arrays.asList("Introduction to Computer Science, Programming Fundamentals, Data Structures and Algorithms," +
            " Object-Oriented Programming, Software Engineering Principles, Computer Networks, Database Management Systems" +
            "Operating Systems, Web Development, Cybersecurity Fundamentals, Artificial Intelligence, Machine Learning" +
            "Human-Computer Interaction, Mobile Application Development, Cloud Computing, Big Data Analytics," +
            "Computer Graphics, Computer Vision, Natural Language Processing, Internet of Things (IoT), Blockchain Technology" +
            "Parallel and Distributed Computing, Game Development, Robotics and Automation, Ethical Hacking and Penetration Testing"));
    static String[] professorKeys = { "Claudio Ricardo", "Alexandre Ganso", "Rita Cee", "Luiza Souza", "Vagner Hate",
            "Louro José", "Marcelo Siqueira", "Adam Marinho", "Bob de Oliveira", "Maria Alexandrina",
            "Carla Diaz", "Lua Freire"};
    static HashMap<String, Integer> professors = new HashMap<String, Integer>() {{
        put("Claudio Ricardo", 0);
        put("Alexandre Ganso", 0);
        put("Rita Cee", 0);
        put("Luiza Souza", 0);
        put("Vagner Hate", 0);
        put("Louro José", 0);
        put("Marcelo Siqueira", 0);
        put("Adam Marinho", 0);
        put("Bob de Oliveira", 0);
        put("Maria Alexandrina", 0);
        put("Carla Diaz", 0);
        put("Lua Freire", 0);
    }};

    public static void main(String[] args) {

        SessionSchedule[] initialPop = new SessionSchedule[100];

        for(int i = 0; i < 100; i++) {
            SessionSchedule currentSchedule = new SessionSchedule();
            for(int j = 0; j < 50; j++){
                ArrayList<String> daysOfWeek = new ArrayList<>(
                        Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday"));
                for(int k = 0; k < daysOfWeek.size(); k++ ) {
                    Session session = new Session();

                    if (subjects.size() > 1) {
                        do {
                            String professorKey = professorKeyByIndex((int) Math.random() * 12);
                            if (professors.get(professorKey) == 0) {
                                session.setProfessor(professorKey);
                                professors.put(professorKey, 1);
                                break;
                            }
                        } while (true);
                    }
                }

                int sortedSubject = (int) Math.random() * subjects.size();
                session.setSubject(subjects.get(sortedSubject));
                subjects.remove(sortedSubject);


            }

        }
    }

    public static String professorKeyByIndex(int index) {
        return professorKeys[index];
    }

}