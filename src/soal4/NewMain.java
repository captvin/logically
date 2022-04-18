/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal4;
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
        Scanner input = new Scanner(System.in);
        
        System.out.println("##  Program Java Cari Ganjil Genap  ##");
        System.out.println("========================================");
        System.out.println();

        int[] arr = new int[100];
        int arr_count, i, max_num;

        System.out.print("Input jumlah element array: ");
        arr_count = input.nextInt();

        System.out.println("Input "+arr_count+" angka (dipisah dengan enter):");

       
        for(i = 0; i < arr_count; i++){
          arr[i] = input.nextInt();
        }

        System.out.println();

        max_num = arr[0];
        
        System.out.print("=> [");
        for(i = 0; i < arr_count; i++){
            if(arr[i] %2 == 0){
                System.out.print("Genap,");
            }
            else{
                System.out.print("Ganjil,");
            }  
        }
        
        System.out.println("]");
    }
    
}
