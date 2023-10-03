public class SelectionSort extends Sorter{

    public int[] sort(int[] list){
        int[] orderedList = list;
        for (int i = 0; i < orderedList.length-1; i++) {
            int position = 0;
            int a = orderedList[i];
            int menor = Integer.MAX_VALUE;


            for (int j = i+1; j < orderedList.length; j++) {

                int b = orderedList[j];
                if (b < menor) {
                    menor = b;
                    position = j;
                }
            }

            if (menor < a){
                orderedList[i] = menor;
                orderedList[position] = a;
            }

        }
        return orderedList;
    }

    public void sortShowing(int[] list){
        int[] orderedList = list;
        System.out.println("---SELECTION SORT---");
        System.out.print("Entrada: \t");
        super.printList(orderedList);

        for (int i = 0; i < orderedList.length-1; i++) {
            System.out.print("\t\t\t");
            super.printList(orderedList);

            int position = 0;
            int a = orderedList[i];
            int menor = Integer.MAX_VALUE;

            for (int j = i+1; j < orderedList.length; j++) {

                int b = orderedList[j];
                if (b < menor) {
                    menor = b;
                    position = j;
                }
            }

            if (menor < a){
                orderedList[i] = menor;
                orderedList[position] = a;
            }

        }
        System.out.print("Saída: \t\t");
        super.printList(orderedList);
    }



}
