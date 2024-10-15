/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tinhlaisuat;
import java.util.Scanner;
/**
 *
 * @author SPC
 */
public class TinhLaiSuat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Lai Suat Gui Tiet Kiem");
        Scanner nh = new Scanner(System.in);
        System.out.println("Nhap So Tien Gui: ");
        double tienGui = nh.nextDouble();
        System.out.println("Nhap So Thang Gui: "); 
        double namGui = nh.nextInt();
        System.out.println("Lai Suat: ");
        double laiSuat = nh.nextDouble();
        double tongLai;
        for (int i = 1; i<= namGui; i++)
        {
            tongLai = tienGui * laiSuat;
            tienGui += tongLai;
            System.out.println("Tien Lai Tung Nam:" + String.format("%.3f", tongLai));
        }
        
        
        
    }
    
}
