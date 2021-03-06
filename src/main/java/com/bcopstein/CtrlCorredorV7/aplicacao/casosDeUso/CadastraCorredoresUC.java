package com.bcopstein.CtrlCorredorV7.aplicacao.casosDeUso;

import com.bcopstein.CtrlCorredorV7.negocio.entidades.Corredor;
import com.bcopstein.CtrlCorredorV7.negocio.servicos.ServicoCorredor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CadastraCorredoresUC {
    private ServicoCorredor servicoCorredor;

    @Autowired
    public CadastraCorredoresUC(ServicoCorredor servicoCorredor) {
        this.servicoCorredor = servicoCorredor;
    }
    
    public void run(Corredor corredor){
        servicoCorredor.cadastraCorredor(corredor);
    }
    
}
