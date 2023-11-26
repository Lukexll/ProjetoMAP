import java.util.List;
import java.util.ArrayList;

class Imovel {
    private List<Observador> observadores = new ArrayList<>();
    private List<Integer> avaliacoes = new ArrayList<>();

    public void adicionarAvaliacao(int nota) {
        avaliacoes.add(nota);
        notificarObservadores(nota);
    }

    private void notificarObservadores(int nota) {
        for (Observador observador : observadores) {
            observador.notificar(nota);
        }
    }
}


public class RegistroObservador {
    private List<Observador> observadores = new ArrayList<>();

    public void registrarObservador(Observador observador) {
        observadores.add(observador);
    }
}



class ExemploObserver implements Observador {
    @Override
    public void notificar(){
    }
}



public class Main {
    public static void main(String[] args) {
        Imovel imovel = new Imovel();
        ExemploObserver observador = new ExemploObserver();
        RegistroObservador registro = new RegistroObservador();

        registro.registrarObservador(observador);

        imovel.adicionarAvaliacao(4);
        imovel.adicionarAvaliacao(5);
        imovel.adicionarAvaliacao(3);
    }
}
