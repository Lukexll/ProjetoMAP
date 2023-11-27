package AgendamentoObject;

public class Agendamento {
    private int codigo;
    private String data;
    private String horario;

    private GeradorCodigo geradorCodigo;

    public Agendamento(GeradorCodigo geradorCodigo, String data, String horario) {
        this.geradorCodigo = geradorCodigo;
        setCodigo(geradorCodigo.gerarCodigo());
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