import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String NMStr = sc.nextLine();
        int N = Integer.parseInt(NMStr.split(" ")[0]);
        int M = Integer.parseInt(NMStr.split(" ")[1]);

        if (N < 1 || N > 100) {
            return;
        }
        if(M < 1 || M > N) {
            return;
        }

        ArrayList<String> students = new ArrayList<>();
        HashMap<String, Integer> studentsMap = new HashMap<String, Integer>();

        int tempStudentCount = 0;
        String tempStudents = "";
        for(int i = 0; i < N; i++) {
            tempStudentCount = Integer.parseInt(sc.nextLine());
            tempStudents = sc.nextLine();

            for (String j : tempStudents.split(" ", tempStudentCount)) {
                students.add(j);    
            }    

            tempStudentCount = 0;
        }
        
        for (int i = 0; i < students.size(); i++) {
            if (studentsMap.containsKey(students.get(i))) {
                studentsMap.put( students.get(i), studentsMap.get(students.get(i)) + 1);
            } else {
                studentsMap.put(students.get(i), Integer.valueOf(1));
            }
        }

        int count = 0;
        for(int i : studentsMap.values()) {
            if (i >= M) {
                count++;
            }
        }
        
        System.out.println(count);


    }
    
}
