/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menuestrutura;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas e Erick
 */
public class Ordenacao {

    public void messager(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public void vetorOriginal(int val, int[] vet) {
        String original = "";
        for (int i = 0; i < val; i++) {
            original = original + vet[i] + "/ ";
        }
        messager("O vetor inserido foi: " + original);
    }

    public void mostrarTempoExecucao(int[] ordem) {
        long inicioTempo = System.currentTimeMillis();

        messager("A ordem do vetor foi de: /n" + Arrays.toString(ordem));

        long fimTempo = System.currentTimeMillis();
        long tempoExecucao = fimTempo - inicioTempo;

        messager(" Tempo de execução foi de: " + tempoExecucao + " milissegundos");
    }

    public int[] insercao(int valor) {
        int[] vetor = new int[valor];
        for (int i = 0; i < valor; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da fila: [" + (i + 1) + "]"));
            vetor[i] = numero;
        }
        vetorOriginal(valor, vetor);

        for (int i = 1; i < valor; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }

        mostrarTempoExecucao(vetor);

        return vetor;
    }

    public int[] selecao(int valor) {

        int[] vetor = new int[valor];
        for (int i = 0; i < valor; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da fila: [" + (i + 1) + "]"));
            vetor[i] = numero;
        }

        vetorOriginal(valor, vetor);
        for (int i = 0; i < valor - 1; i++) {
            int posicao = i;

            for (int j = i + 1; j < valor; j++) {
                if (vetor[j] < vetor[posicao]) {
                    posicao = j;
                }
            }

            if (posicao != i) {
                int aux = vetor[i];
                vetor[i] = vetor[posicao];
                vetor[posicao] = aux;
            }
        }

        mostrarTempoExecucao(vetor);

        return vetor;
    }

    public int[] bolha(int valor) {

        int[] vetor = new int[valor];
        for (int i = 0; i < valor; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da fila: [" + (i + 1) + "]"));
            vetor[i] = numero;
        }
        vetorOriginal(valor, vetor);

        for (int i = 0; i < valor - 1; i++) {
            for (int j = 0; j < valor - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int tp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = tp;
                }
            }
        }

        mostrarTempoExecucao(vetor);

        return vetor;
    }
    
    public void linear(int valor, int chave) {
        int[] vetor = new int[valor];
        for (int i = 0; i < valor; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da posição [" + (i + 1) + "]"));
            vetor[i] = numero;
        }
        vetorOriginal(valor, vetor);

        int posicao = -1;
        for (int i = 0; i < valor; i++) {
            if (vetor[i] == chave) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            messager("Elemento encontrado na posição: " + posicao);
        } else {
            messager("Elemento não encontrado.");
        }
    }
    
     public void binaria(int valor, int chave) {
        int[] vetor = new int[valor];
        for (int i = 0; i < valor; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da posição [" + (i + 1) + "]"));
            vetor[i] = numero;
        }
        vetorOriginal(valor, vetor);

        Arrays.sort(vetor);

        int posicao = Arrays.binarySearch(vetor, chave);

        if (posicao >= 0) {
            messager("Elemento encontrado na posição: " + posicao);
        } else {
            messager("Elemento não encontrado.");
        }
     }
}
