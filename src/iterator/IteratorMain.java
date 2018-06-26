package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {

    private static  final int REQUIRED_ATTENDANCE = 80; // lankomumas procentais
    private static  final int LESSONS = 11; // is viso paskaitu

    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students("R", 1));
        students.add(new Students("K", 9));
        students.add(new Students("O", 6));
        students.add(new Students("P", 11));
        students.add(new Students("E", 10));
        students.add(new Students("F", 8));

        System.out.println("\nBefore: " + students);
        Iterator<Students> studentsIterator = students.iterator();
        Students st = null;
        while (studentsIterator.hasNext()) {
            st = studentsIterator.next();
           double attended = st.getAttendance()  * 100 / LESSONS;
           if(attended < REQUIRED_ATTENDANCE) {
               studentsIterator.remove();
           }
        }
        System.out.println("After: " + students);
    }
}
