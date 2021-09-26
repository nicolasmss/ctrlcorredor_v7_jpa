package com.bcopstein.CtrlCorredorV7.aplicacao.casosDeUso;

import java.util.List;

import com.bcopstein.CtrlCorredorV7.negocio.entidades.Corredor;
import com.bcopstein.CtrlCorredorV7.negocio.servicos.ServicoCorredor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsultaCorredoresUC {
    private ServicoCorredor servicoCorredor;

    @Autowired
    public ConsultaCorredoresUC(ServicoCorredor servicoCorredor) {
        this.servicoCorredor = servicoCorredor;
    }
    
    public List<Corredor> run(){
        return servicoCorredor.todos();
    }    
}
