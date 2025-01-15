package RepasoRecu1;

import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int n;
        System.out.println("Introduce un numero");
        n = lec.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                if (j % 3==1){
                    System.out.print("* ");
                } else if (j % 3==2) {
                    System.out.print("+ ");
                }else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
