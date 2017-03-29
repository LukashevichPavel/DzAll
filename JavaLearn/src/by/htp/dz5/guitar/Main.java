package by.htp.dz5.guitar;

public class Main {

	public static void main(String [] args) {
		System.out.println("Создать  объект  класса Гитара,  используя  класс Струна, Скворечник.");
		System.out.println("Методы: играть, настраивать, заменить струну.");
Struna [] komplektStrun; 
Struna str1= new Struna("DadDario", "Acustic", "E", 100 , "Silver", 100);  //Создаем струны 
Struna str2= new Struna("DadDario", "Acustic", "A", 100 ,"Silver", 100);
Struna str3= new Struna("DadDario", "Acustic", "D", 99, "Silver", 100);
Struna str4= new Struna("DadDario", "Acustic", "G", 95, "Silver", 100);
Struna str5= new Struna("DadDario", "Acustic", "B", 98, "Silver", 100);
Struna str6= new Struna("DadDario", "Acustic", "E", 94, "Silver", 100);
komplektStrun = new Struna[6];//Комплект струн
komplektStrun[0]=str1;
komplektStrun[1]=str2;
komplektStrun[2]=str3;
komplektStrun[3]=str4;
komplektStrun[4]=str5;
komplektStrun[5]=str6;
Skvorechnik baraban = new Skvorechnik("Дуб Арлингтонский", "Белый", "Классическая");//Создаем барабан
Guitar myClassicGuitar = new Guitar("Jay Turser", 6, "Acustic", baraban, komplektStrun);//Создаем гитару
System.out.println(myClassicGuitar.toString());
System.out.println(baraban.toString());
myClassicGuitar.showStruns(); 
Struna str7= new Struna("Sonata", "Acustic", "D", 100, "Bronze", 100);	//Создаем еще 1 струну для замены
myClassicGuitar.changeStruns(3, str7);//Замена 3 струны
System.out.println("");
myClassicGuitar.play(5,2); // Играем 5 струну 2 раза
myClassicGuitar.play(1,1); // Играем 1 струну 1 раз
myClassicGuitar.play(4,5); // Играем 4 струну 5 раз
myClassicGuitar.play(2,3); // Играем 2 струну 3 раза
myClassicGuitar.play(1,2); // Играем 1 струну 2 раза
myClassicGuitar.showStruns();
myClassicGuitar.nastroika();//Настройка гитары
System.out.println("");
myClassicGuitar.showStruns();


	}

}
