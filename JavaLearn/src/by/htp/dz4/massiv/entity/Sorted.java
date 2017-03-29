package by.htp.dz4.massiv.entity;

public class Sorted {
private int [] mas2;
private int nElement;
public Sorted(int max){
	mas2 = new int [max];
	nElement = 0;
}

public void add(int value){
//ћетод добавл€ющий элемент в массив
	mas2[nElement] = value;
	nElement++;
}

public void print(){ 
//¬ывод массива в строку
	for (int i=0; i<nElement; i++) System.out.print(mas2[i]+" ");
	System.out.println("");
}

public void change(int a, int b){
//ћетод мен€ющий местами элементы в массиве
	int c=mas2[a];
	mas2[a]=mas2[b];
	mas2[b]=c;
}

public void sortBubble(String s){ //—ортировка пузырьковым методом
	if (s.equals("up")){
	for (int i=nElement-1; i>1; i--)
		for (int j=0; j<i; j++)
			if (mas2[j]>mas2[j+1]) change(j,j+1);
	}
	if (s.equals("down")){
	for (int i=nElement-1; i>1; i--)
		for (int j=0; j<i; j++)
			if (mas2[j]<mas2[j+1]) change(j+1,j);
	}

}

public void sortSelect(String s){ //—ортировка методом выбора
	if (s.equals("up")){
	int min=0;
	for (int i=0; i<nElement-1; i++){
		min=i;
		for (int j=i+1; j<nElement; j++)
			if (mas2[j]<mas2[min]) min=j;
		change(i,min);
	}}
	
	if (s.equals("down")){
	int min=0;
	for (int i=0; i<nElement-1; i++){
		min=i;
		for (int j=i+1; j<nElement; j++)
			if (mas2[j]>mas2[min]) min=j;
		change(min,i);
	}}
	
}

public void sortInsert(String s){ //—ортировка методом вставки
	if (s.equals("up")){
	for (int i=1; i<nElement; i++){
		int c=mas2[i];
		int j=i;
		while (j>0 && mas2[j-1]>=c){
			mas2[j]=mas2[j-1];
			--j;
		}
			mas2[j]=c;
	}}
	
	if (s.equals("down")){
		for (int i=1; i<nElement; i++){
			int c=mas2[i];
			int j=i;
			while (j>0 && mas2[j-1]<=c){
				mas2[j]=mas2[j-1];
				--j;
			}
				mas2[j]=c;
		}}
	
}

public Sorted copyMas(Massiv mas){
	Sorted masNew;
	masNew = new Sorted(mas.Size());
	for (int i=0; i<mas.Size();i++) masNew.add(mas.getItem(i));  
	return masNew;
}


}
