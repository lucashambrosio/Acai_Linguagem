import javax.swing.*;

public class PontoAcai {
    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tamanho do açaí desejado:\n300 ml\n500 ml\n700 ml"));
        boolean comSorvete = JOptionPane.showConfirmDialog(null, "Deseja adicionar sorvete?", "Acréscimo de Sorvete", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        Acai acai = new Acai(tamanho, comSorvete);
        double valorAcai = acai.calcularValor();
        JOptionPane.showMessageDialog(null, String.format("O seu açaí ficou no valor de: R$ %.2f", valorAcai));
    }

}