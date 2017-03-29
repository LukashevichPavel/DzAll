package by.htp.dz2.biblioteka;

public class Library {
	private PrintedEdition lib[]; //объ€вл€ем массив объектов класса ѕечатные издани€ 
	private int size; //переменна€ определ€юща€ изначальный размер массива
	private int index; //переменна€ дл€ индексации элементов массива

	
	public Library(int size){ // онструктор класса библиотека. ¬ходной параметр определ€ет размер создаваемого  массива 
		lib = new PrintedEdition[size]; //создаем массив lib в котором будут хранитс€ издани€; 
		this.size=size;
		this.index = 0;	//«адаем начальное значение индекса дл€ €чеек массива
			//this.type = type;
			}
			
	public void addItem(int index, PrintedEdition printedEdition){//ƒобавление печатного издани€ в массив 
		this.lib[index]=printedEdition;
		}
	
	public PrintedEdition getItem(int index){//¬озвращает печатное издание наход€щеес€ в массиве в позиции index
		return(this.lib[index]);
		}
	public void printLibrary (){//¬ыводит всю библиотеку
		for (int i=0; i<this.size; i++){
			System.out.print(this.lib[i].getType()+" * ");
			System.out.print(this.lib[i].getTitle()+" * ");
			System.out.println(this.lib[i].getPrice()+" * ");
			
			}
	}

	public int Size(){ //¬озвращает размер библиотеки
		return size;
	}

	}
