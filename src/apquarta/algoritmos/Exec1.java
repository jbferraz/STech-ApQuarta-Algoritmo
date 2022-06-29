/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apquarta.algoritmos;

import java.util.Scanner;

/**
 *
 * @author jbferraz Criar algoritmo que guarde infomações de 15 alunos: nome,
 * nota1, nota2, nota3, média
 */
public class Exec1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);

        int nAlunos, nNotas;

        System.out.println("Informe número de Alunos: ");
        nAlunos = ler.nextInt();
        System.out.println("Informe número de notas: ");
        nNotas = ler.nextInt();

        //Cria matriz de notas
        float[][] notas = new float[nAlunos][(nNotas + 1)];
        //Cria vetor para nomes de alunos
        String[] alunos = new String[nAlunos];

        System.out.println(".: Notas de Alunos :.");
        for (int i = 0; i < nAlunos; i++) {
            System.out.println("Nome Aluno " + (i + 1) + ": ");
            alunos[i] = ler.next();
            System.out.println("Notas:");
            for (int j = 0; j < nNotas; j++) {
                System.out.println("Nota " + (j + 1) + ": ");
                notas[i][j] = ler.nextFloat();
                notas[i][(nNotas)] += notas[i][j];
            }
            //Média
            notas[i][(nNotas)] = notas[i][(nNotas)] / nNotas;
        }

        System.out.println("\n.: Impressão :.\n");
        for (int i = 0; i < nAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + alunos[i]);
            for (int j = 0; j < (nNotas); j++) {
                System.out.println("- Nota " + (j + 1) + ": " + notas[i][j]);
            }
            System.out.printf("- Média: " + "%.2f",notas[i][nNotas]);
            System.out.println("---");
        }
    }

}
