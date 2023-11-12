import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Задание 1 (Прямой/обратный порядок): ");
        System.out.println("Введите размер массива: ");
        int count = scanner.nextInt();
        int[] arr = new int[count];
        while (true) {
            System.out.println("Если вы хотите ввести массив сами нажмите 1, для заполнения рандомными числами 2");
            int q = scanner.nextInt();
            if (q == 1) {
                System.out.println("Введите элементы массива: ");
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = scanner.nextInt();
                }
                break;
            } else if (q == 2) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = random.nextInt(10);
                }
                break;
            } else {
                System.out.println("Введите 1 или 2");
            }
        }
        System.out.print("Вывод в прямом порядке: " );
        for(int i=0; i<arr.length; i++){
            System.out.print( arr[i] + " ");
        }
        System.out.println();
        System.out.print("Вывод в обратном порядке: " );
        for(int i=arr.length-1; i>=0; i--){
            System.out.print( arr[i] + " ");
        }


        System.out.println();
        System.out.println("Задание 2 (min/max): ");
        int max=0;
        int min=11;
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Max= " + max + "; Min= " + min);

        System.out.println();
        System.out.println("Задание 3 (min/max индексы): ");
        int maxIndex=-1;
        int minIndex=-1;
        for(int j=0; j<arr.length; j++){
            if(arr[j]==max){
                maxIndex=j;
            }
            if(arr[j]==min){
                minIndex=j;
            }
        }
        System.out.println("Max индекс= " + maxIndex + "; Min индекс= " + minIndex);

        System.out.println();
        System.out.println("Задание 4 (нулевые элементы): ");
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                zero++;
            }
        }
        if(zero>0) {
            System.out.println("Число нулевых элементов: " + zero);
        }else{
            System.out.println("Нулевых элементов нет");
        }


        System.out.println();
        System.out.println("Задание 5 (меняем местами) : ");

        int[] arr2 = new int[count];
        System.arraycopy(arr,0, arr2, 0, count);
        for (int i = 0, j=arr2.length-1; i < arr2.length/2 && j/2>=0; i++,j--) {
            int t=arr2[i];
            arr2[i]= arr[arr2.length-(i+1)];
            arr2[arr.length-(i+1)]=t;
        }
        System.out.println(Arrays.toString(arr2));

        System.out.println();
        System.out.println("Задание 6 (является ли массив возрастающим) : ");

        boolean answer = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1]){
                answer=true;
            } else{
                answer=false;
                break;
            }
        }
        System.out.println(answer);

        System.out.println();
        System.out.println("Задание * (добавление 1) : ");



        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                arr[i] = Math.abs(arr[i]);
            }
        }
        System.out.println("Изначальный массив: " + Arrays.toString(arr));
        int number = 0;
        for (int i=arr.length-1, n=1; i>=0; i--, n*=10) {
            number += Math.abs(arr[i])*n;
        }
        number+=1;

        int count1=0;
        int number1=number;

        while(number1 !=0 ){
            number1/=10;
            count1+=1;
        }

        int[] arr3 = new int[count1];
        for (int i = arr3.length-1; i >=0; i--) {
            arr3[i]=number%10;
            number/=10;

        }
        System.out.println("Новый массив: "+Arrays.toString(arr3));
    }

}