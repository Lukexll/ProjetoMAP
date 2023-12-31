import ProprietarioObject.*;

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

        Imovel imovel = new Imovel.ImovelBuilder()
            .codigo(1)
            .valor(100000)
            .status("Disponível")
            .foto("caminho/para/foto.jpg")
            .rua("Nome da Rua")
            .bairro("Nome do Bairro")
            .numero(123)
            .nota(5)
            .cpfProprietario(123456789)
            .build();
    }
}
