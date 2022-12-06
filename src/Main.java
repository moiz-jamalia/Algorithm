import java.util.Arrays;

public class Main {

    public static void main (String[] args) {
        Methode methode = new Methode();

        int count = 20;
        int[] data = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8};
        int[] f = {12, 3, 4, 5, 2, 4, 34, 78};
        int[] nums = {2,7,11,15};

        System.out.println(methode.betrag(-4));
        System.out.println(methode.betrag(4));
        methode.stimmtSumme(4,3,7);
        methode.stimmtSumme(4,2,7);
        System.out.println(methode.vergleicheZahl(8,4));
        System.out.println(methode.vergleicheZahl(2,3));
        System.out.println(methode.anzahlZiffern(20));
        System.out.println(methode.anzahlZiffern(24));
        System.out.println(methode.anzahlZiffern(100));
        long result = methode.fibonacciSequence(count);
        System.out.println("fibonacciSequence(" + count + "): " + result);
        System.out.println("Anzahl Ausführungen: " + Methode.numberOfCalls);
        methode.fibonnacci(count);
        System.out.println();
        methode.printNaturalNumbers(5);
        System.out.println();
        methode.powerOfTwo(9);
        System.out.println();
        System.out.println(methode.pow(3));
        methode.fakultaet(11);
        System.out.println("\nMethod");
        methode.method(16);
        System.out.println();
        System.out.println(methode.sequenceA_recursive(10));
        System.out.println(methode.sequenceA_iterative(10));
        methode.evenNumber(10);
        System.out.println();
        methode.oddNumber(10);
        System.out.println();
        methode.squareNumber(10);
        System.out.println();
        System.out.print(methode.ggt(25, 15));
        System.out.println();
        System.out.print("printback: ");
        methode.printBack(data, 4);
        System.out.println();
        methode.display(5);
        System.out.println();
        System.out.println(methode.calculate(5));
        System.out.print("mg: " + methode.medi(12));
        System.out.println();
        System.out.println("Kapital: " + methode.kapital(3));
        methode.testSearch1();
        System.out.println();
        methode.testSearch2();
        System.out.println(methode.binarySearch(data, 3, 0, data.length));
        System.out.println();
        methode.testBinarySearch1();
        methode.testBinarySearch2();
        methode.testBinarySearch3();
        methode.quicksort(f);
        System.out.println(Arrays.toString(f));
        methode.testSearch();
        System.out.println("BubbleSort: " + Arrays.toString(methode.bubbleSort(methode.createArray(20))));
        System.out.println("SelectionSort: " + Arrays.toString(methode.selectionSort(methode.createArray(20))));
        System.out.println("InsertionSort: " + Arrays.toString(methode.insertionSort(methode.createArray(20))));
        System.out.println("MergeSort: " + Arrays.toString(methode.mergeSort(methode.createArray(20))));
    }
}