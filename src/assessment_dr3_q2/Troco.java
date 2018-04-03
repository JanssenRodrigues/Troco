/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment_dr3_q2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Janssen
 */
public class Troco {
    static ArrayList<Integer> moedasPossiveis = new ArrayList<Integer>(Arrays.asList(25,21,10,5,1));
    static int troco = 63;

    static ArrayList<Integer> trocosPossiveis = new ArrayList<Integer>();
     
    public static void calcularMoedas(ArrayList<Integer> valores){
        System.out.println("valores: "+valores);
        int valorRestante = troco;
        int qtdMoedas = 0;         
        for(int valor : valores){
            System.out.println("valor: " + valor);
            int qtdMoedasDesseValor = (int) Math.floor(valorRestante / valor);
            System.out.println("qtdMoedasDesseValor: "+qtdMoedasDesseValor);
            qtdMoedas = qtdMoedas + qtdMoedasDesseValor;
            System.out.println("qtdMOedas: "+ qtdMoedas);
            valorRestante = valorRestante - valor * qtdMoedasDesseValor;
            System.out.println("valorRestante: "+valorRestante);
        }
        trocosPossiveis.add(qtdMoedas);
        
        System.out.println(trocosPossiveis);
    }
    
    public static void criarArray(){
        ArrayList<Integer> aux = new ArrayList<>();
        
        for(int i = 0; i < moedasPossiveis.size(); i++){
            for(int j = 0; j < moedasPossiveis.size(); j++){
                aux.add(moedasPossiveis.get(j));
            }
            calcularMoedas(aux);
            aux.clear();
        }
    }
    
    public static int menorTrocoPossivel() {
        int menor = (int) trocosPossiveis.get(0);
        
        for (int i = 0; i < trocosPossiveis.size(); i++){
            if (menor > (int) trocosPossiveis.get(i)) {
                menor = (int) trocosPossiveis.get(i);
            }
        }
        
        return menor;
    }
     
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println(Arrays.toString(moedas));
//        calcularMoedas(troco);
        criarArray();
        System.out.println(menorTrocoPossivel());
    }
    
}
