package UML2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Suju {
	private int sujuNum;
	private Date sujuDate = new Date();
	private SujuDetail sd;

	public void sujuRegist(int sujuNum, SujuDetail sd) {
		this.sd = sd;
		this.sujuNum = sujuNum;

	}
//	public void getSujuDate(Date sujuDate) {
//		System.out.println(sujuDate);
//	}

	public int getSujuNum() {
		return sujuNum;
	}

	public Date getSujuDate() {
		return sujuDate;
	}

	public SujuDetail getSd() {
		return sd;
	}

	public void setSujuNum(int sujuNum) {
		this.sujuNum = sujuNum;
	}

	public void setSujuDate(Date sujuDate) {
		this.sujuDate = sujuDate;
	}

	public void setSd(SujuDetail sd) {
		this.sd = sd;
	}

}

class getCustomers {
	Scanner sc = new Scanner(System.in);
	ArrayList<Customer> customList = new ArrayList<Customer>();
	HashMap<String,Customer> customMap = new HashMap<String, Customer>();
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
				customList.add(new Customer(array[1], array[2], array[3]));

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
		customMap.put(String array[0], ArrayList costomList);

//		for (int j = 0; j < customList.size(); j++) {
//			if (!((Customer) customList.get(j)).getCustomName().equals(put_name)) {
//				continue;
//			} // if end
//			System.out.println(((Customer) customList.get(j)).getCustomName() + "\t\t| "
//					+ ((Customer) customList.get(j)).getCustomNum());
//		}
	}

}
