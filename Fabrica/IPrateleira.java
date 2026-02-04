package Fabrica;

public interface IPrateleira {

    boolean inserir(IBolo bolo) throws Exception;

    IBolo remover(IBolo bolo) throws Exception;

    IBolo remover(int posicao) throws Exception;

    IBolo[] listar();

    IBolo[] listar(char tipoDoBolo);

    int buscar(IBolo bolo) throws Exception;

    boolean existe(IBolo bolo);

    boolean cheia();

    boolean vazia();

    IBolo consultar(IBolo bolo) throws Exception;
}
