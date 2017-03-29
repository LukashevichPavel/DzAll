package by.htp.dz1.first;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a=0, b=0, c=0, sum=0, max=0, indexI=0, indexJ=0, i=0, j=0, size=0; 
		boolean q=true;
		String z="",option="";
		
		Scanner sc = new  Scanner(System.in);
		Scanner sc2 = new  Scanner(System.in);
		System.out.print("Введите номер задания, от 1 до 14: ");
		switch (sc.nextInt()){
	
		case 1:{//Zadanie 1:
			System.out.println("Задание: Написать консольное приложение, которое выводит на экран надпись “Hello World!”");
			System.out.println("");
			System.out.println("Hello world");
			break;}
	
		case 2:{//Zadanie 2:
			System.out.println("Задание: Распечатать на экране своё ФИО. Фамилия, Имя и Отчество должны выводиться на разных строках.");
			System.out.println("");
			System.out.println("Lukashevich");
			System.out.println("Pavel");
			System.out.println("Mikhailovich");
			break;}
		
		case 3:{//Zadanie 3:
			System.out.println("Задание: Написать программу, которая умеет складывать 2 числа типа int и выводить результат на экран.");
			System.out.println("");
			System.out.println("Будете вводить а и b c клавиатуры? (Напишите yes чтобы начать ввод, иначе будем считать a = 6, b = 7)");
			option=sc2.nextLine();
			if (option.equals("yes")){
				System.out.print("a = ");
				a=sc.nextInt();
				System.out.println("");
				System.out.print("b = ");
				b=sc.nextInt();
				System.out.println("");
				sum = a + b;
				System.out.println("a + b = " + sum);
			}
			else{
				a=6; b=7; sum=a+b;
				System.out.println("a + b = " + sum);	
			} 
				
			break;}
		
		case 4:{//Zadanie 4:
			System.out.println("Задание: Модернизировать задачу 3 следующим образом: программа запрашивает с клавиатуры ввод двух целых чисел и знак арифметической операции.");
			System.out.println("Программа выполняет арифметическое действие над введёнными числами и результат выводит на экран. ");
			System.out.println("");
			System.out.print("a = ");
			a=sc.nextInt();	
			System.out.println("");
			System.out.print("b = ");
			b=sc.nextInt();	
			System.out.println("");
			System.out.print("Введите знак действия (+,-,*,/): ");
			z=sc2.nextLine();
			switch(z){
				case "+":{System.out.println("a + b = "+(a+b)); break;}
				case "-":{System.out.println("a - b = "+(a-b)); break;}
				case "/":{System.out.println("a / b = "+(a/b)); break;}
				case "*":{System.out.println("a * b = "+(a*b)); break;}
				default:{System.out.print("Введен некорректный знак действия");}
				}
			break;}
		
		case 5:{//Zadanie 5:
			System.out.println("Задание: Ввести с клавиатуры число от 0 до 9. Программа должна вывести название цифры.");
			System.out.println("Введите число от 0 до 9 ");
			a=sc.nextInt();	
			switch (a){
				case 0:{System.out.println("Нуль"); break;}
				case 1:{System.out.println("Один"); break;}
				case 2:{System.out.println("Два"); break;}
				case 3:{System.out.println("Три"); break;}
				case 4:{System.out.println("Четыре"); break;}
				case 5:{System.out.println("Пять"); break;}
				case 6:{System.out.println("Шесть"); break;}
				case 7:{System.out.println("Семь"); break;}
				case 8:{System.out.println("Восемь"); break;}
				case 9:{System.out.println("Девять"); break;}
				default:{System.out.print("Введено число меньше 0 или больше 9 ");}
				}
			break;}
		
		case 6:{//Zadanie 6: 	
			System.out.println("Задание: Ввести с клавиатуры число от 0 до 9. Определить является ли введённое число чётным.");
			System.out.println("Введите число от 0 до 9 ");
			a=sc.nextInt();	
			if (a%2==0) {System.out.println("Число четное");} //Если остаток от деления на 2 равен 0 значит число четное 
			else {System.out.println("Число нечетное");}
			break;}
		
		case 7:{//Zadanie 7: 		
			System.out.println("Задание: Ввести с клавиатуры число от -9 до 9. Определить является ли введённое число чётным положительным.");
			System.out.println("Введите число от -9 до 9 ");
			a=sc.nextInt();	
			if (a>0){System.out.println("Число положительное");}
			if (a<0){System.out.println("Число отрицательное");}
			if (a==0){System.out.println("Число равно 0");}	
			break;}
		
		case 8:{
			//Zadanie 8: 
			System.out.println("Задание: Ввести с клавиатуры полное название месяца. Определить, к какому сезону года относится данный месяц.");
			System.out.print("Введите полное название месяца (january,february,march,april,may,june,july,august,september,october,november,december): ");
			z=sc2.nextLine();	
			System.out.println(z);
			if ((z.equals("january"))||(z.equals("february"))||(z.equals("december"))){System.out.println("Сезон зима");}
			if ((z.equals("march"))||(z.equals("april"))||(z.equals("may"))){System.out.println("Сезон весна");}
			if ((z.equals("june"))||(z.equals("july"))||(z.equals("august"))){System.out.println("Сезон лето");}
			if ((z.equals("september"))||(z.equals("october"))||(z.equals("november"))){System.out.println("Сезон осень");}
			break;}
		
		case 9:{//Zadanie 9: 	
			System.out.println("Задание: Посчитать сумму чисел от 0 до 100.");
			sum = 0;
			for (i=0; i<=100; i++) sum = sum + i;
			System.out.println("Сумма чисел от 0 до 100 = " + sum);	
			break;}
		
		case 10:{//Zadanie 10: 			
			System.out.println("Задание: Написать программу нахождения суммы большего и меньшего из 3х чисел.");
			System.out.print("a = ");
			a = sc.nextInt();
			System.out.print("b = ");
			b = sc.nextInt();
			System.out.print("c = ");
			c = sc.nextInt();
			if ((a>b)&&(a<c)||((a<b)&&(a>c))){System.out.println("Сумма наибольшего и наименьшего = "+(b+c));}
			if ((b>a)&&(b<c)||((b<a)&&(b>c))){System.out.println("Сумма наибольшего и наименьшего = "+(a+c));}
			if ((c>b)&&(c<a)||((c<b)&&(c>a))){System.out.println("Сумма наибольшего и наименьшего = "+(a+b));}
			if (a==b){System.out.println("Сумма наибольшего и наименьшего = "+(a+c));}
			else {
				if (a==c){System.out.println("Сумма наибольшего и наименьшего = "+(a+b));}
				else {
					if (c==b){System.out.println("Сумма наибольшего и наименьшего = "+(a+c));}
					}
				}
			break;}
		
		case 11:{//Zadanie 11:
			System.out.println("Задание: Программа запрашивает ввод символов, до тех пор, пока пользователь не введёт символ ‘q’.");
			while (q){
				System.out.print("Введите символ: ");
				z=sc2.nextLine();
				if (z.equals("q")) {q=false;}
				}
			System.out.println("Введен символ q");
			break;}
		
		case 12:{//Zadanie 12:	
			System.out.println("Задание: Программа запрашивает ввод строк текста. Продолжаем ввод до тех пор, пока не будет введено слово “stop”.");
			q=true;
			while (q){
				System.out.print("Введите строку: ");
				z=sc2.nextLine();
				if (z.equals("stop")) {q=false;}
				}
			System.out.println("Введена строка stop");
			break;}
		
		case 13:{
			System.out.println("Задание: Найти максимальный элемент матрицы и удалить из матрицы все строки и столбцы, его содержащие.");
			size=0; max=0;
			System.out.print("Считаем что матрица будет квадратной, то есть число строк равно число столбцов. Введите размерность матрицы: ");
			size=sc.nextInt();
			int[][] matrix= new int [size][size];
			for (i=0;i<size; i++){
				for (j=0;j<size; j++) matrix[i][j]=(int)(Math.random()*10); //Заполняем матрицу случайными числами	
				}
			max=matrix[0][0];
			for (i=0;i<size; i++)
				for (j=0;j<size; j++) 
					if (matrix[i][j]>max) {
					max = matrix[i][j];
					indexI=i;
					indexJ=j;
					}
			//Выводим матрицу на экран
			for (i=0;i<size; i++){
				for (j=0;j<size; j++)System.out.print(matrix[i][j]+" ");
				System.out.println("");
			}
			
			System.out.println("Максимальный элемент = matrix["+indexI+"]["+indexJ+"] = " + max);
			
			
			System.out.println("Эта задача еще не решена");
		break;}
		
		case 14:{//Zadanie 14:	
			System.out.println("Задание: Задача для смелых. Программа запрашивает размер матрицы, пользователь вводит размер с клавиатуры.");
			System.out.println("Далее программа запрашивает ввод элементов матрицы. Пользователь вводит значения с клавиатуры.");
			System.out.println("Программа должна посчитать сумму элементов на диагонали матрицы.");
			System.out.println("");
			size=0; 
			System.out.print("Считаем что матрица будет квадратной, то есть число строк равно число столбцов. Введите размерность матрицы: ");
			size=sc.nextInt();
			int[][] matrix= new int [size][size];
			System.out.print("Напишите auto чтобы заполнить матрицу случайными числами, иначе начнется ручной ввод ");
			option=sc2.nextLine();
			if (option.equals("auto")){
				System.out.println("Выбран автоматический режим, матрица будет заполнена случайными числами");
			for (i=0;i<size; i++){
				for (j=0;j<size; j++) matrix[i][j]=(int)(Math.random()*10); //Заполняем матрицу случайными числами	
				}
			}
			else {
				System.out.println("Выбран ручной режим");
				for (i=0;i<size; i++){
					for (j=0;j<size; j++){
						System.out.print("Введите элемент ["+i+"]["+j+"] = ");//Вводим элементы вручную
						matrix[i][j]=sc.nextInt();
					}
					System.out.println("");
					}
			}
			//Выводим матрицу на экран
			for (i=0;i<size; i++){
				for (j=0;j<size; j++)System.out.print(matrix[i][j]+" ");
				System.out.println("");
			}
			//Считаем суммы элементов на диагонали
			sum=0;
			for (i=0;i<size; i++){sum=sum+matrix[i][i];}
			System.out.println("Сумма элементов находящихся на диагонали = " + sum);
			break;}
		}
		System.out.println("");
		System.out.println("Программа выполнена");	
		sc.close();
		sc2.close();
	}	
	
}
