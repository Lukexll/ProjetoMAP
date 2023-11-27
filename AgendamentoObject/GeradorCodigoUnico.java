package AgendamentoObject;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;

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