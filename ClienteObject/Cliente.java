import java.util.ArrayList;
import java.util.List;

public class Cliente implements ClienteObserver {
    private int cpf;
    private String nome;
    private String senha;
    private int[] telefones;
    private String email;
    private boolean estudante;

    
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


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


    public int[] getTelefones() {
        return telefones;
    }


    public void setTelefones(int[] telefones) {
        this.telefones = telefones;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public boolean isEstudante() {
        return estudante;
    }


    public void setEstudante(boolean estudante) {
        this.estudante = estudante;
    }


    @Override
    public void notificarAcao(String acao) {
        System.out.println("Notificando observadores: Ação do cliente - " + acao);
        
    }
}