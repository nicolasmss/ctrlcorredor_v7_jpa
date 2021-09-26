package com.bcopstein.CtrlCorredorV7.aplicacao.casosDeUso;

import com.bcopstein.CtrlCorredorV7.negocio.entidades.Evento;
import com.bcopstein.CtrlCorredorV7.negocio.servicos.ServicoEvento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CadastraEventoUC {
    private ServicoEvento servicoEvento;

    @Autowired
    public CadastraEventoUC(ServicoEvento servicoEvento) {
        this.servicoEvento = servicoEvento;
    }
    
    public void run(Evento evento){
        servicoEvento.cadastra(evento);
    }    
}
