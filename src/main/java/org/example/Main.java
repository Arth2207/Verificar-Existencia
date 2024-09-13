package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra ou linha de texto");
        String palavra = scanner.nextLine();

        //Contar quantas vezes aparece a letra "a" e "A"

        int contador = contarLetraA(palavra);

        // saída de informação na tela
        System.out.println("A letra a apareceu " + contador + "vezes");
    }


    //função que irá contar o tanto de "a" que aparece

    public static int contarLetraA(String letra) {

        int contador = 0;

        //passar sobre cada caractere da String
        for (int i = 0; i < letra.length(); i++) {
            char caractere = letra.charAt(i);

            if (caractere == 'a' || caractere == 'A') {
                contador++;
            }
        }
        return contador;
    }
}