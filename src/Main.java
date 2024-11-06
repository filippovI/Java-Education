public class Main {
    public static void main(String[] args) {
        float[] arr = new float[] {12.95f, 138.1f, 77.78f, 1895.0054f, 567.4f, 1.2f};
        boolean isSorted = false;
        float cache;

        while (!isSorted) {
            isSorted = true;
            for (int i =0; i < arr.length-1; i++){
                if (arr[i] > arr[i+1]) {
                    cache = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = cache;
                    isSorted = false;
                }
            }
        }


        for (float i: arr) {
            System.out.println(i);
        }
    }
}