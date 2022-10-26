public class Main {
    public static void main(String[] args) {
        selection();
        bubble();
    }
    static void selection () {
        System.out.println("Selection sort:");
        int[] data = {7, 9, 2, 11};
        for (int i = 0; i < data.length; i++)
            System.out.print(data[i] + " ");
        System.out.println();

        //process
        for (int i = 0; i < data.length - 2; i++) {
            int indSmallest = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[indSmallest])
                    indSmallest = j;
            }

            swap(data, i, indSmallest);
            for (int d = 0; d < data.length; d++) {
                System.out.print(data[d] + " ");
            }
            System.out.println();
        }
    }

    static void bubble() {
        System.out.println("Bubble sort:");
        int[] data = {-4, 11, 7, -12, 6, 1};
        for (int i = 0; i < data.length; i++)
            System.out.print(data[i] + " ");
        System.out.println();

        //process
        boolean changed = true;

        while (changed) {
            changed = false;

            for (int i = 1; i < data.length; i++)
                if (data[i - 1] > data[i]) {
                    swap(data, i - 1, i);
                    changed = true;
                    for (int v : data)
                        System.out.print(v + " ");
                    System.out.println();
                }
        }
    }

    static void swap (int[]arr,int i,int j) {
        int tmp = arr [i];
        arr[i] = arr[j];
        arr[j]=tmp;
    }
    }