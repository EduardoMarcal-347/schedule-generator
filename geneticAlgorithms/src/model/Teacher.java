package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Teacher {

    private String name;
    private ArrayList<String> ministradedSubject;
    private HashMap<String, Integer> timesSubjectUsed = new HashMap<>();

    public Teacher( String name, ArrayList<String> ministradedSubject ) {
        this.name = name;
        this.ministradedSubject = ministradedSubject;
        for ( String subject : ministradedSubject ) {
            timesSubjectUsed.put( subject, 0 );
        }
    }

    public Teacher( ) {
    }

    public String getName( ) {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public ArrayList<String> getMinistradedSubject( ) {
        return ministradedSubject;
    }

    public String getSubject() {
        String subject = ministradedSubject.getFirst();
        int timesUsed = timesSubjectUsed.get( subject );
        if ( timesSubjectUsed.get( subject ) == 2 ) return ministradedSubject.removeFirst();
        timesSubjectUsed.put( subject, ++timesUsed );
        return subject;
    }

    public void setMinistradedSubject( ArrayList<String> ministradedSubject ) {
        this.ministradedSubject = ministradedSubject;
    }
}
