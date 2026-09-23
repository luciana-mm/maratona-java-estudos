package academy.devdojo.maratonajava.forca.dominio;

public class Forca {
    private String palavra = "cachorro";
    private char[] letrasGuardadas = new char[palavra.length()];

    public void jogo(String letra) {
        char letraChar = letra.charAt(0);
        for (int i = 0; i < palavra.length(); i++) {
            if (letraChar == palavra.charAt(i)) {
                letrasGuardadas[i] = letraChar;
            }
        }
    }

    public void espacos() {
        for (int i = 0; i < letrasGuardadas.length; i++) {
            if (letrasGuardadas[i] != '\u0000') {
                System.out.print(letrasGuardadas[i]);
            } else {
                System.out.print("_");
            }
        }
    }

    public Boolean faltantes(){
        for (int i = 0; i < letrasGuardadas.length; i++) {
            if (letrasGuardadas[i] == '\u0000') {
                return false;
            }
        }
        return true;
    }
}