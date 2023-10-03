public class Sorter {

    protected int[] sort(int[] list){
        return new int[0];
    }

    protected void sortShowing(int[] list){
    }

    protected boolean verifyOrdenation(int[] list) {
        boolean ordenada = true;
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                ordenada = false;
                break;
            }
        }
        return ordenada;
    }


    protected void printList(int[] list){
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
