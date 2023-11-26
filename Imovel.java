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

    public Imovel(int codigo, String status, String rua, String bairro, int numero, int nota, int cpfProprietario) {
        this.codigo = codigo;
        this.status = status;
        this.rua = rua;
        this.bairro = bairro;
        this.foto = foto;
        this.numero = numero;
        this.nota = nota;
        this.cpfProprietario = cpfProprietario;
    }

    public static void criarImovel(int codigo, String status, String rua, String bairro, int numero, int nota, int cpfProprietario) {
        Imovel novoImovel = new Imovel(codigo, status, rua, bairro, numero, nota, cpfProprietario);
        listaImoveis.add(novoImovel);
    }

    public static void excluirImovel(int codigo) {
        Iterator<Imovel> iterator = listaImoveis.iterator();
        while (iterator.hasNext()) {
            Imovel imovel = iterator.next();
            if (imovel.getCodigo() == codigo) {
                iterator.remove();
                break;
            }
        }
    }

    public int getCodigo() {
        return codigo;
    }



    public static void main(String[] args) {

        criarImovel(1, "Disponível", "Rua A", "Bairro B", 123, 5, 123456789);

        excluirImovel(1);
    }
}

