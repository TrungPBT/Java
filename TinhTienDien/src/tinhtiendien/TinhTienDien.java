/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tinhtiendien;
import java.util.Scanner;
/**
 *
 * @author SPC
 */
public class TinhTienDien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrGia = {1893, 1956, 2271, 2860, 3197, 3302};
        int[] arrBac = {0, 50, 100 , 200, 300, 400};
        System.out.println("Nhap chi so cu");
        var sc = new Scanner(System.in);
        int oldNum = sc.nextInt();
        System.out.println("Nhap chi so moi");
        int newNum = sc.nextInt();
        int passNum = newNum - oldNum;
        int sum = 0;
        int price = 0;
        for (int i = 5; i >= 0; i--)
            {
                if (passNum > arrBac[i])
                {
                    for (int j = i; j >= 0; j--)
                    {
                        price = (passNum - arrBac[j]) * arrGia[j];
                        sum += price;
                        passNum = arrBac[j];
                        System.out.println("Gia so dien bac " + j + ": " + price + " VND");
                    }
                    System.out.println("Tong tien dien : "+sum);
                    break;
                }
            }
    }
    }
    
}
