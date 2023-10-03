public class SelectionSort extends Sorter{

    public int[] sort(int[] list){
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

    public void sortShowing(int[] list){
        System.out.println("---SELECTION SORT---");
        System.out.print("Entrada: \t");
        super.printList(list);

        for (int i = 0; i < list.length-1; i++) {
            System.out.print("\t\t\t");
            super.printList(list);

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
        super.printList(list);
    }



}
