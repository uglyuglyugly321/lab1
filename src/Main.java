import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1.1
        System.out.println("Блок 1. Задача 1: ");
        System.out.println("Введите число: ");
        double number = scanner.nextDouble();
        Test calc = new Test();
        System.out.println("Дробная часть: " + (calc.fraction(number)));

        // Задача 1.3
        System.out.println("Блок 1. Задача 3: ");
        System.out.print("Введите цифру (0-9): ");
        char c = scanner.next().charAt(0);
        Test converter = new Test();
        int result = converter.charToNum(c);
        System.out.println("Число: " + result);

        // Задача 1.5
        System.out.println("Блок 1. Задача 5: ");
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        Test checker = new Test();
        boolean result2 = checker.is2Digits(x);
        System.out.println("Является ли число двузначным " + result2);

        // Задача 1.7
        System.out.println("Блок 1. Задача 7: ");
        System.out.println("Введите левую границу диапазона : ");
        int a = scanner.nextInt();
        System.out.println("Введите левую границу диапазона : ");
        int b = scanner.nextInt();
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        Test checker2 = new Test();
        boolean result3 = checker2.isInRange(a, b, num);
        System.out.println(result3);

        // Задача 1.9
        System.out.println("Блок 1. Задача 9: ");
        System.out.println("Введите 3 числа: ");
        int fir = scanner.nextInt();
        int sec = scanner.nextInt();
        int thr = scanner.nextInt();

        Test checker3 = new Test();
        boolean result4 = checker3.isInRange(fir, sec, thr);
        System.out.println(result4);

        // Задача 2.1
        System.out.println("Блок 2. Задача 1: ");
        System.out.println("Введите число: ");
        int m = scanner.nextInt();
        Test calc2 = new Test();
        int result5 = calc2.abs(m);
        System.out.println("Модуль числа: " + result5);

        // Задача 2.3
        System.out.println("Блок 2. Задача 3: ");
        System.out.println("Введите число: ");
        int g = scanner.nextInt();
        Test checker4 = new Test();
        boolean result6 = checker4.is35(g);
        System.out.println("Результат: " + result6);

        // Задача 2.5
        System.out.println("Блок 2. Задача 5: ");
        System.out.println("Введите 3 числа: ");
        int comp1 = scanner.nextInt();
        int comp2 = scanner.nextInt();
        int comp3 = scanner.nextInt();
        Test checker5 = new Test();
        int result7 = checker5.max3(comp1, comp2, comp3);
        System.out.println("Результат: " + result7);

        // Задача 2.7
        System.out.println("Блок 2. Задача 7: ");
        System.out.println("Введите 2 числа: ");
        int sum1 = scanner.nextInt();
        int sum2 = scanner.nextInt();
        Test checker7 = new Test();
        int result8 = checker7.sum2(sum1, sum2);
        System.out.println("Результат: " + result8);

        // Задача 2.9
        System.out.println("Блок 2. Задача 9: ");
        System.out.println("Введите День недели: ");
        int day = scanner.nextInt();
        Test checker8 = new Test();
        String result9 = checker8.day(day);
        System.out.println(result9);

        // Задача 3.1
        System.out.println("Блок 3. Задача 1: ");
        System.out.println("Введите число: ");
        int list_num = scanner.nextInt();
        Test checker9 = new Test();
        String result10 = checker9.listNums(list_num);
        System.out.println(result10);

        // Задача 3.3
        System.out.println("Блок 3. Задача 3: ");
        System.out.println("Введите число: ");
        int list_num2 = scanner.nextInt();
        Test checker10 = new Test();
        String result11 = checker10.chet(list_num2);
        System.out.println(result11);

        // Задача 3.5
        System.out.println("Блок 3. Задача 5: ");
        System.out.println("Введите число: ");
        int count_sign = scanner.nextInt();
        Test checker11 = new Test();
        int result12 = checker11.numLen(count_sign);
        System.out.println("Длина числа: " + result12);

        // Задача 3.7
        System.out.println("Блок 3. Задача 7: ");
        System.out.println("Введите число: ");
        int square = scanner.nextInt();
        Test sp = new Test();
        sp.square(square);

        // Задача 3.9
        System.out.println("Блок 3. Задача 9: ");
        System.out.println("Введите число: ");
        int triangle = scanner.nextInt();
        Test tp = new Test();
        tp.rightTriangle(triangle);

        // Задача 4.1
        System.out.println("Блок 4. Задача 1: ");
        System.out.println("Введите количество элементов массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Введите число для поиска: ");
        int arr_num = scanner.nextInt();
        Test t = new Test();
        int index = t.findFirst(arr, arr_num);
        if (index != -1) {
            System.out.println("Первое вхождение числа " + x + " находится под индексом: " + index);
        }
        else {
            System.out.println("Число " + x + " в массиве не найдено.");
        }

        // Задача 4.3
        System.out.println("Блок 4. Задача 3: ");
        System.out.print("Введите количество элементов массива: ");
        int n2 =  scanner.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();

        }

        Test t2 = new Test();

        int max = t2.maxAbs(arr2);
        System.out.println("Наибольшее по модулю число: " + max);


        // Задача 4.7
        System.out.println("Блок 4. Задача 7 : ");
        System.out.print("Введите количество элементов массива: ");
        int n3 = scanner.nextInt();
        int[] arr3 = new int[n3];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr3[i] = scanner.nextInt();
        }

        Test t3 = new Test();
        int[] reversedArr = t3.reverseBack(arr3);

        System.out.print("Обратный массив: ");
        for (int i = 0; i < reversedArr.length; i++) {
            System.out.print(reversedArr[i] + " ");
        }
        System.out.println();

        // Задача 4.9
        System.out.println("Блок 4. Задача 9: ");
        System.out.println("Введите количество элементов массива: ");
        int n4  = scanner.nextInt();
        int[] arr4 = new int[n4];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n4; i++) {
            arr4[i] = scanner.nextInt();
        }
        System.out.print("Введите число для поиска: ");
        int x4 = scanner.nextInt();

        Test t4 = new Test();
        int[] result111 = t4.findAll(arr4, x4);


        if (result111.length == 0){
            System.out.println("Число " + x4 + "не найдено!");
        }
        else {
            System.out.println("Вхождения всех вхождений числа " + x4 + ": ");
            for (int i = 0; i < result111.length; i++) {
                System.out.print(result111[i] + " ");
            }
            System.out.println();
        }

    }



}

