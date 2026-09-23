package academy.devdojo.maratonajava.forca.execucao;

import academy.devdojo.maratonajava.forca.dominio.Forca;

import java.util.Scanner;

public class ForcaTeste {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Forca forca = new Forca();

        System.out.println("=====MENU===== \n 1-Iniciar jogo da forca \n 2-Sair");
        int opcaoMenu = scanner.nextInt();
        if(opcaoMenu != 1) return;
        while (!forca.faltantes()) {
            System.out.println("\nDigite uma letra:");
            String letra = scanner.next();
            forca.jogo(letra);
            forca.espacos();
        }

    }
}
