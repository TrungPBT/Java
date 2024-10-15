/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package giaipt;
import java.util.Scanner;
/**
 *
 * @author SPC
 */
public class GiaiPT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Giai Phuong trinh bac 2");
        float a, b, c;
        double delta, x1, x2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap A: ");
        a = sc.nextFloat();
        System.out.println("Nhap B: ");
        b = sc.nextFloat();
        System.out.println("Nhap C: ");
        c = sc.nextFloat();
        
         if (a == 0) { // Biện luận giải phương trình bậc 1: bx + c = 0
        if (b == 0) {
            if (c != 0) {
                System.out.println("Phuong trinh vo nghiem");
            }
            else {
                System.out.println("Phuong trinh co vo so nghiem");
            }
        } else {
            x1 = x2 = -c / b;
            System.out.println("Phuong trinh co nghiem x = " + x1);
        }
    } else {
        delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        }
        else if (delta == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x1);
        }
        else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem phan biet");
            System.out.println("\nx1 = " + x1);
            System.out.println("\nx2 = " + x2);
        }
    }
    }
    
}
