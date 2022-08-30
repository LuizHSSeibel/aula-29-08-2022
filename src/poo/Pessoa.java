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
public class Pessoa {
    String nome;
    String corDoCabelo;
    String bioTipo;
    int idade;
    
    void ImprimeDadosDaPessoa(){
        System.out.println("----------Pessoa----------");
        System.out.println("Nome: " + nome);
        System.out.println("Bio Tipo: " + bioTipo);
        System.out.println("Cor do Cabelo: " + corDoCabelo);
        System.out.println("Idade: " + idade);
    }
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getcorDoCabelo(){
        return corDoCabelo;
    }
    
    public void setcorDoCabelo(String corDoCabelo){
        this.corDoCabelo=corDoCabelo;
    }
    
    public String getbioTipo(){
        return bioTipo;
    }
    
    public void setbioTipo(String bioTipo){
        this.bioTipo=bioTipo;
    }
    
    public int getidade(){
        return idade;
    }
    
    public void setidade(int idade){
        this.idade=idade;
    }
    
}
