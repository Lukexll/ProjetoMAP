import java.util.ArrayList;
import java.util.List;

interface Notificavel {
    void atualizar();
}

class Imovel implements Notificavel {
    private int codigo;
    private List<Integer> avaliacoes;
    private float notaMedia;

    private static Imovel instanciaUnica = null;
    private List<Notificavel> observadores;

    private Imovel() {
        avaliacoes = new ArrayList<>();
        observadores = new ArrayList<>();
    }

    public static Imovel getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Imovel();
        }
        return instanciaUnica;
    }

    public void adicionarAvaliacao(int nota) {
        avaliacoes.add(nota);
        notificarObservadores();
    }

    private void notificarObservadores() {
        calcularNotaMedia();
        for (Notificavel observador : observadores) {
            observador.atualizar();
        }
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    private void calcularNotaMedia() {
        int total = 0;
        for (int nota : avaliacoes) {
            total += nota;
        }

        if (avaliacoes.size() > 0) {
            notaMedia = (float) total / avaliacoes.size();
        } else {
            notaMedia = 0;
        }
    }

    public void registrarObservador(Notificavel observador) {
        observadores.add(observador);
    }

    @Override
    public void atualizar() {
        calcularNotaMedia();
    }

    public static void main(String[] args) {
        Imovel imovel = Imovel.getInstancia();

        imovel.registrarObservador(imovel);

        imovel.adicionarAvaliacao(4);
        imovel.adicionarAvaliacao(5);
        imovel.adicionarAvaliacao(3);

        float notaMedia = imovel.getNotaMedia();
        System.out.println("A nota média do imóvel é: " + notaMedia);
    }
}
