package com.bcopstein.CtrlCorredorV7.negocio.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Corredor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long nro_corredor;
    private String cpf;
    private String nome;
    private int diaDn,mesDn,anoDn;
    private String genero;

    public Corredor(long nro_corredor,String cpf, String nome, int diaDn,int mesDn,int anoDn, String genero) {
        this.nro_corredor = nro_corredor;
        this.cpf = cpf;
        this.nome = nome;
        this.diaDn = diaDn;
        this.mesDn = mesDn;
        this.anoDn = anoDn;
        this.genero = genero;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getDiaDn() {
        return diaDn;
    }

    public int getMesDn() {
        return mesDn;
    }
    public int getAnoDn() {
        return anoDn;
    }

    public String getGenero() {
        return genero;
    }

}