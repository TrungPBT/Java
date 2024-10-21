/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author SPC
 */
public class De1_Cau1 {
    public static void main(String[] args) {
        Scanner dayso = new Scanner(System.in);
        ArrayList<Integer> so = new ArrayList<>();
        String input;
        System.out.println("Nhap day so (hoac nhap 'stop' de dung):");
        while (true) {
            input = dayso.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                so.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap mot so hop le hoac 'stop' de dung.");
            }
        }
        if (so.size() > 0) {
            int max = so.get(0);
            int min = so.get(0);
            int sum = 0;
            for (int num : so) {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
                sum += num;
            }
            double average = (double) sum / so.size();
            System.out.println("So lon nhat: " + max);
            System.out.println("So nho nhat: " + min);
            System.out.println("Tong so: " + sum);
            System.out.println("Trung binh so: " + average);
        } else {
            System.out.println("Không có số nào được nhập.");
        }
        dayso.close();
    }
    }
    
