public class App {

    public static void main(String args[]){

        int[] vetorSelectSort = {3,6,8,1,4,9,0};
        System.out.println("SELECTION SORT -----------");
        System.out.print("Antes: ");

        for(int i:vetorSelectSort){
            System.out.print(i + " ");
        }

        SelectionSort(vetorSelectSort);
        System.out.println();

        System.out.print("Depois: ");

        for(int i:vetorSelectSort){
            System.out.print(i + " ");
        }
        
        System.out.println();

        int[] vetorBubbleSort = {3,6,8,1,4,9,0};
        System.out.println("BUBBLE SORT --------------");
        System.out.print("Antes: ");

        for(int i:vetorBubbleSort){
            System.out.print(i + " ");
        }

        BubbleSort(vetorBubbleSort);
        System.out.println();

        System.out.print("Depois: ");

        for(int i:vetorBubbleSort){
            System.out.print(i + " ");
        }
    }

    public static void SelectionSort(int[] vetorSelectSort) {

        for(int i = 0; i < vetorSelectSort.length - 1; i++){
            int inicio = i;
            
            for(int y = i; y < vetorSelectSort.length; y++){
                if(vetorSelectSort[y] < vetorSelectSort[inicio]){
                    inicio = y;
                }
            }

            int menorNum = vetorSelectSort[inicio];
            vetorSelectSort[inicio] = vetorSelectSort[i];
            vetorSelectSort[i] = menorNum;
        }
    }

    public static void BubbleSort(int[] vetorBubbleSort) {

        int tamanho = vetorBubbleSort.length;  
        int aux = 0; 
 
        for(int i=0; i < tamanho; i++){  
            
            for(int y=1; y < (tamanho-i); y++){  
            
                if(vetorBubbleSort[y-1] > vetorBubbleSort[y]){ 
                    aux = vetorBubbleSort[y-1];  
                    vetorBubbleSort[y-1] = vetorBubbleSort[y];  
                    vetorBubbleSort[y] = aux;  
                }  
                          
            }  
        }
    }
}
