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
			System.out.println("1.���� �Է� \t 2.���� ��� \t 3.���� ��� �߿��� ������.");
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

	}
}
