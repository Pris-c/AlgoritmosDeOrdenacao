public class SortList {

    public static int[] bubbleSort(int[] list){
        boolean ordenado = true;

        do{
            ordenado = verificarOrdenacao(list);

            if (!ordenado) {
                for (int j = 0; j < list.length - 1; j++) {
                    int a = list[j];
                    int b = list[j + 1];

                    if (a > b) {
                        list[j] = b;
                        list[j + 1] = a;
                    }
                }
            }
        } while (!ordenado);
        return list;
    }



    public static void showBubbleSortSteps(int[] list){
        System.out.println("---BUBBLE SORT---");
        System.out.print("Entrada: \t");
        imprimirLista(list);

        boolean ordered;

        do{
            ordered = true;

            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    ordered = false;
                    break;
                }
            }
            if (!ordered) {


                for (int j = 0; j < list.length - 1; j++) {
                    int a = list[j];
                    int b = list[j + 1];

                    System.out.print("\t\t\t");
                    imprimirLista(list);

                    if (a > b) {
                        list[j] = b;
                        list[j + 1] = a;
                    }
                }

            }

        } while (!ordered);
        System.out.print("Saída: \t\t");
        imprimirLista(list);
    }



    public static int[] selectionSort(int[] list){

        for (int i = 0; i < list.length-1; i++) {
            int position = 0;
            int a = list[i];
            int menor = Integer.MAX_VALUE;


            for (int j = i+1; j < list.length; j++) {

                int b = list[j];
                if (b < menor) {
                    menor = b;
                    position = j;
                }
            }

            if (menor < a){
                list[i] = menor;
                list[position] = a;
            }

        }
        return list;
    }




    public static void showSelectionSortSteps(int[] list){
        System.out.println("---SELECTION SORT---");
        System.out.print("Entrada: \t");
        imprimirLista(list);

        for (int i = 0; i < list.length-1; i++) {
            System.out.print("\t\t\t");
            imprimirLista(list);

            int position = 0;
            int a = list[i];
            int menor = Integer.MAX_VALUE;

            for (int j = i+1; j < list.length; j++) {

                int b = list[j];
                if (b < menor) {
                    menor = b;
                    position = j;
                }
            }

            if (menor < a){
                list[i] = menor;
                list[position] = a;
            }

        }
        System.out.print("Saída: \t\t");
        imprimirLista(list);
    }



    public static int[] insertionSort(int[] list){
        int n = 0;
        int novaPosicao = 0;

        for (int i=1; i<list.length; i++){
            int p = list[i];

            for (int j=0; j<i; j++) {
                if (p < list[j]) {
                    novaPosicao = j;

                    for (int k=i; k>j; k--){
                        list[k] = list[k-1];
                    }
                    list[novaPosicao] = p;
                    break;
                }
            }
        }
        return list;
    }


    public static void showInsertionSortSteps(int[] list){
        System.out.println("---INSERTION SORT---");
        System.out.print("Entrada: \t");
        imprimirLista(list);

        int n = 0;
        int novaPosicao = 0;

        for (int i=1; i<list.length; i++){
            int p = list[i];

            for (int j=0; j<i; j++) {
                if (p < list[j]) {
                    novaPosicao = j;

                    for (int k=i; k>j; k--){
                        list[k] = list[k-1];
                    }
                    list[novaPosicao] = p;

                    System.out.print("\t\t\t");
                    imprimirLista(list);
                    break;
                }
            }
        }
        System.out.print("Saída: \t\t");
        imprimirLista(list);
    }


    public static void showQuickSortSteps(int[] list){
        System.out.println("---QUICK SORT---");
        System.out.print("Entrada: \t");
        imprimirLista(list);

        boolean ordenado = false;


        while (!ordenado) {
            int posP = novoPivo(list);
            int pivo = list[posP];

            boolean posCorreta = false;

            while (!posCorreta) {
                posCorreta = true;

                for (int i = list.length - 1; i > posP; i--) {
                    if (list[i] < pivo) {
                        posCorreta=false;
                        list[posP] = list[i];
                        list[i] = pivo;
                        posP = i;
                        System.out.print("\t\t\t");
                        imprimirLista(list);
                        break;
                    }
                }

                for (int j = 0; j < posP; j++) {
                    if (list[j] > pivo) {
                        posCorreta=false;
                        list[posP] = list[j];
                        list[j] = pivo;
                        posP = j;
                        System.out.print("\t\t\t");
                        imprimirLista(list);
                        break;
                    }
                }
            }
            ordenado = verificarOrdenacao(list);
        }
        System.out.print("Saída: \t\t");
        imprimirLista(list);
    }
    public static int[] quickSortSteps(int[] list){

        boolean ordenado = false;


        while (!ordenado) {
            int posP = novoPivo(list);
            int pivo = list[posP];

            boolean posCorreta = false;

            while (!posCorreta) {
                posCorreta = true;

                for (int i = list.length - 1; i > posP; i--) {
                    if (list[i] < pivo) {
                        posCorreta=false;
                        list[posP] = list[i];
                        list[i] = pivo;
                        posP = i;
                        break;
                    }
                }

                for (int j = 0; j < posP; j++) {
                    if (list[j] > pivo) {
                        posCorreta=false;
                        list[posP] = list[j];
                        list[j] = pivo;
                        posP = j;
                        break;
                    }
                }
            }
            ordenado = verificarOrdenacao(list);
        }
        return list;
    }


    private static int novoPivo(int[] list) {
        int posP = 0;
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                posP = i;
                break;
            }
        }
        return posP;
    }

    private static boolean verificarOrdenacao(int[] list) {
        boolean ordenada = true;
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                ordenada = false;
                break;
            }
        }
        return ordenada;
    }


    public static void imprimirLista(int[] list){
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
