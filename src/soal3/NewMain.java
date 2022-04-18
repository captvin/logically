/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal3;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan sebuah bilangan");
        a = scan.nextInt();
        b = a-1;
        System.out.println(a+"-1 = "+b);
        
    }
    
}
