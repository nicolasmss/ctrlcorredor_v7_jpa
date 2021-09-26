package com.bcopstein.CtrlCorredorV7.negocio.servicos;

import java.util.List;

import com.bcopstein.CtrlCorredorV7.negocio.entidades.Corredor;
import com.bcopstein.CtrlCorredorV7.negocio.repositorios.ICorredorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoCorredor {
    public ICorredorRepository corredorRep;

    @Autowired
    public ServicoCorredor(ICorredorRepository corredorRep){
        this.corredorRep = corredorRep;
    }

    public List<Corredor> todos(){
        return corredorRep.todos();
    }

    public void cadastraCorredor(Corredor corredor){
        corredorRep.removeTodos();
        corredorRep.cadastra(corredor);
    }
    
}