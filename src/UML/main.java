package UML;

import java.io.IOException;
import java.util.Scanner;

public class main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		JumunUI ui = new JumunUI();
		while (true) {
			System.out.println("1. 고객번호 확인 2.수주정보 입력 3.수주 등록 4.수주 취소 중에서 고르시오.");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				 ui.checkInfo();
				break;
			case 2:
//				ui.Regist(sujuCode, itemCode, itemCount);
				break;
			case 5:
				System.out.println("상품 등록자의 번호를 입력해주세요.");

				System.out.println("상품 등록");
				
				
			}
		}
	}
}
