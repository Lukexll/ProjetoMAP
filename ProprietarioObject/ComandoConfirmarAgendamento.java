package ProprietarioObject;

public class ComandoConfirmarAgendamento implements Comando{
    private Proprietario proprietario;

    public ComandoConfirmarAgendamento(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public void executar() {
        proprietario.confirmarAgendamento();
    }
}
