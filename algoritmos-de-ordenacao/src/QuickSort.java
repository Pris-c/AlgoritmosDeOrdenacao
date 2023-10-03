public class QuickSort extends Sorter {

    public int[] sort(int[] list){

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
            ordenado = super.verifyOrdenation(list);
        }
        return list;
    }

    public void sortShowing(int[] list){
        System.out.println("---QUICK SORT---");
        System.out.print("Entrada: \t");
        super.printList(list);

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
                        super.printList(list);
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
                        super.printList(list);
                        break;
                    }
                }
            }
            ordenado = super.verifyOrdenation(list);
        }
        System.out.print("Saída: \t\t");
        super.printList(list);
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
