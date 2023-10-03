public class InsertionSort extends Sorter{

    public int[] sort(int[] list){
        int[] orderedList = list;
        int n = 0;
        int novaPosicao = 0;

        for (int i=1; i<orderedList.length; i++){
            int p = orderedList[i];

            for (int j=0; j<i; j++) {
                if (p < orderedList[j]) {
                    novaPosicao = j;

                    for (int k=i; k>j; k--){
                        orderedList[k] = orderedList[k-1];
                    }
                    orderedList[novaPosicao] = p;
                    break;
                }
            }
        }
        return orderedList;
    }


    public void sortShowing(int[] list){
        int[] orderedList = list;
        System.out.println("---INSERTION SORT---");
        System.out.print("Entrada: \t");
        super.printList(orderedList);

        int n = 0;
        int novaPosicao = 0;

        for (int i=1; i<orderedList.length; i++){
            int p = orderedList[i];

            for (int j=0; j<i; j++) {
                if (p < orderedList[j]) {
                    novaPosicao = j;

                    for (int k=i; k>j; k--){
                        orderedList[k] = orderedList[k-1];
                    }
                    orderedList[novaPosicao] = p;

                    System.out.print("\t\t\t");
                    super.printList(orderedList);
                    break;
                }
            }
        }
        System.out.print("Saída: \t\t");
        super.printList(orderedList);
    }

}
