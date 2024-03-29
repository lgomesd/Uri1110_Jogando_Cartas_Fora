package br.lgomesd.uri1110_jogando_cartas_fora;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cartas;
        while(true){
            cartas = ler.nextInt();
            if(cartas>0){
            Integer vetorCartas[] = new Integer[cartas];
            Integer vetorDescarte[] = new Integer[cartas-1];
            Integer uPosicao = cartas-1;
            Integer contador = 0;
            Integer aux;
            for(int i = cartas-1;i>=0;i--){
                    vetorCartas[i] = contador+1;
                    contador++;
            }
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
            System.out.println("Remaining card: " + vetorCartas[0]);
            }
            else
                break;
        }
    }
    
}
