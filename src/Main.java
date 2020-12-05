import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        System.out.println("Vvedite kol-vo chisel: ");  //запрос количества вводимых чисел
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println("Vvedite chisla: ");
        int [] arrayList = new int[number];             //инициализация массива
        int j = 0;
        while (j < number){                             //наполнение массива
            arrayList[j] = scan.nextInt();
            j++;
        }

        boolean sorted = false;                         //сортировка пузырьком
        int temp;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < arrayList.length -1; i++) {
                //сравнение значений длин элементов массива
                if (String.valueOf(arrayList[i]).length() > String.valueOf(arrayList[i+1]).length()){
                    temp = arrayList[i];
                    arrayList[i] = arrayList[i+1];
                    arrayList[i+1] = temp;
                    sorted = false;
                }
            }
        }

        for (int k:arrayList
             ) {
            System.out.print(k+" ");
        }

    }
}
