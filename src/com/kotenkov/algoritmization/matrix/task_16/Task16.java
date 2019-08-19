package com.kotenkov.algoritmization.matrix.task_16;

//  Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел
//  1, 2, 3,...,n*n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей
//  равны между собой. Построить такой квадрат.

//	Алгоритм проверяет все возможные перестановки. Для порядка матрицы '3' результат выдается моментально,
//  а для порядка '4' первый магический квадрат будет найден через ~40-50 мин, а просчёт всех комбинаций
//	займёт 5-7 суток (на моем ноутбуке)

public class Task16 {
	
	public static void main(String[] args) {

		Task16 t = new Task16();

        t.doAllPermutations(3);

    }

	private static void doAllPermutations(int n){
        int size = (int)Math.pow(n,2);
        int [] array = new int [size];
        for (int i = 0; i < size; i++) {
            array[i] = i+1;
        }

        int magicConst = (n * (n*n + 1))/2;
        long counter = 1L;
        int i = -1;

        while(counter < getFactorial(size)){

            for (int k = array.length-1; k > 0 ; k--) {
                if(array[k] > array[k-1]){
                    i = k - 1;
                    break;
                }
            }

            for (int k = array.length-1; k > 0 ; k--) {
                if(array[k] > array[i]){
                    swap(array, i, k);
                    sortRightPartOfArray(array, i);
                    counter++;

                    if(checkArray(array, magicConst, n)){

                        System.out.println("Это магический квадрат:\n");
                        System.out.println(arrToMatrixString(array));
                    }

                    break;
                }
            }
        }
    }

    private static boolean checkArray(int [] arr, int magicConst, int n){

        if(!checkColumns(arr, n, magicConst)){
            return false;
        }
        if(!checkRows(arr, n, magicConst)){
            return false;
        }
        if(!checkMainD(arr, n, magicConst)){
            return false;
        }
        if(!checkSecondaryD(arr, n, magicConst)){
            return false;
        }
        return true;
    }

    private static boolean checkColumns(int [] arr, int n, int checkingSum){
        for (int i = 1; i < n; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j = j + n) {
                sum += arr[j];
            }
            if(checkingSum != sum){
                return false;
            }
        }
        return true;
    }

    private static boolean checkRows(int [] arr, int n,  int checkingSum){
        for (int i = n; i < arr.length; i = i + n) {
            int sum = 0;
            for (int j = i; j < i + n; j++) {
                sum += arr[j];
            }
            if(checkingSum != sum){
                return false;
            }
        }
        return true;
    }

    private static boolean checkMainD(int[] arr, int n, int checkingSum) {
        int sum = 0;
        for (int i = 0; i < arr.length; i = i + n + 1) {
            sum += arr[i];
        }
        if(checkingSum != sum){
            return false;
        }
        return true;
    }

    private static boolean checkSecondaryD(int[] arr, int n, int checkingSum) {
        int sum = 0;
        for (int i = n - 1; i < arr.length - 1; i = i + n - 1) {
            sum += arr[i];
        }
        if(checkingSum != sum){
            return false;
        }
        return true;
    }

    private static void sortRightPartOfArray(int[] array, int i) {
        int newLap = 0;
        for (int j = i + 1; j < array.length - 1; j++) {
            for (int k =  i + 1; k < array.length - newLap - 1; k++) {
                if(array[k] > array[k+1]){
                    swap(array, k, k+1);
                }
            }
            newLap++;
        }
    }

    private static void swap(int [] array, int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private static long getFactorial(int num){
        long result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }

    private static String arrToMatrixString(int [] arr){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.sqrt(arr.length); i++) {
            for (int j = 0; j < Math.sqrt(arr.length); j++) {
                sb.append(arr[i * (int)Math.sqrt(arr.length) + j]);
                sb.append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
