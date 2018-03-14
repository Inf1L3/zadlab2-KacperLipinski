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
public class Zad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double[] tab = new double[10];
    double suma=0,iloczyn=1,min,max,srednia;
    int a;
    
    Scanner wej = new Scanner(System.in);
     
     for(int i=0;i<10;i++){
    System.out.println("Podaj liczbe dla indeksu "+i);     
    tab[i]= wej.nextDouble();
     }
    min=tab[0];
    max=tab[0];
    
    for(int i=0;i<10;i++){
    suma=suma+tab[i];
    iloczyn=iloczyn*tab[i];
    if(tab[i]>max){
    max=tab[i];    
    }
    if(tab[i]<min){
    min=tab[i];    
    }    
    }
    
    srednia=suma/10;
    
    do{
 System.out.println("1.oblicz sumę elementów tablicy,\n" +
"2.oblicz iloczyn elementów tablicy,\n" +
"3.wyznacz wartość średnią,\n" +
"4.wyznacz wartość minimalną,\n" +
"5.wyznacz wartość maksymalną.\n"+"6.Wyjscie z programu"); 
  a= wej.nextInt();

if(a==1){
System.out.println(suma); 
   }else if(a==2){
System.out.println(iloczyn);       
   }else if(a==3){  
System.out.println(srednia); 
   }else if(a==4){
System.out.println(min);       
   }else if(a==5){
System.out.println(max);       
   }
 }while(a!=6);
    }
    
}
