package by.htp.dz4.massiv.entity;

public class Massiv {
private Element[] mas; 
private int size;
private int nElement;

public Massiv(int size){
mas = new Element[size];
nElement=0;
}	

public int Size(){
	return size;
}

public void addItem (int i, int val){ //Метод который добавляет элемент в массив
mas[nElement] = new Element(i,val);
nElement++;
}

public int getItem (int i){ //Метод который возвращает значение i -го элемента
return mas[i].getElement();
}

public void setItem (int i, int count){ //Метод который заменяет значение i -го элемента на посланное значение count
mas[i].setElement(i,count);
}



public void masPrint(){
	for (int i=0; i<nElement; i++){ //Метод который вывоодит массив 
		mas[i].printElement();
	}
}

public int maxItem(){ //Метод который возвращает индекс максимального элемента в массиве
	int max=0;
	int index=0;
	for (int i=0; i<nElement; i++){
		if (mas[i].getElement() > max) {max = mas[i].getElement(); index = i;}
	}
	return index;
}

public int minItem(){ //Метод который возвращает индекс миниимального элемента в массиве
	int min=mas[0].getElement();
	int index=0;
	for (int i=0; i<nElement; i++){
		if (mas[i].getElement() < min) {min = mas[i].getElement(); index = i;}
	}
	return index;
}

public boolean isEmpty(){
//Метод проверяющий не пустой ли массив
	boolean b=true;
	if (nElement==0) b=false;
	return b;
}


public Massiv copyMas(Massiv mas){
//Просто метод для копирования массива 
	Massiv masNew;
	size=nElement;
	masNew = new Massiv(size);
	for (int i=0; i<size;i++) masNew.addItem(i, mas.getItem(i));  
	return masNew;
}

public Sorted convertMas(Massiv mas){ 
//Конвертирую массив класса Massiv в массив класса Sorted для последующей сортировки, чтобы начальный массив оставался нетронутым 
	Sorted masNew;
	size=nElement;
	masNew = new Sorted(size);
	for (int i=0; i<size;i++) masNew.add(mas.getItem(i));  
	return masNew;
}


}
