/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questoeslogica;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class QuestaoLogica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      
    //Descomente o exercicio desejado!
      
      //ex01();
      //ex02();

      ex05();
      
    }
      private static void ex01() {
      int indice = 13, soma = 0, k = 0;

      while(k < indice){

       k = k + 1;

       soma = soma + k;

      }
        System.out.println("A soma será "+soma);
        
      
        }
      
      private static void ex02(){
          Scanner scan = new Scanner(System.in);
          
          int fib01=0, fib02 = 1,fib03=0;
          boolean pertence = false;
          
          System.out.println("Digite um numero:");
          int num = scan.nextInt();
          
          while(true){
              fib03 = fib01 + fib02;
              if(fib03 == num){
                 pertence=true;
                 break;
              }
              
              if(fib03>num)break;
              fib01 = fib02;
              fib02 = fib03;
          }
          
          if(pertence){
              System.out.println("\nO numero "+num+" pertence a sequência de Fibonacci!");
          }
          else{
              System.out.println("\nO numero "+num+" NÃO pertence a sequência de Fibonacci!");
          }
          
      }
      private static void ex05(){
          Scanner scan = new Scanner(System.in);
          int qtd;
          
          System.out.println("Digite uma string:");
          String str = scan.next();
          
          char[] caracteres = str.toCharArray();
          qtd = caracteres.length;
          for(int i=0; i<qtd /2; i++){
          char temp = caracteres[i]; 
          caracteres[i] = caracteres[qtd -1 -i];
          caracteres[qtd -1 -i] = temp;
          }
          
          String invertido = new String(caracteres);
          System.out.println("O(a)"+str+" invertido fica "+invertido);
    }
    
}
  
      
      
      
      
   

  
        
    

