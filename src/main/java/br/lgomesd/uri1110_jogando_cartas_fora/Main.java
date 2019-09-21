/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lgomesd.uri1110_jogando_cartas_fora;

import java.util.Scanner;


/**
 *
 * @author leonardogd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Integer cartas;
        
        
        do{
            cartas = ler.nextInt();
            if(cartas>0){
            Integer vetorCartas[] = new Integer[cartas];
            Integer vetorDescarte[] = new Integer[cartas-1];
            Integer uPosicao = cartas-1;
        
            Integer contador = 0;

            Integer aux;
            //System.out.println(cartas);

            //System.out.print("Vetor de cartas: ");
            for(int i = cartas-1;i>=0;i--){
                    vetorCartas[i] = contador+1;
                    contador++;
               // System.out.print(vetorCartas[i] + ", ");
            }
            //System.out.println("\n");
            contador = 0;
            for(int i = vetorCartas.length-1;i > 0;i--){
                vetorDescarte[contador] = vetorCartas[i];
                aux = vetorCartas[i-1];
                for(int x = uPosicao;x>1;x--){                
                    vetorCartas[x-1] = vetorCartas[x-2];                
                }
                vetorCartas[0] = aux;
                uPosicao--;
                contador++;                        
            }
            System.out.print("Discarded cards: ");
            for(int i = 0;i<vetorDescarte.length;i++){
                if(i<vetorDescarte.length-1)
                    System.out.print(vetorDescarte[i] + ", ");
                else
                    System.out.print(vetorDescarte[i]);              
            }
            System.out.print("\n");
            System.out.print("Remaining card: " + vetorCartas[0]);
            }
        }while(cartas != 0);
    }
    
}
