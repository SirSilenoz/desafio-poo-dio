package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate dataMentoria;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }


    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }


}

