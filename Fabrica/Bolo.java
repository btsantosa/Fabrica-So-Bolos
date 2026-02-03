package Fabrica;

public abstract class Bolo implements IBolo{
    int codigo;
    double custo;
    IFormato formato;

    public Bolo(int codigo, double custo){
        this.codigo = codigo;
        this.custo = custo;
    }
    public Bolo(int codigo, double custo, IFormato formato){
        this.codigo = codigo;
        this.custo = custo;
        this.formato = formato;
    }

    public boolean equals(Object o){
        return true;
    }
    @Override
    public String toString() {
        return "Bolo [codigo =" + codigo + ", custo =" + custo + "]";
    }
    
}
