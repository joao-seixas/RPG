package util;

public class Util {
    public static String saudacao(String personagem) {
        return ("Olá, " + capitalize(personagem));
    }
    public static String capitalize(String name) {
        return name.toUpperCase();
    }
}