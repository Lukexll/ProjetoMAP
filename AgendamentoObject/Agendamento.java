package agendamento0bject;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;

public class Agendamento {
    private int codigo;
    private String data;
    private String horario;

    public Agendamento(int codigo, String data, String horario) {
        setCodigo(codigo);
        setData(data);
        setHorario(horario);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void ChecarConfirmacaoAgendamento(){
        
    }
}