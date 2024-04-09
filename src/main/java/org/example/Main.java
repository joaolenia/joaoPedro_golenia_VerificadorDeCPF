package org.example;

import funcionalidades.CPF;
import funcionalidades.CPFValidador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> cpfs = new ArrayList<>();
        String caminho = "C:\\Users\\joaop\\desafioCompass\\ValidadorCPF\\src\\main\\java\\arquivos\\CPF.txt";
        ler(caminho,cpfs);

        CPF ListaOriginal = new CPF(cpfs);
        CPFValidador validador = new CPFValidador();
        validador.tamanhoCPF(ListaOriginal);
        validador.imprimir();

    }
    public static void ler(String caminho, List<String> cpfs){
        try {
            BufferedReader br = new BufferedReader(new FileReader(caminho));
            String linha;
            while ((linha = br.readLine()) != null) {
                linha = linha.trim();
                if (!linha.isEmpty()) {
                    cpfs.add(linha);
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}

