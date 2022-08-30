/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author luiz.seibel
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        
        meuCarro.setCor("Preto");
        meuCarro.setnumPortas(4);
        meuCarro.setPlaca("ASDA-1232");
        meuCarro.setTipo("Gol");
        
        meuCarro.ImprimeDadosDoCarro();
        
        Pessoa aPessoa = new Pessoa();
        
        aPessoa.setNome("Mini Barba Negra");
        aPessoa.setbioTipo("Anão");
        aPessoa.setcorDoCabelo("Preto");
        aPessoa.setidade(45);
        
        aPessoa.ImprimeDadosDaPessoa();
        
        Barco oBarco = new Barco();
        
        oBarco.settamanho("Lata de Leite Ninho");
        oBarco.settipoDoBarco("Miniatura");
        oBarco.setcor("Amarelo");
        oBarco.settripulacao("2 anões");
        
        oBarco.ImprimeDadosDoBarco();
    }
}