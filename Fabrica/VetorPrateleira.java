package Fabrica;

public class VetorPrateleira implements IPrateleira {

    private IBolo[] prateleira;
    private int qtdBolo;

    public VetorPrateleira(int tamanho) {
        prateleira = new IBolo[tamanho];
        qtdBolo = 0;
    }

    @Override
    public boolean inserir(IBolo bolo) throws Exception {
        if (cheia()) {
            throw new Exception("Prateleira cheia.");
        }
        if (existe(bolo)) {
            throw new Exception("Bolo já cadastrado.");
        }

        for (int i = 0; i < prateleira.length; i++) {
            if (prateleira[i] == null) {
                prateleira[i] = bolo;
                qtdBolo++;
                return true;
            }
        }
        return false;
    }

    @Override
    public IBolo remover(IBolo bolo) throws Exception {
        int pos = buscar(bolo);
        if (pos == -1) {
            throw new Exception("Bolo não encontrado.");
        }
        return remover(pos);
    }

    @Override
    public IBolo remover(int posicao) throws Exception {
        if (posicao < 0 || posicao >= prateleira.length || prateleira[posicao] == null) {
            throw new Exception("Bolo não encontrado.");
        }
        IBolo removido = prateleira[posicao];
        prateleira[posicao] = null;
        qtdBolo--;
        return removido;
    }

    @Override
    public IBolo[] listar() {
        IBolo[] lista = new IBolo[qtdBolo];
        int index = 0;
        for (IBolo bolo : prateleira) {
            if (bolo != null) {
                lista[index++] = bolo;
            }
        }
        return lista;
    }

    @Override
    public IBolo[] listar(char tipoDoBolo) {
        IBolo[] lista = new IBolo[qtdBolo];
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
        IBolo[] resultado = new IBolo[index];
        System.arraycopy(lista, 0, resultado, 0, index);
        return resultado;
    }

    @Override
    public int buscar(IBolo bolo) throws Exception {
        for (int i = 0; i < prateleira.length; i++) {
            if (prateleira[i] != null && prateleira[i].equals(bolo)) {
                return i;
            }
        }
        throw new Exception("Bolo não encontrado.");
    }

    @Override
    public boolean existe(IBolo bolo) {
        try {
            buscar(bolo);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean cheia() {
        return qtdBolo == prateleira.length;
    }

    @Override
    public boolean vazia() {
        return qtdBolo == 0;
    }

    @Override
    public IBolo consultar(IBolo bolo) throws Exception {
        int pos = buscar(bolo);
        return prateleira[pos];
    }
}
