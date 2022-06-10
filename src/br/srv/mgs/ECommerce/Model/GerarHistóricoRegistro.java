package br.srv.mgs.ECommerce.Model;

import br.com.sankhya.extensions.flow.ContextoTarefa;
import br.com.sankhya.extensions.flow.TarefaJava;

public class GerarHistóricoRegistro implements TarefaJava {
    @Override
    public void executar(ContextoTarefa contextoTarefa) throws Exception {
        Object idInstanceProcesso = contextoTarefa.getIdInstanceProcesso();
        Object nmfunc = contextoTarefa.getCampo("NMFUNC");

    }
}
