/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apquarta.algoritmos;

import java.util.Scanner;

/**
 * 2. Escreva um algoritmo que solicite ao usuário a entrada de 5 números, e que
 * exiba o somatório desses números na tela. Após exibir a soma, o programa deve
 * mostrar também os números que o usuário digitou, um por linha.
 *
 * @author jbferraz
 */
public class Exec2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int valores[] = new int[5];
        int count = 0, soma = 0;
        System.out.println(".: Entrar com 5 numeros Inteiros :.");
        do {
            System.out.println("Informe valor " + (count + 1) + ": ");
            valores[count] = ler.nextInt();
            soma += valores[count];
            count += 1;
        } while (count < 5);
        System.out.println("A soma dos valores é de: " + soma);
        System.out.println("Valores informados:");
        for (int i = 0; i < 5; i++) {
            System.out.println("valor " + (i + 1) + ": " + valores[i]);
        }

    }

}
