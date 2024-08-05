package processor;

import model.CourseSchedule;
import model.LessonSession;
import model.Teacher;

import java.util.ArrayList;
import java.util.Arrays;

public class Mutate {

    private ArrayList<Teacher> teachers;

    public CourseSchedule[] mutatePopulation(CourseSchedule[] population, double mutationRate) {
        int counter = 0;
        CourseSchedule[] mutatedPopulation = new CourseSchedule[population.length];
        for ( CourseSchedule individual : population ) {
            initializeTeachers();
            int k = 0;
            for ( LessonSession gene : individual.getSessions( ) ) {
                if ( Math.random() < mutationRate && gene.getAvaliation()==0 ) individual.substituteSession( gene , mutateGene( k, individual ) );
                k++;
            }
            mutatedPopulation[counter] = Avaliate.avaliateGenetics( individual );
            counter++;

        }
        return mutatedPopulation;
    }

    public LessonSession mutateGene(int geneIndex, CourseSchedule individual ) {
        LessonSession geneAnalising = individual.getSessions().get( geneIndex );
        for (int i = geneIndex; i< 50; i++) {
            LessonSession currentGene = individual.getSessions( ).get( i );
            if (currentGene.getAvaliation() == 0 && !currentGene.getTeacher().equals( geneAnalising.getTeacher() )) {
                LessonSession result = new LessonSession();
                result.setTeacher( currentGene.getTeacher() );
                result.setSubject( currentGene.getSubject() );
                result.setSemester( geneAnalising.getSemester() );
                result.setDayOfWeek( geneAnalising.getDayOfWeek( ) );

                currentGene.setSubject( geneAnalising.getSubject() );
                currentGene.setTeacher( geneAnalising.getTeacher() );
                return result;
            }
        }
        return geneAnalising;
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
}
