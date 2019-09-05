/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lgomesd.uri1110_jogando_cartas_fora;

import java.util.Random;

/**
 *
 * @author leonardogd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random rng = new Random();
        Integer cartas = rng.nextInt(10);
        Integer vetorCartas[] = new Integer[cartas];
        Integer vetorDescarte[] = new Integer[cartas-1];
        Integer contador = 0;
        Integer uPosicao = cartas;
        Integer aux;
        System.out.println(cartas);
        
        for(int i = 0;i<vetorCartas.length;i++)
            vetorCartas[i] = rng.nextInt(10);
        
        for(int i = vetorCartas.length-1;i > 0;i--){
            vetorDescarte[contador] = vetorCartas[i];
            vetorCartas[i]=null;
            for(int x = uPosicao;x>1;x--){
                aux = vetorCartas[x-1];
                vetorCartas[x-1] = vetorCartas[x-2];
                vetorCartas[0] = vetorCartas[aux];
                System.out.println(vetorCartas[i]);
            }
            System.out.println(vetorCartas[i]);
            uPosicao--;
            contador++;
            
               
        }
//        for(int i = 0;i<vetorDescarte.length;i++)
//            System.out.println(vetorDescarte[i]);
        
    }
    
}
