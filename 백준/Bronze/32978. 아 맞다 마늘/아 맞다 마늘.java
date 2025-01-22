import java.util.Scanner;


// 백준 32978
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());


        String inputString = sc.nextLine();
        String[] ingredients = inputString.split(" ");

        String inputStringMinusOne = sc.nextLine();
        String[] ingredientsMinusOne = inputStringMinusOne.split(" ");

        if(ingredients.length < 2 || ingredients.length > 1000) {
            return;
        }

        boolean isExist = false;
        for(String i : ingredients) {
            for(String t : ingredientsMinusOne) {
                if(i.length() > 20 || t.length() > 20) {
                    return;
                }
                // i == t 하면 안되네 ? String 은 직접 비교가 안되나?
                if (i.equals(t)) {
                    isExist = true;
                }
            }
            if(!isExist) {
                System.out.print(i);
                return;
            }
            isExist = false;
        }

    }

}
