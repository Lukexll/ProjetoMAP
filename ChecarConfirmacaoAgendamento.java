package AgendamentoObject;

import ProprietarioObject.ComandoConfirmarAgendamento;

public class ChecarconfirmacaoAgendamento implements Comando {
    private Proprietario proprietario;
    private Agendamento agendamento;

    public ComandoConfirmarAgendamento(Proprietario proprietario, Agendamento agendamento) {
        this.proprietario = proprietario;
        this.agendamento = agendamento;
    }

    @Override
    public void executar() {
        agendamento.checarConfirmacaoProprietario(agendamento);
        proprietario.confirmarAgendamento();
    }
}
