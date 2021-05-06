package UML;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class JumunUI {
	Scanner sc = new Scanner(System.in);
	
	public void checkInfo() {
		Customer customer = new Customer();
		ArrayList<Customer> customList = new ArrayList<Customer>();
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
				customer.setCustomNum(array[0]);
				customer.setCustomName(array[1]);
				customer.setCustomAddr(array[2]);
				customer.setCustomPhone(array[3]);
				
				customList.add(customer);
				
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
		
		for(int j = 0; j < customList.size(); j++) {
			if (!((Customer) customList.get(j)).getCustomName().equals(put_name)) {
				continue;
			} // if end
			System.out.println(((Customer) customList.get(j)).getCustomNum() + "\t\t| " + ((Customer) customList.get(j)).getCustomName()); 
		}
	}
	public void inputSuju() {
		
	}
	public void registSuju() {
		
	}
	public void cancelSuju() {
		
	}
}
