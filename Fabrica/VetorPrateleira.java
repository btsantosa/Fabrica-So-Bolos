package Fabrica;

public class VetorPrateleira implements IPrateleira {

    private IBolo[] prateleira;

    public VetorPrateleira(int tamanho) {
        prateleira = new IBolo[tamanho];
    }

    @Override
    public boolean inserir(IBolo bolo) throws Exception {
        for (int i = 0; i < prateleira.length; i++) {
            if (prateleira[i] != null && prateleira[i].equals(bolo)) {
                throw new Exception("Bolo já cadastrado.");
            }
        }

        for (int i = 0; i < prateleira.length; i++) {
            if (prateleira[i] == null) {
                prateleira[i] = bolo;
                return true;
            }
        }

        return false;
    }

    @Override
    public IBolo remover(IBolo bolo) throws Exception {
        for (int i = 0; i < prateleira.length; i++) {
            if (prateleira[i] != null && prateleira[i].equals(bolo)) {
                IBolo removido = prateleira[i];
                prateleira[i] = null;
                return removido;
            }
        }
        throw new Exception("Bolo não encontrado.");
    }

    @Override
    public IBolo remover(int posicao) throws Exception {
        if (posicao < 0 || posicao >= prateleira.length || prateleira[posicao] == null) {
            throw new Exception("Bolo não encontrado.");
        }
        IBolo removido = prateleira[posicao];
        prateleira[posicao] = null;
        return removido;
    }

    @Override
    public IBolo[] listar(char tipoDoBolo) {
        IBolo[] lista = new IBolo[prateleira.length];
        int index = 0;

        for (IBolo bolo : prateleira) {
            if (bolo != null) {
                if (tipoDoBolo == 'S' && bolo instanceof BoloSimples) {
                    lista[index++] = bolo;
                } else if (tipoDoBolo == 'T' && bolo instanceof Torta) {
                    lista[index++] = bolo;
                }
            }
        }

        return lista;
    }
}
