package Fabrica;

public class VetorPrateleira implements IPrateleira {
    IBolo prateleira[];

    VetorPrateleira(int qtdBolo){
        this.prateleira = new IBolo[qtdBolo];
    }

    @Override
    public boolean inserir(IBolo bolo) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inserir'");
    }

    @Override
    public IBolo remover(IBolo bolo) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

    @Override
    public IBolo remover(int posicaoBolo) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

    @Override
    public IBolo[] listarBolos(char boloListar) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarBolos'");
    }

    


    
}
