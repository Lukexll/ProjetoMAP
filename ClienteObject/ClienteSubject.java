import java.util.ArrayList;
import java.util.List;

class ClienteSubject {
    private List<ClienteObserver> observadores = new ArrayList<>();

    public void adicionarObservador(ClienteObserver observador) {
        observadores.add(observador);
    }

    public void removerObservador(ClienteObserver observador) {
        observadores.remove(observador);
    }

    protected void notificarObservadores(String acao) {
        for (ClienteObserver observador : observadores) {
            observador.notificarAcao(acao);
        }
    }
}