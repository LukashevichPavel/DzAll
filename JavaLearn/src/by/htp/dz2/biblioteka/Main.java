package by.htp.dz2.biblioteka;

public class Main {

	public static void main(String[] args) {
		System.out.println("Задание: 1.Создать классы Книги и Журнал, а также абстрактный класс печатных изданий, который будет являться для них родительским");
		System.out.println("2.Создать класс Библиотека, в качестве поля объявить массив Печатных изданий");
		System.out.println("3.Написать метод добавления нового печатного издания."); 
		System.out.println("4.Написать метод просмотра печатных изданий (вывод на экран)");
		System.out.println("Количество печатных изданий в библиотеке не ограничено."); 
		System.out.println("");
		
		//Создаем 2 объекта класса Книга и 3 объекта класса журнал
		Book book = new Book("Book","50 ottenkov serogo", 105.3);
		Book book2 = new Book("Book", "Maugli", 103.75);
		Magazine magazine = new Magazine ("Magazine","Playboy",220.25);
		Magazine magazine2 = new Magazine ("Magazine","Java for student",325.55);
		Magazine magazine3 = new Magazine ("Magazine","The secret of Universe",103.15);
		
				
		Library lib = new Library(5); //Создаем библиотеку с размером в 5 печатных изданий
		lib.addItem(0, book); //Заполняем библиотеку
		lib.addItem(1, book2);
		lib.addItem(2, magazine);
		lib.addItem(3, magazine2);
		lib.addItem(4, magazine3);
		
		lib.printLibrary();// Вывожу библиотеку
		//System.out.println(lib.Size()); 
	}

}
