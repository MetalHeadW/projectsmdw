
import javax.swing.JOptionPane;

public class Exercicio4 {
    
    public static void main(String[] args) {
        
    }
    public static void real4Dolar(){
        double reais = lerDouble("Reais:");
        JOptionPane.showMessageDialog(null, (reais / 5.67) + "dólares");
    }
    public static double lerDouble(String msg){
        return Double.parseDouble(JOptionPane.showInputDialog(msg));
        }


    public static int escolheMenu(){
        String menu = "1- Real pra Dolar\n"
        +"2- Real pra Dolar\n"
        +"3- Real pra Dolar\n"
        +"4- Real pra Dolar\n"
        +"5- Real pra Dolar\n";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }
}
