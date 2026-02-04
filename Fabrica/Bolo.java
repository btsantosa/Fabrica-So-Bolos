package Fabrica;

public abstract class Bolo implements IBolo{
    protected int codigo;
    protected double custo;
    protected IFormato formato;

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
        if(this == o) return true;
        if (o == null) return false;
        if(o instanceof Bolo) return true;
        Bolo outro = (Bolo) o;
        return this.codigo == outro.codigo;
    }
    @Override
    public String toString() {
        return "Bolo [codigo=" + codigo + ", custo=" + custo + ", formato=" + formato + "]";
    }
    
}
