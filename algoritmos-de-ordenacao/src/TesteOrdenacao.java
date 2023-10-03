public class TesteOrdenacao {

    public static void main(String[] args) {


        int[] e1 = {3, 5, 4, 2, 1};
        Sorter bubble = new BubbleSort();
        Sorter insertion = new InsertionSort();
        Sorter quick = new QuickSort();
        Sorter selection = new SelectionSort();

        bubble.sortShowing(e1);




      /*  SortList.imprimirLista(SortList.bubbleSort(e1));
        SortList.imprimirLista(SortList.selectionSort(e2));
        SortList.imprimirLista(SortList.insertionSort(e3));
        SortList.imprimirLista(SortList.quickSortSteps(e4));*/
    }

}
