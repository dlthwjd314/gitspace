package UML2;

import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		JumunUI ju = new JumunUI();
		System.out.println("1. ���� �Է� \t 2.���� ��� \t 3.���� ��� �߿��� ������ �ּ���." );
		switch(sc.nextInt()) {
		case 1:
			//��ǰ Ȯ�� 
			ju.inputSuju();
			break;
		case 2:
			ju.registSuju();
			break;
		case 3:
			ju.cancleSuju();
			break;
		case 4:
			break;
		}
	}
}
