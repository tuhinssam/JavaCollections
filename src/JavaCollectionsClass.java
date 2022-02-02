import java.util.*;

public class JavaCollectionsClass {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(17);
        arrayList.add(7);
        arrayList.add(47);
        arrayList.add(67);
        arrayList.add(17);
        arrayList.add(13);
        arrayList.add(17);
        System.out.println("min element: "+ Collections.min(arrayList));
        System.out.println("max element: "+ Collections.max(arrayList));
        System.out.println("min element: "+ Collections.frequency(arrayList, 17));

        Collections.sort(arrayList, Comparator.reverseOrder());
        System.out.println(arrayList);

        List<Student> students= new ArrayList<>();
        students.add(new Student("tuhin",1));
        students.add(new Student("rudransh",2));
        students.add(new Student("wrik",3));
        students.add(new Student("tuhin",1));
        System.out.println(students);

        Student s1 = new Student("tuhin",1);
        Student s2 = new Student("tuhin",2);

        System.out.println(s1.compareTo(s2));
        Collections.sort(students, Comparator.reverseOrder());
        System.out.println(students);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });
        System.out.println(students);

        //above function using lambda exp
        Collections.sort(students, (o1,o2) -> s1.name.compareTo(s2.name));
        System.out.println(students);

    }
}
