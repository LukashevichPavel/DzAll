package by.htp.dz5.autosalon;
import java.io.*;
public class Main {

	public static void main(String[] args)throws Exception {
/*		
System.out.println("Задание: С87, Вариант А, спецификация №8 Car");
System.out.println("1.Создать классы в соответствии со спецификацией.");
System.out.println("2.Определить конструкторы и методы Set/Get, toString");
System.out.println("3.Определить дополнительно методы в классе, создающем массив объектов.");
System.out.println("Задать критерий выбора данных и вывести эти данные на консоль.");
System.out.println("В каждом классе, обладающим информацией, должно быть объявлено несколько конструкторов.");
System.out.println("Спецификация Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.");
System.out.println("Создать массив объектов. Вывести:");
System.out.println("(a) список автомобилей заданной марки;");
System.out.println("(b) список автомобилей заданной модели, которые эксплуатируются больше n лет;");
System.out.println("(c) список автомобилей заданного года выпуска, цена которых больше указанной.");
System.out.println("");
*/

boolean in=true, out=true, in2=true;
Auto [] salonBase= new Auto[11];//Объявление автосалона
Auto [] salonBaseTemp= new Auto[11];
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
System.out.println("Начало работы программы");
while (out){
System.out.println("Введите цифру которая соответствует нужному пункту меню (1,2,3,4,5,6,7)");
System.out.println("Меню:1.Создать запись авто 2.Удалить запись авто 3.Вывести всю базу 4.Поиск авто 5.Сортировка 6.Загрузить готовую базу авто 7.Выход");
String s=reader.readLine();
if (tryParseInt(s)==null){ s="default";}
else{
int option = Integer.parseInt(s);
switch (option){
	case 1:{//Добавление нового элемента
		in = true;
		while (in){
			int s0=0; 
			if (salonBase[0]==null) s0=1;
			else {
				for (int i=0; i<salonBase.length;i++) 
					if (salonBase[i]==null) s0=i+1; 
			}
			
			System.out.print("Введите марку автомобиля: ");
			String s1=reader.readLine();
			System.out.print("Модель: ");
			String s2=reader.readLine();
			System.out.print("Год выпуска: ");
			int s3=Integer.parseInt(reader.readLine());
			System.out.print("Цвет: ");
			String s4=reader.readLine();
			System.out.print("Цена: ");
			int s5=Integer.parseInt(reader.readLine());
			System.out.print("Регистрационный номер: ");
			String s6=reader.readLine();
			Auto autoTemp = new Auto(s0,s1,s2,s3,s4,s5,s6);
			System.out.println("Вы ввели: "); 
			autoTemp.printAuto(); 
			System.out.print("Добавить в базу автосалона? (yes - добавить, иначе сброс): ");
			String option2=reader.readLine();
			if (option2.equals("yes")){
			    
				Auto salonBaseTemp2[] = new Auto[s0+1];
			    for (int i=0; i<s0;i++) salonBaseTemp2[i]=salonBase[i]; //копируем старый массив в новый 
			    salonBaseTemp2[s0-1]=autoTemp;
			    salonBase=salonBaseTemp2;
				System.out.println("Запись добавлена");
				System.out.print("Добавить следующую запись? (yes - добавить, иначе ввод прекращается) ");
				option2=reader.readLine();
				if (!option2.equals("yes")) in=false; 
			}
			else {
				System.out.print("Запустить ввод заново? (yes - заново, иначе ввод прекращается)");
				option2=reader.readLine();
				if (!option2.equals("yes")) in=false; 
			}
		}
		
	break;}
	case 2:{
		in2=true;
		if (salonBase[0]==null) {System.out.println("База данных пуста"); break;}
		else{
			int count=0;
					for (int i=0; i<salonBase.length;i++) if (salonBase[i]!=null) count++;//Подсчитываем не пустые элементы в массиве
					System.out.println("В базе найдено " + count + " записей");
					for (int i=0; i<salonBase.length;i++) if (salonBase[i]!=null)salonBase[i].printAuto();
					System.out.println("");
			System.out.println("Введите id записи которую Вы хотите удалить: ");
			while (in2){
			String option3=reader.readLine();
			if (option3.equals("q")) in2=false;
			if (option3.equals("print")) {}
			if (tryParseInt(option3)==null){System.out.println("Данные введены некорректно, введите id записи которую следует удалить, print для повторного вывода всей базы или q для выхода");}
			else{ 
				//for (int i=0; i<salonBase.length;i++) if (salonBase[i].getId()==Integer.parseInt(option3)){//Ищем id элемента который следует удалить
					
				//}
				}
			
			}
		
		}
		
		break;}
	case 3:{//Вывод всей базы
		if (salonBase[0]==null) System.out.println("База данных пуста");
		else {
			int count=0;
			for (int i=0; i<salonBase.length;i++) if (salonBase[i]!=null) count++;//Подсчитываем не пустые элементы в массиве
			System.out.println("В базе найдено " + count + " записей");
			for (int i=0; i<salonBase.length;i++) if (salonBase[i]!=null)salonBase[i].printAuto();
			System.out.println("");
			}
		break;
		}
	case 4:{
		if (salonBase[0]==null) System.out.println("База данных пуста");
		else {
			boolean in3=true;
			while (in3){
				System.out.println("1.Вывести всю базу");
				System.out.println("2.Найти авто по марке");
				System.out.println("3.Найти авто по модели, которые эксплуатируются больше n лет");
				System.out.println("4.Cписок автомобилей заданного года выпуска, цена которых больше указанной");
				System.out.println("5.Выйти из поиска");
				int option4=Integer.parseInt(reader.readLine());
				switch (option4){
					case 1:{//Вывод всей базы
						int count=0;
						for (int i=0; i<salonBase.length;i++) if (salonBase[i]!=null) count++;//Подсчитываем не пустые элементы в массиве
						System.out.println("В базе найдено " + count + " записей");
						for (int i=0; i<salonBase.length;i++) if (salonBase[i]!=null)salonBase[i].printAuto();
						System.out.println("");
						break;
					}
					case 2:{//Найти все авто определенной марки
					System.out.print("Вы выбрали поиск по марке. Введите марку которую будем искать: ");
					String option5=reader.readLine();
					for (int i=0; i<salonBase.length;i++) if ((salonBase[i]!=null)&&(salonBase[i].getMarka().equals(option5))) salonBase[i].printAuto();
					break;
					}
					case 3:{//Найти авто по модели, которые эксплуатируются больше n лет
					System.out.println("Вы выбрали поиск по моделе которые эксплуатируются больше n лет");
					System.out.print("Введите модель: ");
					String option6=reader.readLine();
					System.out.print("Введите количество лет: ");
					int option7=Integer.parseInt(reader.readLine());
					int temp=0;
					for (int i=0; i<salonBase.length;i++) if ((salonBase[i]!=null)&&(salonBase[i].getModel().equals(option6))&&(2017-salonBase[i].getYear()>option7)) {
						salonBase[i].printAuto();
						temp++; 
					}
					if (temp>0) System.out.println("По заданным параметрам найдено "+temp+" записей");
					else System.out.println("По заданным параметрам записей не найдено");
					break;
					}
					case 4:{//Cписок автомобилей заданного года выпуска, цена которых больше указанной"
						System.out.println("Вы выбрали поиск по авто по году выпуска цена которой больше указанной?");
						System.out.print("Введите модель: ");
					}
					
					case 5:{
						in3=false; 
						break;
					}
					default:{
						System.out.println("Выберите один из пунктов или введите 6 для выхода в предыдущее меню");
					}
				}
			}
		}
		
		break;}
	case 5:{break;}
	case 6:{
		System.out.println("База данных очищена и перезаписана, внесены 10 авто");
		Auto auto1 = new Auto (1,"Hyundai","Solaris",2014,"Gray",12500,"7435 НХ-7");
		Auto auto2 = new Auto (2,"Hyundai","SantaFe",2015,"Black",31200,"7777 НХ-7");
		Auto auto3 = new Auto (3,"Hyundai","Ix 35",2015,"Red",18700,"5435 НХ-7");
		Auto auto4 = new Auto (4,"Opel","Insignia",2012,"Gray",15500,"6633 IP-7");
		Auto auto5 = new Auto (5,"Opel","Vectra",2010,"Blue",9500,"8835 OM-5");
		Auto auto6 = new Auto (6,"Opel","Astra",1997,"Blue",1000,"2754 OM-7");
		Auto auto7 = new Auto (7,"Mersedes","ML-350",2001,"Silver",32500,"6112 OC-7");
		Auto auto8 = new Auto (8,"Lamborgini","Diablo",2001,"Red",682500,"7777 НХ-7");
		Auto auto9 = new Auto (9,"Lada","Vesta",2015,"Black",12500,"1111 OC-7");
		Auto auto10 = new Auto (10,"Shefrolet","Niva",2003,"Green",10000,"8812 OC-7");
			salonBaseTemp[0] = auto1;
			salonBaseTemp[1] = auto2;
			salonBaseTemp[2] = auto3;
			salonBaseTemp[3] = auto4;
			salonBaseTemp[4] = auto5;
			salonBaseTemp[5] = auto6;
			salonBaseTemp[6] = auto7;
			salonBaseTemp[7] = auto8;
			salonBaseTemp[8] = auto9;
			salonBaseTemp[9] = auto10;
			salonBaseTemp[10] = null;
			salonBase=salonBaseTemp;
			
		
		for (int i=0; i<salonBase.length-1;i++) salonBase[i].printAuto();
		System.out.println("");
		break;
	}
	case 7:{
		out=false;
		System.out.println("Работа программы завершена");
		break;
	}
	default:{System.out.println("Введите номер пункта меню, который нужно выполнить (1,2,3,4,5,6,7)");}
}
}
}






	}
	public static Integer tryParseInt(String s) {
	    try {
	        return new Integer(s);
	    } catch (NumberFormatException e) {
	        return null; // не-а, не int
	    }
	}
}
