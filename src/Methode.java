import java.util.*;

public class Methode {
    public int a = 0, b = 1, c;

    public static long numberOfCalls;

    public int vergleicheZahl(int a, int b) {
       return Math.max(a, b);
    }

    public void stimmtSumme(int a, int b, int c) {
        if (c == a + b) System.out.println("Die Summe von " + a + " und " + b + " ist " + c);
        else System.out.println("Die Summe von " + a + " und " + b + " ist nicht " + c);
    }

    public int betrag(int a) {
        return Math.abs(a);
    }

    public int anzahlZiffern(int zahl) {
        int anz = 1;
        int limit = 10;
        do {
            anz++;
            limit *= 10;
        }while (zahl >= limit);
        return anz;
    }

    public int fibonacciSequence(int count) {
       // System.out.println("fib(" + count + ")");
        numberOfCalls++;
        if(count <= 0) {
            return 0;
        } else if(count == 1) {
            return 1;
        } else {
            return fibonacciSequence(count - 1) + fibonacciSequence(count - 2);
        }
    }

    public void fibonnacci(int count) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < count; i++){
            if (c == 0) System.out.print(c + " ");
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }

    public void printNaturalNumbers(int n) {
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
    }

    public void powerOfTwo(int n) {
        int result = 1;
        for (int i = n; i != 0; i--) {
            result *= 2;
            System.out.print(result + " ");
        }
    }

    public int pow(int n) {
        int result = 1;
        if (n > 0) result = pow(n - 1) * 2;
    //    System.out.print(result + " ");
        return result;
    }

    public long fakultaet(int n) {
        long result = 0;
        if (n <= 1) result = 1;
        else result = n * fakultaet(n - 1);
        System.out.print(result + " ");
        return result;
    }

    public void method(int n) {
        System.out.print(n);
        for (int i = 0; i < (2 / n); i++) {
            System.out.println(i + " ");
            for (int j = 0; j < (n / 4); j++) {
                for (int k = 0; k < (n / 8); k++) {
                    System.out.print(k + " ");
                }
            }
        }
    }

    public int sequenceA_iterative(int n){
        int result = 0;
        for (int i = 0; i < n; i++) result += 2;
        return result;
    }

    public int sequenceA_recursive(int n) {
        if (n == 0) return 0;
        else return sequenceA_recursive(n - 1) + 2;
    }

    public int evenNumber(int n) {
        int even;
        if (n == 0) even = 0;
        else even = evenNumber(n - 1) + 2;
        System.out.print(even + " ");
        return even;
    }

    public int oddNumber(int n) {
        int odd;
        if (n == 0) odd = 1;
        else odd = oddNumber(n - 1) + 2;
        System.out.print(odd + " ");
        return odd;
    }

    public int squareNumber(int n) {
        int square;
        if (n <= 0) return 0;
        else square = squareNumber(n - 1) + 2 * (n - 1) + 1;
        System.out.print(square + " ");
        return square;
    }

    public int ggt(int a, int b) {
        if(a < b) return ggt(b, a);
        if(0 == b) return a;
        return ggt(a % b, b);
    }

    public void printBack(int[] data, int position) {
        if (position > 0) {
            System.out.print(data[position - 1] + " ");
            printBack(data,position - 1);
        }
    }

    public int pascalTriangle(int row, int column) {
        if (column == 0 || column == row) return 1;
        return pascalTriangle(row - 1, column - 1) + pascalTriangle(row - 1, column);
    }

    public void display(int row) {
        for(int a = 0; a < row; a++) {
            for(int b = 0; b <= a; b++) {
                System.out.print(pascalTriangle(a, b));
            }
            System.out.println();
        }
    }

    public int calculate(int n) {
        if (n == 0) return 0;
        return  calculate(n - 1) + 1;
    }

    public double medi(int n) {
        if (n == 0) return 5;
        return 0.6 * medi(n - 1) + 5;
    }

    public double kapital(int n) {
        if (n == 0) return 1000;
        return kapital(n - 1) * 1.05;
    }

    public int seqSearch(int[] f, int k) {
        if (f != null) {
            for (int index = 0; index < f.length; index++) {
                if (f[index] == k) return index;
            }
        }
        return -1;
    }

    public void testSearch1(){
        int[] a1_sorted = {4, 8, 10, 43, 192, 524, 657};
        int key = 43;
        if (seqSearch(a1_sorted, key) == 3) System.out.println("testSeqSearch1() OK.");
    }

    public void testSearch2(){
        int[] a1_unsorted = {5, 45, 6, 292, 43, 524, 657};
        int key = 43;
        if (seqSearch(a1_unsorted, key) == 4) System.out.println("testSeqSearch2() OK.");
    }

    public int binarySearch(int[] f, int x, int left, int right) {
        if (left >= right) return - 1;
        int mid = left + ((right - left) / 2);
        if (f[mid] == x) return mid;
        else if (x < f[mid]) return binarySearch(f, x, left, mid - 1);
        else return binarySearch(f, x, mid + 1, right);
    }

    public void testBinarySearch1() {
        int[] a1_sorted = {4, 8, 10, 43, 192, 524, 657};
        int x = 524;
        if (binarySearch(a1_sorted, x, 0, a1_sorted.length) == 5) System.out.println("testBinarySearch1() OK.");
    }

    public void testBinarySearch2() {
        int[] a1_unsorted = {5, 45, 6, 292, 43, 524, 657};
        int x = 43;
        if (binarySearch(a1_unsorted, x, 0, a1_unsorted.length) == 4) System.out.println("testBinarySearch2() OK.");
        else System.out.println("testBinarySearch2() NOT OK.");
    }

    public void testBinarySearch3() {
        int[] a1_sorted = {4, 8, 10, 43, 192, 524, 657};
        int x = 525;
        if (binarySearch(a1_sorted, x, 0, a1_sorted.length) == 5) System.out.println("testBinarySearch3() OK.");
        else System.out.println("testBinarySearch3() NOT OK.");
    }

    public int[] quicksort(int[] f) {
        return quicksort(f, 0, f.length - 1);
    }

    private int[] quicksort(int[] f, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int pi = partition(f, lowIndex, highIndex);
            quicksort(f, lowIndex, pi - 1);
            quicksort(f, pi + 1, highIndex);
        }
        return f;
    }
    private int partition(int[] f, int low, int high) {
        int pivot = f[high];

        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (f[j] <= pivot) {
                i++;
                swap(f, i, j);
            }
        }
        swap(f, i + 1, high);
        return (i + 1);
    }
    public int[] createArray(int numberOfElements) {
        Random random = new Random();
        int[] numbers = new int[numberOfElements];
        for (int i = 0; i < numbers.length - 1; i++) numbers[i] = random.nextInt(numberOfElements);
        Arrays.sort(numbers);
        return numbers;
    }

    public void testSearch() {
        int[] array = createArray(100000);
        long timeStart = System.nanoTime();
        seqSearch(array, array[9000]);
        long timeStop = System.nanoTime();
        String time = getTime(timeStop - timeStart);
        System.out.println("Sequence Search: " + time);
        timeStart = System.nanoTime();
        binarySearch(array, array[9000], 0, array.length);
        timeStop = System.nanoTime();
        time = getTime(timeStop - timeStart);
        System.out.println("Binary Search: " + time);
        //System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Array index: " + array[9000]);
    }

    private String getTime(long time) {
        long timeInMicro = (time / 1000);
        if (timeInMicro < 1000) return timeInMicro + " Microseconds";
        else return (timeInMicro / 1000) + " Milliseconds " + (timeInMicro % 1000) + " Microseconds";
    }

    public int[] bubbleSort(int[] f) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < f.length - 1; i++) {
                if (f[i] > f[i + 1]) {
                    swapped = true;
                    swap(f, i, i + 1);
                }
            }
        }
        return f;
    }

    public int[] selectionSort(int[] f) {
        for (int i = 0; i < f.length - 1; i++) {
            for (int j = i + 1; j < f.length - 1; j++) {
                if (f[j] < f[i]) {
                  swap(f, i, j);
                }
            }
        }
        return f;
    }

    public void swap(int[] f, int x, int y) {
        int temp = f[x];
        f[x] = f[y];
        f[y] = temp;
    }

    public int[] insertionSort(int[] f) {
        for (int i = 1; i < f.length; i++) {
            int current = f[i];
            int j = i - 1;
            while (j >= 0 && f[j] > current) {
                f[j + 1] = f[j];
                j--;
            }
            f[j + 1] = current;
        }
        return f;
    }

    public int[] mergeSort(int[] f) {
        int length = f.length;
        if (length < 2) return f;
        int mid = length / 2;
        int[] leftSide = new int[mid];
        int[] rightSide = new int[length - mid];
        System.arraycopy(f, 0, leftSide, 0, mid);
        if (length - mid >= 0) System.arraycopy(f, mid, rightSide, 0, length - mid);
        mergeSort(leftSide);
        mergeSort(rightSide);
        return merge(f, leftSide, rightSide);
    }

    public int[] merge(int[] f, int[] leftSide, int[] rightSide) {
        int leftSize = leftSide.length;
        int rightSize = rightSide.length;
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (leftSide[i] <= rightSide[j]) {
                f[k] = leftSide[i];
                i++;
            } else {
                f[k] = rightSide[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            f[k] = leftSide[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            f[k] = rightSide[j];
            j++;
            k++;
        }
        return f;
    }
}