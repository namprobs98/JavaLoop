/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaloop;

import java.util.*;

/**
 *
 * @author Slime nightmare
 */
public class JavaLoop {

    /**
     * @param args the command line arguments
     */
    public static int[] output(int a, int b, int n) {
        int[] op = new int[n];
        for (int i = 0; i < n; i++) {
            op[i] = a + b * ((int) Math.pow(2, i + 1) - 1);
        }
        return op;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] a = new int[t];
        int[] b = new int[t];
        int[] n = new int[t];
        for (int i = 0; i < t; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            n[i] = in.nextInt();
        }
        for (int i = 0; i < t; i++) {
            int[] finalOutput = new int[n[i]];
            finalOutput = output(a[i], b[i], n[i]);
            for (int j = 0; j < n[i]; j++) {
                System.out.print(finalOutput[j]);
                if (j != n[i] - 1) {
                    System.out.print(" ");
                } else {
                    System.out.println();
                };
            }
        }
        in.close();
    }
}
