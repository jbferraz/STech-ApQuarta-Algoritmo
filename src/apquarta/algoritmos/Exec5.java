/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apquarta.algoritmos;

import java.util.Scanner;

/**
 * 5. Crie um programa que armazene 10 números digitados pelo usuário em dois
 * vetores: um somente para números pares, e outro somente para números ímpares.
 * Após, exiba os valores dos dois vetores na tela, em sequência. Obs.: As
 * posições que não receberem valores exibirão o número zero. Não se preocupe
 * com isso por enquanto.
 *
 * @author jbferraz
 */
public class Exec5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int valores[][] = new int[10][2];
        System.out.println(".: Entre com 10 números inteiros :.");
        for (int i = 0; i < 10; i++) {
            System.out.println("Entre com o " + (i + 1) + "º número: ");
            int valor = ler.nextInt();
            if(valor % 2 == 0){
                //par
                valores[i][0] = valor;//par
                valores[i][1] = 0;//impar
            }else{
                //impar
                valores[i][0] = 0;//par
                valores[i][1] = valor;//impar
            }
        }
        System.out.println("\n.: Lista de Valores :.");
        for (int i = 0; i < 10; i++) {
            System.out.printf("|%3d%3s%3d |\n",valores[i][0] , " | " , valores[i][1]);
        }
    }

}
