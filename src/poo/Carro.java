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
public class Carro {
    String tipo;
    String cor;
    String placa;
    int numPortas;
    
    
    
    
    
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor=cor;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public void setPlaca(String placa){
        this.placa=placa;
    }
    
    public int getnumPortas(){
        return numPortas;
    }
    
    public void setnumPortas(int numPortas){
        this.numPortas=numPortas;
    }
    
}
