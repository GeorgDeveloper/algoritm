public class Main {
    public static void main(String[] args) {
         int[] array = {4,3,2,5,0,1,2,3,4,5,6,6,4,7,8,9,4,5,3,0,1};

        System.out.println("Начальный массив:");
        printArray(array);

        System.out.println("Отсортированный массив:");
        printArray(sorted(array, array.length));

    }

    static int[] sorted(int[] array, int len){
        int[] count = new int[len + 1];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        int index = 0;
        int[] sortedArray = new int[array.length];
        for (int n = 0; n < count.length; n++) {
            int cnt = count[n];
            for (int k = 0; k < cnt; k++) {
                sortedArray[index] = n;
                index++;
            }
        }
        return sortedArray;
    }

    static void printArray (int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}