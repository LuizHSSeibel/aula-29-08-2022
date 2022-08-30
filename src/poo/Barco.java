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
public class Barco {
    String tamanho;
    String tipoDoBarco;
    String cor;
    int tripulacao;
    
    void ImprimeDadosDoBarco(){
        System.out.println("----------Barco----------");
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Tipo do barco: " + tipoDoBarco);
        System.out.println("Cor: " + cor);
        System.out.println("Tripulação: " + tripulacao);
    }
    public String gettamanho(){
        return tamanho;
    }
    
    public void settamanho(String tamanho){
        this.tamanho=tamanho;
    }
    
    public String gettipoDoBarco(){
        return tipoDoBarco;
    }
    
    public void settipoDoBarco(String tipoDoBarco){
        this.tipoDoBarco=tipoDoBarco;
    }
    
    public String getcor(){
        return cor;
    }
    
    public void setcor(String cor){
        this.cor=cor;
    }
    
    public int gettripulacao(){
        return tripulacao;
    }
    
    public void settripulacao(int tripulacao){
        this.tripulacao=tripulacao;
    }

    void settripulacao(String _anões) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
