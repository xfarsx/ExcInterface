package br.com.digitalhouse;

public class Documento implements Imprimivel {

    private String nome;
    private String tipo;

    public Documento(){}
    public Documento (String nm,String tp){
        nome = nm;
        tipo = tp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nm) {
        this.nome = nm;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tp) {
        this.tipo = tp;}

    @Override
    public void imprimir() {
        System.out.println("Sou um documento do Word");
    }
}
