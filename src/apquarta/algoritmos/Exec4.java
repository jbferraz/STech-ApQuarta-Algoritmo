/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apquarta.algoritmos;

import java.util.Scanner;

/**
 * 4. Crie um programa que solicite a entrada de 10 números pelo usuário,
 * armazenando-os em um vetor, e então monte outro vetor com os valores do
 * primeiro multiplicados por 5. Exiba os valores dos dois vetores na tela,
 * simultaneamente, em duas colunas (um em cada coluna), uma posição por linha.
 *
 * @author jbferraz
 */
public class Exec4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int valores[][] = new int[10][2];
        System.out.println(".: Informe 10 números inteiros :.");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "º número: ");
            valores[i][0] = ler.nextInt();
            valores[i][1] = valores[i][0] * 5;
        }
        System.out.println("\n.: Valores :.");
        for (int i = 0; i < 10; i++) {
            System.out.printf("|%3d%3s%3d |\n",valores[i][0] , " | " , valores[i][1]);
        }
    }

}
