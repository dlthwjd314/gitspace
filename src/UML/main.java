package UML;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JumunUI ju = new JumunUI();
		while (true) {
			System.out.println("1.수주 입력 \t 2.수주 등록 \t 3.수주 취소 중에서 고르세요.");
			switch (sc.nextInt()) {
			case 1:
				ju.inputSuju();
				break;
			case 2:
				ju.registSuju();
				break;
			case 3:
				ju.cancelSuju();
				break;
			}
		}

//		System.out.println("*** 상품 리스트 *** \n");
//		for (int j = 0; j < itemList.size(); j++) {
//			System.out.println(((Items) itemList.get(j)).getItemCode() + "\t\t| "
//					+ ((Items) itemList.get(j)).getItemName() + "\t\t| "
//					+ ((Items) itemList.get(j)).getPrice());
//		} // for end
	}
}
