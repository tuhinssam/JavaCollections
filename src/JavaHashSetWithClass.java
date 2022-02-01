import java.util.HashSet;
import java.util.Set;

public class JavaHashSetWithClass {
    public static void main(String[] args) {
        Set<Student> studentSet= new HashSet<>();
        studentSet.add(new Student("tuhin",1));
        studentSet.add(new Student("rudransh",2));
        studentSet.add(new Student("wrik",3));
        studentSet.add(new Student("tuhin",1));
        System.out.println(studentSet);

        Student s1 = new Student("tuhin",1);
        Student s2 = new Student("tuhin",2);
        System.out.println(s1.equals(s2)); //returns false as rollNo is different

    }
}
