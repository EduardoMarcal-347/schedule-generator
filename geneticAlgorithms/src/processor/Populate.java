package processor;

import model.CourseSchedule;
import model.LessonSession;
import model.Teacher;
import utils.GlobalEnv;

import java.util.ArrayList;
import java.util.Arrays;


public class Populate {

    private ArrayList<Teacher> teachers;

    public CourseSchedule[] generateInitialPopulation() {
        CourseSchedule[] initialPopulation = new CourseSchedule[100];
        for (int i = 0; i < initialPopulation.length; i++) {
            initialPopulation[i] = generateRandomPopulation();
        }
        return initialPopulation;
    }

    public CourseSchedule generateRandomPopulation() {
        initializeTeachers();
        CourseSchedule population = new CourseSchedule();
        for (int i = 0; i < GlobalEnv.TOTAL_TERMS; i++ ) {
            for(String day : GlobalEnv.DAYS_OF_WEEK) {
                for (int[] period : GlobalEnv.TOTAL_LESSON_PERIODS) {
                    LessonSession session = getRandomLessonSession( i, day, period );
                    population.addSession( session );
                }
            }
        }

        return Avaliate.avaliateGenetics( population );
    }

    public void initializeTeachers() {
        this.teachers = new ArrayList<>(
                Arrays.asList(
                        new Teacher("Claudio Ricardo", new ArrayList<>( Arrays.asList("Introduction to Computer Science", "Programming Fundamentals", "Data Structures and Algorithms"))),
                        new Teacher("Alexandre Ganso", new ArrayList<>( Arrays.asList("Object-Oriented Programming", "Software Engineering Principles"))),
                        new Teacher("Rita Cee", new ArrayList<>( Arrays.asList("Computer Networks", "Database Management Systems"))),
                        new Teacher("Luiza Souza", new ArrayList<>( Arrays.asList("Operating Systems", "Web Development"))),
                        new Teacher("Vagner Hate", new ArrayList<>( Arrays.asList("Cybersecurity Fundamentals", "Artificial Intelligence"))),
                        new Teacher("Louro José", new ArrayList<>( Arrays.asList("Machine Learning", "Human-Computer Interaction"))),
                        new Teacher("Marcelo Siqueira", new ArrayList<>( Arrays.asList("Mobile Application Development", "Cloud Computing"))),
                        new Teacher("Adam Marinho", new ArrayList<>( Arrays.asList("Big Data Analytics","Computer Graphics"))),
                        new Teacher("Bob de Oliveira", new ArrayList<>( Arrays.asList("Computer Vision", "Natural Language Processing"))),
                        new Teacher("Maria Alexandrina", new ArrayList<>( Arrays.asList("Internet of Things (IoT)", "Blockchain Technology"))),
                        new Teacher("Carla Diaz", new ArrayList<>( Arrays.asList("Parallel and Distributed Computing", "Game Development"))),
                        new Teacher("Lua Freire", new ArrayList<>( Arrays.asList("Robotics and Automation", "Ethical Hacking and Penetration Testing")))
                )
        );
    }

    public LessonSession getRandomLessonSession(int semester, String dayOfWeek, int[] lessonPeriods) {
        LessonSession lesson = new LessonSession(  );
        Teacher teacher = teachers.get( ( int ) (Math.random() * teachers.size()) );
        lesson.setSemester( semester );
        lesson.setDayOfWeek( dayOfWeek );
        lesson.setTeacher( teacher.getName( ) );
        lesson.setSubject( teacher.getSubject( ) );
        lesson.setLessonPeriods( lessonPeriods );
        if( teacher.getMinistradedSubject( ).isEmpty( ) ) teachers.remove( teacher );
        return lesson;
    }

}
