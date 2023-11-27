package AgendamentoObject;

import ProprietarioObjct.*;

public class ChecarconfirmacaoAgendamento implements ComandoConfirmarAgendamento {
    private Proprietario proprietario;
    private Agendamento agendamento;

    public ComandoConfirmarAgendamento(Proprietario proprietario, Agendamento agendamento) {
        this.proprietario = proprietario;
        this.agendamento = agendamento;
    }

    @Override
    public void executar() {
        agendamento.ChecarConfirmacaoAgendamento(agendamento);
        proprietario.confirmarAgendamento();
    }
}
