package UML;

import java.io.IOException;
import java.util.Scanner;

public class main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		JumunUI ui = new JumunUI();
		while (true) {
			System.out.println("1. ����ȣ Ȯ�� 2.�������� �Է� 3.���� ��� 4.���� ��� �߿��� ���ÿ�.");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				 ui.checkInfo();
				break;
			case 2:
//				ui.Regist(sujuCode, itemCode, itemCount);
				break;
			case 5:
				System.out.println("��ǰ ������� ��ȣ�� �Է����ּ���.");

				System.out.println("��ǰ ���");
				
				
			}
		}
	}
}
