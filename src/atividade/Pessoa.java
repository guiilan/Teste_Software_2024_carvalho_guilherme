package atividade;

public class Pessoa {

    private String name;

    public Pessoa(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private String saudacao() {
        return "Olá, " + this.name;
    }
}
