package com.example.predator.livraria;

/**
 * Created by Predator on 15/03/2016.
 */
public class Livro {
    private String titulo;
    private String autor;
    private Integer anoLançamento;

    public Livro(String titulo, String autor, Integer ano){
        setTitulo(titulo);
        setAnoLançamento(ano);
        setAutor(autor);
    }

    public Livro(){

    }
    public Integer getAnoLançamento() {
        return anoLançamento;
    }

    public void setAnoLançamento(Integer anoLançamento) {
        this.anoLançamento = anoLançamento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
