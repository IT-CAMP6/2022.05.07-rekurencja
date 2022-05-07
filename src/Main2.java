import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tab = new int[20];
        //int[] tab2 = new Random().ints(20, 0 , 100).toArray();
        for(int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(101);
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        quickSort(tab, 0 , tab.length - 1);

        for(int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }

    static void quickSort(int[] tab, int begin, int end) {
        if(begin >= end) {
            return;
        }

        int i = begin;
        int j = end;
        int pivot = tab[(begin + end) / 2];

        do {
            while (pivot > tab[i]) {
                i++;
            }

            while (pivot < tab[j]) {
                j--;
            }

            if (i <= j) {
                int temp = tab[i];
                tab[i] = tab[j];
                tab[j] = temp;

                i++;
                j--;
            }
        } while (i <= j);

        if(j > begin) {
            quickSort(tab, begin, j);
        }

        if(i < end) {
            quickSort(tab, i, end);
        }
    }
}
