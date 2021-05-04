package UML2;

import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		JumunUI ju = new JumunUI();
		System.out.println("1. 수주 입력 \t 2.수주 등록 \t 3.수주 취소 중에서 선택해 주세요." );
		switch(sc.nextInt()) {
		case 1:
			//상품 확인 
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
