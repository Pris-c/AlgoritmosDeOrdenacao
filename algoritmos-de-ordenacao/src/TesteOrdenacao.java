public class TesteOrdenacao {

    public static void main(String[] args) {


        int[] e1 = {3, 5, 4, 2, 1};
        Sorter bubble = new BubbleSort();
        Sorter insertion = new InsertionSort();
        Sorter quick = new QuickSort();
        Sorter selection = new SelectionSort();

        //bubble.sortShowing(e1);
        //insertion.sortShowing(e1);
        //quick.sortShowing(e1);
        selection.sortShowing(e1);
    }

}
