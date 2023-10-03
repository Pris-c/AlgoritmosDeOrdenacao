public class BubbleSort extends Sorter{

    public int[] sort(int[] list){
        boolean ordenado = true;
        int[] orderedList = list;
        do{
            ordenado = super.verifyOrdenation(orderedList);

            if (!ordenado) {
                for (int j = 0; j < orderedList.length - 1; j++) {
                    int a = orderedList[j];
                    int b = orderedList[j + 1];

                    if (a > b) {
                        orderedList[j] = b;
                        orderedList[j + 1] = a;
                    }
                }
            }
        } while (!ordenado);
        return orderedList;
    }

    public void sortShowing(int[] list){
        System.out.println("---BUBBLE SORT---");
        System.out.print("Entrada: \t");
        super.printList(list);
        int[] orderedList = list;
        boolean ordered;

        do{
            ordered = true;

            for (int i = 0; i < orderedList.length - 1; i++) {
                if (orderedList[i] > orderedList[i + 1]) {
                    ordered = false;
                    break;
                }
            }
            if (!ordered) {


                for (int j = 0; j < orderedList.length - 1; j++) {
                    int a = orderedList[j];
                    int b = orderedList[j + 1];

                    System.out.print("\t\t\t");
                    super.printList(orderedList);

                    if (a > b) {
                        orderedList[j] = b;
                        orderedList[j + 1] = a;
                    }
                }

            }

        } while (!ordered);
        System.out.print("Saída: \t\t");
        super.printList(orderedList);
    }


}
