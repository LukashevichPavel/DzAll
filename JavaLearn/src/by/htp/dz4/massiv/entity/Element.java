package by.htp.dz4.massiv.entity;

public class Element{
private int index;
private int count;



public Element(int index, int count){
this.index = index;
this.count = count;
}


public void printElement(){
System.out.println("mas["+index+"] = "+ count);
}

public int getElement(){
return count;
}
public void setElement(int i, int count){
this.index=i;
this.count=count;
}


}