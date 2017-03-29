package by.htp.dz5.autosalon;

import java.util.Arrays;

public class AutoSalon {
public Auto[]salonBase;
public int index;
public int size;

public void createBase(){
Auto[]salonBase=new Auto[10];	//По умолчанию создаем базу с 10 элементами
for (int i=0; i<10;i++) {
	salonBase[i]=new Auto(1,"Hyundai","Solaris",2014,"Gray",12500,"7435 НХ-7");
	
}
System.out.println(salonBase.toString());
index=0;
size=10;
}

public void increaseBase (Auto [] salonBase){
Auto[] asTemp = new Auto [salonBase.length*2];//Создаем новый массив с увеличенным в два раза размером 
for (int i=0; i<salonBase.length;i++){ //Копируем все имеющиеся в массиве записи
	asTemp[i].setId(salonBase[i].getId());
	asTemp[i].setMarka(salonBase[i].getMarka());
	asTemp[i].setModel(salonBase[i].getModel());
	asTemp[i].setYear(salonBase[i].getYear());
	asTemp[i].setColor(salonBase[i].getColor());
	asTemp[i].setPrice(salonBase[i].getPrice());
	asTemp[i].setRegNumber(salonBase[i].getRegNumber());
	salonBase=asTemp; //Переопределяем ссылку со старого на новый массив 
	
}
} 

public void addAuto(int index, Auto auto){ //Добавляет переданное в аргументе авто в позицию index
if (index==size) increaseBase(salonBase);		
	   this.salonBase[index]=auto;
	 /*  this.salonBase[index].setMarka(auto.getMarka());
	   this.salonBase[index].setModel(auto.getModel());
	   this.salonBase[index].setYear(auto.getYear());
	   this.salonBase[index].setColor(auto.getColor());
	   this.salonBase[index].setPrice(auto.getPrice());
	   this.salonBase[index].setRegNumber(auto.getRegNumber());*/
		index++;
	}

public void delAuto (int index, Auto[] salonBase){
	Auto[] salonBaseTemp = new Auto[salonBase.length-1];	
for (int i=0; i<index;i++) salonBaseTemp[i]=salonBase[i]; 
for (int j=index+1; j<salonBase.length-1;j++) salonBaseTemp[j-1]=salonBase[j];	
salonBase=salonBaseTemp;	

}



public void print(){
	System.out.println(salonBase.toString());
}
public int getIndex() {
	return this.index;
}

public void setIndex(int index) {
	this.index = index;
}

public int getSize() {
	return size;
}
public Auto getAuto(int index){
	Auto autoTemp = new Auto(salonBase[index].getId(),salonBase[index].getMarka(),salonBase[index].getModel(),salonBase[index].getYear(),salonBase[index].getColor(),salonBase[index].getPrice(),salonBase[index].getRegNumber());
	
	return autoTemp; 
}
public void setSize(int size) {
	this.size = size;
}

@Override
public String toString() {
	return "Вся база автосалона: [" + Arrays.toString(salonBase) + "]";
}





}

