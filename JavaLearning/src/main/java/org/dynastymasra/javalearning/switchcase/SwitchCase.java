package org.dynastymasra.javalearning.switchcase;

import java.util.Scanner;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */

public class SwitchCase {
    private Integer input;

    public void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan angka:");
        input = scanner.nextInt();

        String[] lenght = String.valueOf(input).split("");

        for (int i = lenght.length - 1; i > 0; i--) {
            input = Integer.valueOf(lenght[i]);
            switch (input) {
                case 1:
                    System.out.print("Satu ");
                    break;
                case 2:
                    System.out.print("Dua ");
                    break;
                case 3:
                    System.out.print("Tiga ");
                    break;
                case 4:
                    System.out.print("Empat ");
                    break;
                case 5:
                    System.out.print("Lima ");
                    break;
                case 6:
                    System.out.print("Enam ");
                    break;
                case 7:
                    System.out.print("Tujuh ");
                    break;
                case 8:
                    System.out.print("Delapan ");
                    break;
                case 9:
                    System.out.print("Sembilan ");
                    break;
                default:
                    System.out.print("Salah Input");
                    break;
            }
        }
    }
}
