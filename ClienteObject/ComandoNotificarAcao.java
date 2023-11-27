package ClienteObject;
public void notificarAcao(String acao) {
    System.out.println("Notificando observadores: Ação do cliente - " + acao);
    
    if (acao.equals("Agendamento marcado")) {
        marcarAgendamento();
    } else if (acao.equals("Imóvel avaliado")) {
        avaliarImovel();
    }
    
}