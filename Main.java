package metodos_ordenacao;

import static metodos_ordenacao.bubbleSort.bubbleSort;
import static metodos_ordenacao.selectionSort.selectionSort;

public class Main {

    public static void main(String args[]){

        int[] vetorSelectSort = {3,6,8,1,4,9,0};
        int[] vetorBubbleSort = {3,6,8,1,4,9,0};
        
        System.out.println("SELECTION SORT -----------");
        System.out.print("Antes: ");

        for(int i:vetorSelectSort){
            System.out.print(i + " ");
        }

        selectionSort(vetorSelectSort);
        System.out.println();

        System.out.print("Depois: ");

        for(int i:vetorSelectSort){
            System.out.print(i + " ");
        }
        
        System.out.println();
        System.out.println("BUBBLE SORT --------------");
        System.out.print("Antes: ");

        for(int i:vetorBubbleSort){
            System.out.print(i + " ");
        }

        bubbleSort(vetorBubbleSort);
        System.out.println();

        System.out.print("Depois: ");

        for(int i:vetorBubbleSort){
            System.out.print(i + " ");
        }
    }
}
