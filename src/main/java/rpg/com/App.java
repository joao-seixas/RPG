package rpg.com;
import util.Util;
import model.Model;
import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre o nome do personagem:");
        String nome = entrada.nextLine();
        
        Model model = new Model(nome);
        model.setName(Util.capitalize(model.getName()));
    }
}