/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3467;

import java.util.Scanner;

/**
 *
 * @author Kacper2
 */
public class Zad7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner wej = new Scanner(System.in);
     int n,a;
     System.out.println("Podaj ilosc liczb w tabeli ");     
     n = wej.nextInt();
     int[] tab = new int[n];
     
     for(int i=0;i<n;i++){
    System.out.println("Podaj liczbe dla indeksu "+i);     
    tab[i]= wej.nextInt();
     }
     
    for(int i=0;i<(n-1);i++){
    for(int j=0;j<(n-1);j++){
    if(tab[j]>tab[j+1]){
    a=tab[j];
    tab[j]=tab[j+1];
    tab[j+1]=a;
    }    
    }
    }
    System.out.println("Posortowana tabela: ");
    for(int i=0;i<n;i++){
    System.out.println(tab[i]);     
     }
    
    }
    
}
