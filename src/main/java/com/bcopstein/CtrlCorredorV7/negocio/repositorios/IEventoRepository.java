package com.bcopstein.CtrlCorredorV7.negocio.repositorios;

import java.util.List;

import com.bcopstein.CtrlCorredorV7.negocio.entidades.Evento;

public interface IEventoRepository {
    List<Evento> todos();
    boolean cadastra(Evento evento);
}
