public class TesteOrdenacao {

    public static void main(String[] args) {

        //
        int[] e1 = {3, 5, 4, 2, 1};
        int[] e2 = {3, 5, 4, 2, 1};
        int[] e3 = {3, 5, 4, 2, 1};
        int[] e4 = {3, 5, 4, 2, 1};

        SortList.showBubbleSortSteps(e1);
        SortList.showSelectionSortSteps(e2);
        SortList.showInsertionSortSteps(e3);
        SortList.showQuickSortSteps(e4);

      /*  SortList.imprimirLista(SortList.bubbleSort(e1));
        SortList.imprimirLista(SortList.selectionSort(e2));
        SortList.imprimirLista(SortList.insertionSort(e3));
        SortList.imprimirLista(SortList.quickSortSteps(e4));*/
    }

}
