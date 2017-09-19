import java.util.*;

public class Application {

    public static void main (String[] args) {

        Random rn = new Random();
        Student[] students = new Student[5];
        students[0] = new Student();
        students[0].setName("Ivan");
        students[0].setLastName("Petrov");

        students[1] = new Student();
        students[1].setName("Vova");
        students[1].setLastName("Petrov");

        students[2] = new Student();
        students[2].setName("Katya");
        students[2].setLastName("Petrova");

        students[3] = new Student();
        students[3].setName("Masha");
        students[3].setLastName("Petrova");

        students[4] = new Student();
        students[4].setName("Kolya");
        students[4].setLastName("Petrov");

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < students.length; i ++) {
            int mark = rn.nextInt(5) + 1;
            result.add(mark);
        }

        OptionalDouble average = result.stream().mapToInt(Integer::intValue).average();
        System.out.println("Average student score was: " + average);

        /*
        List<Object> studentsWithMarks = new ArrayList<Object>();
        for (int i = 0; i < students.length; i ++) {
            Map<String, Object> studentMap = new HashMap();
            int studentMark = rn.nextInt(5) + 1;
            studentMap.put("result", studentMark);
            studentMap.put("student", Arrays.asList(students).get(i));
            studentsWithMarks.add(studentMap);
        }

        int markSum = 0;
        for (Object student : studentsWithMarks) {
            markSum += (int)((Map)student).get("result");
        }

       System.out.println("Average student score was: " + markSum / studentsWithMarks.size());
       */

        /*
        int[] number = {0, 1, 2, 3, 4};

        double average = 0;
        if (number.length > 0)
        {
            double sum = 0;

            for (int j = 0; j < 5; j++) {
                sum += number[j];
            }
            average = sum / 5;

            System.out.println( (int)(Math.random()*4) );

        }
        */

    }
}
