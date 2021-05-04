package UML;

import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class JumunUI implements Suju {
	Scanner sc = new Scanner(System.in);
	ArrayList<Customer> customer = new ArrayList<Customer>();
	public void checkInfo() {
		System.out.println("고객번호를 확인하려면 성명을 입력해 주세요.");
		
		
		BufferedReader br = null;
		int i = 0;
		String put_name = sc.next();

		try {
			br = Files.newBufferedReader(Paths.get("./customers.csv"));
			String line = "";

			while ((line = br.readLine()) != null) {
				
				List<String> tmpList = new ArrayList<String>();
				String array[] = line.split(",");
				
				tmpList = Arrays.asList(array);
				customer.add(new Customer(array[1], array[2], array[3]));
				
				i++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		for(int j = 0; j < customer.size(); j++) {
			if (!((Customer) customer.get(j)).getCustomName().equals(put_name)) {
				continue;
			} // if end
			System.out.println(((Customer) customer.get(j)).getCustomName() + "\t\t| " + ((Customer) customer.get(j)).getCustomCode()); 
		}
	}
	public void Regist(int sujuCode){
		sujuCode++;
	}

	public void getSujuDate(String sujuDate) {
		
	}

	
}
