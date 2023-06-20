/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.menuestrutura;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas e Erick
 */
public class MenuEstrutura {

    public static void main(String[] args) {
        Ordenacao ordenacao = new Ordenacao();

        String menu = "Escolha uma opção:\n"
                + "1. Ordenação por Inserção\n"
                + "2. Ordenação por Bolha\n"
                + "3. Ordenação por Seleção\n"
                + "4. Pesquisa Linear\n"
                + "5. Pesquisa Binária\n"
                + "0. Sair";

        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    int tamanhoVetorInsercao = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor para a ordenação por inserção:"));
                    int[] vetorInsercao = ordenacao.insercao(tamanhoVetorInsercao);
                    JOptionPane.showMessageDialog(null, "Vetor Ordenado por Inserção: " + Arrays.toString(vetorInsercao));
                    break;
                case 2:
                    int tamanhoVetorBolha = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor para a ordenação por bolha:"));
                    int[] vetorBolha = ordenacao.bolha(tamanhoVetorBolha);
                    JOptionPane.showMessageDialog(null, "Vetor Ordenado por Bolha: " + Arrays.toString(vetorBolha));
                    break;
                case 3:
                    int tamanhoVetorSelecao = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor para a ordenação por seleção:"));
                    int[] vetorSelecao = ordenacao.selecao(tamanhoVetorSelecao);
                    JOptionPane.showMessageDialog(null, "Vetor Ordenado por Seleção: " + Arrays.toString(vetorSelecao));
                    break;
                case 4:
                    int tamanhoVetorPesquisaLinear = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor para a pesquisa linear:"));
                    int chavePesquisaLinear = Integer.parseInt(JOptionPane.showInputDialog("Informe a chave de pesquisa:"));
                    ordenacao.linear(tamanhoVetorPesquisaLinear, chavePesquisaLinear);
                    break;
                case 5:
                    int tamanhoVetorPesquisaBinaria = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor para a pesquisa binária:"));
                    int chavePesquisaBinaria = Integer.parseInt(JOptionPane.showInputDialog("Informe a chave de pesquisa:"));
                    ordenacao.binaria(tamanhoVetorPesquisaBinaria, chavePesquisaBinaria);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa...");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    JOptionPane.showMessageDialog(null, "Selecione umas das opções ddiponíveis!");
                    break;
            }
        } while (opcao != 0);
    }
}
