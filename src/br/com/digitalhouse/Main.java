package br.com.digitalhouse;

public class Main {
    Foto foto = new Foto("familia", ".jpg");
    Contrato contrato = new Contrato ("empresa",".word");
    Documento doc = new Documento ("redação", ".txt");

        Impressora impressora = new Impressora ();
        Impressora.adicionarImprimivel(foto);
        Impressora.adicionarImprimivel(contrato);
        Impressora.adicionarImprimivel(doc);

        impressora.imprimirTudo();
}
