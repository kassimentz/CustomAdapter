package com.project.kassimentz.customadapter.Model;

/**
 * Created by Cassio on 07/05/16.
 */
public class Contato {

    private String nome;
    private String telefone;

    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}
