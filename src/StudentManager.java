import java.util.*;

public class StudentManager {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ahmet", "Yilmaz", 101, 85.5));
        studentList.add(new Student("Ayse", "Kaya", 102, 92.0));
        studentList.add(new Student("Mehmet", "Demir", 103, 68.0));
        studentList.add(new Student("Fatma", "Celik", 104, 78.5));


        Map<Integer, Student> studentMap = new HashMap<>();
        for (Student s : studentList) {
            studentMap.put(s.getId(), s);
        }


        studentList.removeIf(s -> s.getId() == 103);
        studentMap.remove(103);


        studentList.sort(Comparator.comparingDouble(Student::getGrade).reversed());

        System.out.println("--- Sorted Student List (High to Low Grade) ---");
        for (Student s : studentList) {
            System.out.println(s);
        }


        double totalGrade = 0;
        for (Student s : studentList) {
            totalGrade += s.getGrade();
        }
        double average = totalGrade / studentList.size();

        System.out.println("----------------------------------------");
        System.out.println("Average Grade of Students: " + average);


        Set<Integer> uniqueStudentIds = new HashSet<>(studentMap.keySet());
        System.out.println("Active Student IDs (Set): " + uniqueStudentIds);
    }
}

