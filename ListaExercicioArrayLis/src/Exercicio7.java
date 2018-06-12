
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.CatchNode;

/**
 *
 * @author Gus
 */
public class Exercicio7 {

    public static void main(String[] args) {

        int paulo = 0;
        int ana = 0;
        int vogais = 0;
        int demaisNomes = 0;
        String maiorNome = "";
        String texto = "";
        String menorNome = maiorNome;
         
        ArrayList<String> nomes = new ArrayList<>();

        for (int i = 0; i < 25; i++) {

            while (true) {

                try {
                    nomes.add(JOptionPane.showInputDialog(null, "Adicione o " + (i + 1)
                            + "º nome"));String erro = "";
                    erro += nomes.get(i).charAt(0);
                    if (erro.equals("1") || erro.equals("2") || erro.equals("3")
                    || erro.equals("4") || erro.equals("5")|| erro.equals("6")
                    || erro.equals("7") || erro.equals("8")|| erro.equals("9")
                    || erro.equals("0")) {
                }

                    
                    
                    break;
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Digite somente nomes");
                }
            }
        }

        for (int j = 0; j < nomes.size(); j++) {
            texto += nomes.get(j) + "\n";
        }
        JOptionPane.showMessageDialog(null, "Nomes Adicionados\n"
                + texto);

        for (int k = 0; k < nomes.size(); k++) {
            if (nomes.get(k).length() > maiorNome.length()) {
                maiorNome = nomes.get(k);
            }
        }

        for (int l = 0; l < nomes.size(); l++) {
            if (nomes.get(l).length() < menorNome.length()) {
                menorNome = nomes.get(l);
            }
        }

        for (int k = 0; k < nomes.size(); k++) {
            if (nomes.get(k).equalsIgnoreCase("Ana")) {
                ana++;

            }
            if (nomes.get(k).equalsIgnoreCase("Paulo")) {
                paulo++;
            } else {
                demaisNomes++;

            }
            String comparacaovolgal = "";
            comparacaovolgal += nomes.get(k).charAt(0);
            if (comparacaovolgal.equalsIgnoreCase("a") || comparacaovolgal.equalsIgnoreCase("e")
                    || comparacaovolgal.equalsIgnoreCase("i") || comparacaovolgal.equalsIgnoreCase("o")
                    || comparacaovolgal.equalsIgnoreCase("u")) {
                vogais++;
            }
        }
        JOptionPane.showMessageDialog(null, "Maior nome: " + maiorNome
                + "Menor nomes: " + menorNome);
        JOptionPane.showMessageDialog(null, "Quantidades de Ana : " + ana
                + "Quantidade de Paulo: " + paulo);
        JOptionPane.showMessageDialog(null, "Quantidade de nomes com vogais : "
                + vogais + "Demais nomes: " + demaisNomes);

    }

}
