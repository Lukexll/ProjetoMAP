package ProptietarioObject;

public class ComandoListarImoveis implements Comando{
    private Proprietario proprietario;

    public ComandoListarImoveis(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public void executar() {
        proprietario.listarNovoImovel();
    }
}
