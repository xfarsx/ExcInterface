package br.com.digitalhouse;
import java.lang.String;

public class Foto implements Imprimivel {

    private String nomeF;
    private String tipoF;

    public Foto(){}

    public Foto(String nm,String tp){
        nomeF = nm;
        tipoF = tp;
    }

    public String getNomeF() {
        return nomeF;
    }

    public void setNomeF(String nmF) {
        this.nomeF = nmF;
    }

    public String getTipoF() {
        return tipoF;
    }

    public void setTipoF(String tpF) {
        this.tipoF = tpF;}

    @Override
    public void imprimir() {
        System.out.println("Sou uma selfie" + tipoF + nomeF );
    }
}
