package projects;

import java.util.Scanner;

public class faktorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan angka yang anda inginkan : ");
        int bil = in.nextInt();
        System.out.println("hasil dari faktorial " + bil + " adalah " + factorial(bil));
        in.close();
    }

    static int factorial (int bil) {
        for (int i = bil - 1; i > 0; i--) {
            bil *= i;
        }
        return bil;
        
    }
}
