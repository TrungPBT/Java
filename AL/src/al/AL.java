/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package al;
import java.util.ArrayList;
/**
 *
 * @author SPC
 */
public class AL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ArrayL");
       ArrayList mn = new ArrayList();
       for (int i = 1; i <= 101; i++)
       {
           mn.add(i);
       }
       mn.add("Trum Yang Ho 8386 chuc anh em mai dinh, mai dinh, mai dinh");
       mn.remove(50);
       mn.remove(60);
       mn.remove(70);
       System.out.println("Nhincc: " + mn);
       System.out.println("Size Nhincc = " + mn.size());
        
       
    }
    
}
