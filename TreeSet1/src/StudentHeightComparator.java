import java.util.Comparator;

public class StudentHeightComparator implements Comparator<Student> {


    @Override
    public int compare(Student s1, Student s2) {
        int courseDiff = s1.getCourse().compareTo(s2.getCourse());

        if (courseDiff == 0) {
            int sNoDiff = s1.getSno() - s2.getSno();
            if (sNoDiff == 0) {
                return 0;
            } else {
                double heightDiff = s1.getHeight() - s2.getHeight();
                if (heightDiff < 0) {
                    return -1;
                } else if (heightDiff > 0) {
                    return 1;
                } else return sNoDiff;

            }

        }
        return courseDiff;
    }


}
