package by.htp.dz5.putevka.launcher;
import by.htp.dz5.putevka.entity.*;
public class Launcher {

	public static void main(String[] args) {
	System.out.println("Туристические  путевки.");
	System.out.println("Сформировать  набор  предложений  клиенту по выбору туристической путевки различного типа:");
	System.out.println("отдых, экскурсии, ле-чение, шопинг, круиз и т. д. для оптимального выбора."); 
	System.out.println("Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сорировку путевок");
		
	Base base = new Base();
	base.startTur();
		

	}

}
