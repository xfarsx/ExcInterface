package br.com.digitalhouse;

public class Contrato implements Imprimivel {


    private String nomeC;
    private String tipoC;

    public Contrato() {
    }

    public Contrato (String nmC, String tpC) {
        nomeC = nmC;
        tipoC = tpC;
    }

    public String getNomeC() {
        return nomeC;
    }

    public void setNomeC(String nmC) {
        this.nomeC = nmC;
    }

    public String getTipoC() {
        return tipoC;
    }

    public void setTipoC(String tpC) {
        this.tipoC = tpC;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou um contrato" + tipoC + nomeC);
    }
}