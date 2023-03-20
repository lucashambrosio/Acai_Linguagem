import javax.swing.JOptionPane;

class Acai {
    private int tamanho;
    private double valor;
    private boolean comSorvete;

    public Acai(int tamanho, boolean comSorvete) {
        this.tamanho = tamanho;
        this.comSorvete = comSorvete;
        switch (tamanho) {
            case 300:
                valor = 8.00;
                break;
            case 500:
                valor = 10.00;
                break;
            case 700:
                valor = 12.00;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tamanho de açaí inválido.");
                break;
        }
        if (comSorvete) {
            valor += 2.00;
        }
    }

    public double calcularValor() {
        return valor;
    }
}

