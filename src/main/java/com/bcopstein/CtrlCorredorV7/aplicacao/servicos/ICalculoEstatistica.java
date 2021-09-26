package com.bcopstein.CtrlCorredorV7.aplicacao.servicos;

import com.bcopstein.CtrlCorredorV7.aplicacao.dtos.EstatisticasDTO;

public interface ICalculoEstatistica {
    EstatisticasDTO calculaEstatisticas(int distancia);
}
