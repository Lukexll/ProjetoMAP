

import ProptietarioObject.*;

public class Main {
    public static void main(String[] args) {
        Proprietario proprietario = new Proprietario();

        Comando comandoListarImoveis = new ComandoListarImoveis(proprietario);
        Comando comandoConfirmarAgendamento = new ComandoConfirmarAgendamento(proprietario);

        proprietario.executarComando(comandoListarImoveis);
        proprietario.executarComando(comandoConfirmarAgendamento);
    }
}
