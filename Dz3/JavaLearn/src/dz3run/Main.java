package dz3run;
import java.util.Scanner;
import dz3.Element;
import dz3.Massiv;
import dz3.Sorted;

public class Main {
public static void main(String[] args) {
int maxSize=100;
String option;
Scanner sc = new Scanner(System.in);
Scanner sc2 = new Scanner(System.in);
System.out.println("������������, ��� ������������ ��������� �������������� ���������� ��������");
System.out.println("��������� ��������� ������ ���� �� �������� ����� stop ��� ������� ������������ ������");
System.out.print("������� ������ �������: ");

	if(sc.hasNextInt()) {
		maxSize=sc.nextInt();
		Massiv mas1 = new Massiv(maxSize);
		System.out.println("������� auto ��� ���������� ������� ���������� �������");
		System.out.println("������� manual ��� ���������� ������� ���������� �������");
		option = sc2.nextLine();
		switch (option){
		case "manual": {
			for (int i=0; i<maxSize; i++){ //������ ����� (������ ����������� �������)
				System.out.print("������� "+ i + " �������: ");
				if (sc.hasNextInt()) {mas1.addItem(i, sc.nextInt());}
				else {	System.out.print("������� ������������ ������"); 
					System.out.println("������ ��������� ���������"); 
					break;
					}
			}
		break;}
		case "auto":{
			for (int i=0; i<maxSize; i++) {
				mas1.addItem(i, (int)(Math.random()*100));
				}
		break;}
		default:{
			System.out.println("������� ������������ ������");
			System.out.println("������ ��������� ���������");
			break;}
		}
	
	if (mas1.isEmpty()){ //���� ������ �� ������ �� ������� ������ � ������������ � ����������� ��������
	mas1.masPrint();	//������� ������
	System.out.println("������������ �������: mas["+mas1.maxItem()+"] = "+mas1.getItem(mas1.maxItem()));//�ax
	System.out.println("������������ �������: mas["+mas1.minItem()+"] = "+mas1.getItem(mas1.minItem()));//Min	
	boolean stop=true;
	while (stop){
		System.out.println("");
		System.out.println("�������� ��������� �������� �������:");
		System.out.println("����������� ���������� �� �����������: ������� 1");
		System.out.println("����������� ���������� �� ��������: ������� 2");
		System.out.println("���������� ������� ������ �� �����������: ������� 3");
		System.out.println("���������� ������� ������ �� ��������: ������� 4");
		System.out.println("���������� ������� ������� �� �����������: ������� 5");
		System.out.println("���������� ������� ������� �� ��������: ������� 6");
		option = sc2.nextLine();	
		if (option.equals("stop")){stop = false; System.out.println("������� �������� ����� stop, ��������� ���������, ����� �������"); break;}
		switch (option){
		
		case "1":{		
			Sorted mas2 = new Sorted (maxSize);
			mas2=mas1.convertMas(mas1);
			mas2.print();
			mas2.sortBubble("up");//���������� �� ����������� ������� ������
			mas2.print();
			System.out.println("���������� ���������");
			break;
			}
		
		case "2":{	
			Sorted mas2 = new Sorted (maxSize);
			mas2=mas1.convertMas(mas1);
			mas2.print();
			mas2.sortBubble("down");//���������� �� �������� ������� ������
			mas2.print();
			System.out.println("���������� ���������");
			break;
			}
		
		case "3":{	
			Sorted mas2 = new Sorted (maxSize);
			mas2=mas1.convertMas(mas1);
			mas2.print();
			mas2.sortSelect("up");//���������� �� �������� ������� ������
			mas2.print();
			System.out.println("���������� ���������");
			break;
			}
		
		case "4":{	
			Sorted mas2 = new Sorted (maxSize);
			mas2=mas1.convertMas(mas1);
			mas2.print();
			mas2.sortSelect("down");//���������� �� �������� ������� ������
			mas2.print();
			System.out.println("���������� ���������");
			break;
			}
		case "5":{	
			Sorted mas2 = new Sorted (maxSize);
			mas2=mas1.convertMas(mas1);
			mas2.print();
			mas2.sortInsert("up");//���������� �� �������� ������� ������
			mas2.print();
			System.out.println("���������� ���������");
			break;
			}
		
		case "6":{	
			Sorted mas2 = new Sorted (maxSize);
			mas2=mas1.convertMas(mas1);
			mas2.print();
			mas2.sortInsert("down");//���������� �� �������� ������� ������
			mas2.print();
			System.out.println("���������� ���������");
			break;
			}
		
		default :{System.out.println("�� ����� ��� �� �� ����������, ����� ������� ��� �� �����������");}
       }
		
		
	}
	
	
	
	
	}
	sc.close();
	sc2.close();
	
	
	
	}
			
	
	


	
	else {
		System.out.println("������� ������������ ������");
		System.out.println("������ ��������� ���������");
	 }
	
	

}

}
