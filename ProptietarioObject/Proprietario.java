package ProptietarioObject;

public class Proprietario {
    private int cpf;
    private String nome;
    private String email;
    private String foto;
    private int [] telefones = new int[10];

    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public int[] getTelefones() {
        return telefones;
    }
    public void setTelefones(int[] telefones) {
        this.telefones = telefones;
    }

    public void listarNovoImovel(){

    }
    public void editarImovel(){

    }
    public void confirmarAgendamento(){
        
    }
    public void executarComando(Comando comando) {
        comando.executar();
    }

    

}