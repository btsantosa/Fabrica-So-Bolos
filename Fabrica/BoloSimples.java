package Fabrica;

public class BoloSimples extends Bolo{

    private boolean semLactose = false;

    public BoloSimples(int codigo, double custo, IFormato formato) {
        super(codigo, custo, formato);
    }
    public BoloSimples(int codigo, double custo, IFormato formato, boolean semLactose){
        super(codigo, custo, formato);
        this.semLactose = semLactose;
    }
    
    @Override
    public double preco() {
        double resultado = custo * formato.area();
        if (semLactose == true){
            return resultado + 25.0;
        } else{
            return resultado;
        }   
        
    }
    @Override
    public String toString() {
        return "BoloSimples [codigo=" + codigo + ", semLactose=" + semLactose + ", custo=" + custo + ", formato="
                + formato + ", preco()=" + preco() + "]";
    }
    
        
}
