import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Imovel {
    private int codigo;
    private String status;
    private String foto;
    private String rua;
    private String bairro;
    private int numero;
    private int nota;
    private int cpfProprietario;

    private static List<Imovel> listaImoveis = new ArrayList<>();
    private static Imovel instanciaUnica = null;

    private Imovel() {} 

    public static Imovel getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Imovel();
        }
        return instanciaUnica;
    }

    public static void (String[] args) {
        Imovel imovel = Imovel.getInstancia();
        imovel.criarImovel(1, "Disponível", "Rua A", "Bairro B", 123, 5, 123456789);
        imovel.excluirImovel(1);
    }
}

