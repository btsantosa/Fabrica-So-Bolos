package Fabrica;

public interface IPrateleira {

    boolean inserir(IBolo bolo) throws Exception;

    IBolo remover(IBolo bolo) throws Exception;

    IBolo remover(int posicao) throws Exception;

    IBolo[] listar(char tipoDoBolo);
}
