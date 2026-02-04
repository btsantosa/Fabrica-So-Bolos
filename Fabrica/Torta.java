package Fabrica;

public class Torta extends Bolo {

    private boolean recheio;
    private boolean cobertura;

    public Torta(int codigo, double custo, IFormato formato) {
        super(codigo, custo, formato);
        this.recheio = true;
        this.cobertura = true;
    }

    public Torta(int codigo, double custo, IFormato formato, boolean recheio, boolean cobertura) {
        super(codigo, custo, formato);
        this.recheio = recheio;
        this.cobertura = cobertura;
    }

    @Override
    public double preco() {
        double valor = custo * formato.area();
        if (recheio) {
            valor += 12.5;
        }
        if (cobertura) {
            valor += 20.0;
        }
        return valor;
    }

    @Override
    public String toString() {
        return "Torta [codigo=" + codigo + ", custo=" + custo +
               ", recheio=" + recheio + ", cobertura=" + cobertura +
               ", preco=" + preco() + "]";
    }
}
