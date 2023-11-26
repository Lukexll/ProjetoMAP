package ImovelObject;

public class Imovel {
    private int codigo;
    private float valor;
    private String status;
    private String foto;
    private String rua;
    private String bairro;
    private int numero;
    private int nota;
    private int cpfProprietario;
    
    public int getcodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getvalor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public int[] getRua() {
        return telefones;
    }
    public void setRua(int rua) {
        this.rua = rua;
    }
    
        public int[] getBairro() {
        return bairro;
    }
    public void setRua(int bairro) {
        this.bairro = bairro;
    }
    public int[] getNumero() {
        return telefones;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int[] getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
    public int[] getCpfProprietario() {
        return telefones;
    }
    public void setCpfProprietario(int cpfProprietario) {
        this.cpfProprietario = cpfProprietario;
    }
    
    

    public void CalcularNota(){

    }
        }
    public void executarComando(Comando comando) {
        comando.executar();
    }

    

}
