import java.util.List;

interface Observador {
    void notificar();
}

class Imovel implements Observador {
    private int codigo;
    private List<Integer> avaliacoes;
    private float notaMedia;

    private static Imovel instanciaUnica = null;
    private List<Observador> observadores;

    private Imovel() {
    }

    public static Imovel getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Imovel();
        }
        return instanciaUnica;
    }

    public void adicionarAvaliacao(int nota) {
    }

    private void notificarObservadores() {
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    private void calcularNotaMedia() {
    }

    public void registrarObservador(Observador observador) {
    }

    @Override
    public void notificar() {
    }

    public static void main(String[] args) {
    }
}