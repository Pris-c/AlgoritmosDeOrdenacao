public class QuickSort extends Sorter {

    public int[] sort(int[] list){
        int[] orderedList = list;

        boolean ordenado = false;


        while (!ordenado) {
            int posP = novoPivo(orderedList);
            int pivo = orderedList[posP];

            boolean posCorreta = false;

            while (!posCorreta) {
                posCorreta = true;

                for (int i = orderedList.length - 1; i > posP; i--) {
                    if (orderedList[i] < pivo) {
                        posCorreta=false;
                        orderedList[posP] = orderedList[i];
                        orderedList[i] = pivo;
                        posP = i;
                        break;
                    }
                }

                for (int j = 0; j < posP; j++) {
                    if (orderedList[j] > pivo) {
                        posCorreta=false;
                        orderedList[posP] = orderedList[j];
                        orderedList[j] = pivo;
                        posP = j;
                        break;
                    }
                }
            }
            ordenado = super.verifyOrdenation(orderedList);
        }
        return orderedList;
    }

    public void sortShowing(int[] list){
        int[] orderedList = list;
        System.out.println("---QUICK SORT---");
        System.out.print("Entrada: \t");
        super.printList(orderedList);

        boolean ordenado = false;


        while (!ordenado) {
            int posP = novoPivo(orderedList);
            int pivo = orderedList[posP];

            boolean posCorreta = false;

            while (!posCorreta) {
                posCorreta = true;

                for (int i = orderedList.length - 1; i > posP; i--) {
                    if (orderedList[i] < pivo) {
                        posCorreta=false;
                        orderedList[posP] = orderedList[i];
                        orderedList[i] = pivo;
                        posP = i;
                        System.out.print("\t\t\t");
                        super.printList(orderedList);
                        break;
                    }
                }

                for (int j = 0; j < posP; j++) {
                    if (orderedList[j] > pivo) {
                        posCorreta=false;
                        orderedList[posP] = orderedList[j];
                        orderedList[j] = pivo;
                        posP = j;
                        System.out.print("\t\t\t");
                        super.printList(orderedList);
                        break;
                    }
                }
            }
            ordenado = super.verifyOrdenation(orderedList);
        }
        System.out.print("Saída: \t\t");
        super.printList(orderedList);
    }

    private int novoPivo(int[] list) {
        int posP = 0;
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                posP = i;
                break;
            }
        }
        return posP;
    }


}
