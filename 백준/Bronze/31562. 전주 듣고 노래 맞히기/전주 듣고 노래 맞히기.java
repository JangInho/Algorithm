import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String NMinput = sc.nextLine();

        int N = 0;
        int M = 0;

        N = Integer.parseInt(NMinput.split(" ", 2)[0]);
        M = Integer.parseInt(NMinput.split(" ", 2)[1]);

        Song[] songs = new Song[N];
        String[] sounds = new String[M];
        
        if (N < 1 || N > 1000) {
            return;
        }
        if (M < 1 || M > 1000) {
            return;
        }
        
        String[] temp1;
        for (int i = 0; i < N; i++) {
            temp1 = sc.nextLine().split(" ", 3);
            if (temp1[1].length() < 1 || temp1[1].length() > 1000) return;
            songs[i] = new Song(Integer.parseInt(temp1[0]), temp1[1], temp1[2].replaceAll(" ", "").substring(0, 3));
            
        }

        int count = 0;
        int targetIndex = 0;
        for (int i = 0; i < M; i++) {
            sounds[i] = sc.nextLine().replaceAll(" ", "");

            for (int j = 0; j < N; j ++) {

                if (songs[j].sound.equals(sounds[i])) {
                    count++;
                    targetIndex = j;
                }
            }

            switch (count) {
                case 0:
                    System.out.println("!");
                    break;
                case 1:
                    System.out.println(songs[targetIndex].title);
                    break;
                default:
                    System.out.println("?");
                    break;
            }
            
            count = 0;
            
        }
        
    }
    
}


class Song {
    int length;
    String title;
    String sound;

    public Song(int length, String title, String sound) {
        this.length = length;
        this.title = title;
        this.sound = sound;
    }
}