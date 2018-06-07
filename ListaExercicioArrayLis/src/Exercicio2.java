
import java.util.ArrayList;
/**

 * @author Gustavo
 */
public class Exercicio2 {

    public static void main(String[] args) {
        
         ArrayList<String> nomes = new ArrayList<> ();
         
         nomes.add("Gus");
         nomes.add("Anna");
         nomes.add("Tamires");
         nomes.add("Leonardo");
         nomes.add("Pedro");
         nomes.add("Caio");
         nomes.add("Beatris");
         nomes.add("Rafael");
         nomes.add("Natalia");
         nomes.add("Jonh");
         
         
         System.out.println("Nomes armazenados\n"
                            + nomes.get(0) + "\n"
                            + nomes.get(1) + "\n"
                            + nomes.get(2) + "\n"
                            + nomes.get(3) + "\n"
                            + nomes.get(4) + "\n"
                            + nomes.get(5) + "\n"
                            + nomes.get(6) + "\n"
                            + nomes.get(7) + "\n"
                            + nomes.get(8) + "\n"
                            + nomes.get(9) + "\n"
         );
    }

}
