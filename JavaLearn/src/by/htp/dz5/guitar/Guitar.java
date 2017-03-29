package by.htp.dz5.guitar;

import java.util.Arrays;

public class Guitar {
private String producer;
private Struna[] struns;
private Skvorechnik baraban; 
private int countStrun;
private String type;


public Guitar(String producer, int countStrun, String type, Skvorechnik bar, Struna[] kom){
this.producer = producer;
this.countStrun = countStrun;
this.type = type;
this.struns = new Struna[countStrun];
this.struns = kom;
this.baraban=bar;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((baraban == null) ? 0 : baraban.hashCode());
	result = prime * result + countStrun;
	result = prime * result + ((producer == null) ? 0 : producer.hashCode());
	result = prime * result + Arrays.hashCode(struns);
	result = prime * result + ((type == null) ? 0 : type.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Guitar other = (Guitar) obj;
	if (baraban == null) {
		if (other.baraban != null)
			return false;
	} else if (!baraban.equals(other.baraban))
		return false;
	if (countStrun != other.countStrun)
		return false;
	if (producer == null) {
		if (other.producer != null)
			return false;
	} else if (!producer.equals(other.producer))
		return false;
	if (!Arrays.equals(struns, other.struns))
		return false;
	if (type == null) {
		if (other.type != null)
			return false;
	} else if (!type.equals(other.type))
		return false;
	return true;
}

public void nastroika(){
	for (int i=0; i<struns.length; i++)	struns[i].setAccuracy(100);
}


public void changeStruns(int index, Struna b){
struns[index]=b;	

}

public void showStruns(){
for (int i=0; i<countStrun;i++){
	System.out.println((i+1)+" струна: "+struns[i].toString());	
}
	
}

public String getProducer() {
	return producer;
}


public void setProducer(String producer) {
	this.producer = producer;
}


public Struna[] getStruns() {
	return struns;
}


public void setStruns(Struna[] struns) {
	this.struns = struns;
}


public Skvorechnik getBaraban() {
	return baraban;
}


public void setBaraban(Skvorechnik baraban) {
	this.baraban = baraban;
}


public int getCountStrun() {
	return countStrun;
}


public void setCountStrun(int countStrun) {
	this.countStrun = countStrun;
}


public String getType() {
	return type;
}


public void setType(String type) {
	this.type = type;
}


@Override
public String toString() {
	return "Guitar [Производитель]:" + producer + ", [тип]:" + type + ", [количество струн]" + countStrun;
}


public void play(int num,int count){
	for(int i=0; i<count; i++) {
		struns[num-1].setIznos(struns[num-1].getIznos()-0.001); //Уменьшаем прочность струны
		struns[num-1].setAccuracy(struns[num-1].getAccuracy()-1); //Уменьшаем настроенность струны
	}
}


}