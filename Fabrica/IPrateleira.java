package Fabrica;
public interface IPrateleira {

    public boolean inserir(IBolo bolo) throws Exception;

    public IBolo remover(IBolo bolo) throws Exception;

    public IBolo remover(int posicaoBolo) throws Exception;

    public IBolo[] listarBolos(char boloListar);
}