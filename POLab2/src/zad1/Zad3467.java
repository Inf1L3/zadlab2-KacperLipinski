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
public class Zad3467 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
     int a;   
     double[] tab = new double[10];
     Scanner wej = new Scanner(System.in);
     
     for(int i=0;i<10;i++){
    System.out.println("Podaj liczbe dla indeksu "+i);     
    tab[i]= wej.nextDouble();
     } 
 do{
 System.out.println("1.Wyświetlanie tablicy od pierwszego do ostatniego indeksu.\n" +
"2.Wyświetlanie tablicy od ostatniego do pierwszego indeksu.\n" +
"3.Wyświetlanie elementów o nieparzystych indeksach.\n" +
"4.Wyświetlanie elementów o parzystych indeksach.\n"+"5.Wyjście z programu"); 
  a= wej.nextInt();

if(a==1){
for(int i=0;i<10;i++){
    System.out.println(tab[i]);} 
   }else if(a==2){
for(int i=9;i>=0;i--){
    System.out.println(tab[i]);}       
   }else if(a==3){  
for(int i=1;i<10;i=i+2){
    System.out.println(tab[i]);} 
   }else if(a==4){
for(int i=0;i<10;i=i+2){
    System.out.println(tab[i]);}       
   }
 }while(a!=5);    
    }
    
}
