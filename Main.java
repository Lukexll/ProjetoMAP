

import ProptietarioObject.*;

public class Main {
    public static void main(String[] args) {
        Proprietario proprietario = new Proprietario();

        Comando comandoListarImoveis = new ComandoListarImoveis(proprietario);
        Comando comandoConfirmarAgendamento = new ComandoConfirmarAgendamento(proprietario);

        proprietario.executarComando(comandoListarImoveis);
        proprietario.executarComando(comandoConfirmarAgendamento);

        GeradorCodigo geradorCodigo = new GeradorCodigoUnico();

        Agendamento agendamento1 = new Agendamento(geradorCodigo.gerarCodigo(), "2023-11-17", "10:00");
        Agendamento agendamento2 = new Agendamento(geradorCodigo.gerarCodigo(), "2023-11-18", "14:30");

        System.out.println("Agendamento 1 - Código: " + agendamento1.getCodigo() + ", Data: " + agendamento1.getData() + ", Horário: " + agendamento1.getHorario());
        System.out.println("Agendamento 2 - Código: " + agendamento2.getCodigo() + ", Data: " + agendamento2.getData() + ", Horário: " + agendamento2.getHorario());
    }
}
