package ProprietarioObject;

public class ComandoEditarImovel implements Comando{
    private Proprietario proprietario;

    public ComandoEditarImovel(Proprietario proprietario){
        this.proprietario = proprietario;
    }

    @Override
    public void executar(){
        proprietario.editarImovel();
    }
}
