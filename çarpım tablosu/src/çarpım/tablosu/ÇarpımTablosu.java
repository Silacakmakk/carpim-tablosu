/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package çarpım.tablosu;

/**
 *
 * @author Sıla
 */
public class ÇarpımTablosu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,a,carpım;
        
        for(n=0;n<=9;n++){
            for(a=0;a<=9;a++){
               carpım=n*a;
               System.out.println(n + " ile "+ a+ "'in carpimi:" +carpım );
            }
        }
    }
    
}
