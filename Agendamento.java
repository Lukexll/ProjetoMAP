package Agendamento0bject;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;

interface GeradorCodigo {
    int gerarCodigo();
}

class GeradorCodigoUnico implements GeradorCodigo {
    private Queue<Integer> codigosGerados = new LinkedList<>();

    @Override
    public int gerarCodigo() {
        Random random = new Random();
        int novoCodigo;

        do {
            novoCodigo = random.nextInt(1000000);
        } while (codigosGerados.contains(novoCodigo));

        codigosGerados.add(novoCodigo);

        if (codigosGerados.size() > 100) {
            codigosGerados.poll();
        }

        return novoCodigo;
    }
}

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