package com.bcopstein.CtrlCorredorV7.aplicacao.casosDeUso;

import com.bcopstein.CtrlCorredorV7.aplicacao.dtos.EstatisticasDTO;
import com.bcopstein.CtrlCorredorV7.aplicacao.servicos.ServicoEstatistica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsultaEstatisticasUC {
    private ServicoEstatistica servicoEstatistica;

    @Autowired
    public ConsultaEstatisticasUC(ServicoEstatistica servicoEstatistica) {
        this.servicoEstatistica = servicoEstatistica;
    }

    public EstatisticasDTO run(int distancia){
        return servicoEstatistica.calculaEstatisticas(distancia);
    }
}
