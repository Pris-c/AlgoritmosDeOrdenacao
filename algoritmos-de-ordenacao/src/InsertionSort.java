public class InsertionSort extends Sorter{

    public int[] sort(int[] list){
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


    public void showInsertionSortSteps(int[] list){
        System.out.println("---INSERTION SORT---");
        System.out.print("Entrada: \t");
        super.printList(list);

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
                    super.printList(list);
                    break;
                }
            }
        }
        System.out.print("Saída: \t\t");
        super.printList(list);
    }

}
