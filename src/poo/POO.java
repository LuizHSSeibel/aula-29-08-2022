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
        
        System.out.println("----------CARRO----------");
        System.out.println("Cor: "+meuCarro.getCor());
        System.out.println("N° Portas: "+meuCarro.getnumPortas());
        System.out.println("Placa: "+meuCarro.getPlaca());
        System.out.println("Tipo: "+meuCarro.getTipo());        
        
        Pessoa aPessoa = new Pessoa();
        
        aPessoa.setNome("Mini Barba Negra");
        aPessoa.setbioTipo("Anão");
        aPessoa.setcorDoCabelo("Preto");
        aPessoa.setidade(45);
        
        System.out.println("----------Pessoa----------");
        System.out.println("Nome: "+aPessoa.getNome());
        System.out.println("Bio Tipo: "+aPessoa.getbioTipo());
        System.out.println("Cor do Cabelo: "+aPessoa.getcorDoCabelo());
        System.out.println("Idade: "+aPessoa.getidade());
    }
}