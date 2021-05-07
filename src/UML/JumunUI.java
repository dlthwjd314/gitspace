package UML;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class JumunUI {
	Suju suju = new Suju();
	Scanner sc = new Scanner(System.in);

	Customer customer = new Customer();
	Items items = new Items();
	SujuDetail sd = new SujuDetail();
	ArrayList inputList = new ArrayList();
	ArrayList jumunList = new ArrayList();

	public void checkCustom() {
		ArrayList<Customer> customList = new ArrayList<Customer>();

		System.out.println("고객번호를 확인하려면 성명을 입력해 주세요.");

		BufferedReader br = null;
		int i = 0;
		String put_name = sc.next();
		
		try {
			br = Files.newBufferedReader(Paths.get("./customers.csv"));
			br.readLine();
			String line = "";

			while ((line = br.readLine()) != null) {

				//List<String> tmpList = new ArrayList<String>();
				String array[] = line.split(",");

				//tmpList = Arrays.asList(array);

				customer.setCustomNum(Integer.parseInt(array[0]));
				customer.setCustomName(array[1]);
				customer.setCustomAddr(array[2]);
				customer.setCustomPhone(array[3]);

				customList.add(customer);

				if (!((Customer) customList.get(i)).getCustomName().equals(put_name)) {
					continue;
				} // if end
				System.out.println(((Customer) customList.get(i)).getCustomNum() + "\t\t| "
						+ ((Customer) customList.get(i)).getCustomName() + "\n");

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
		} // while end

	}

	public void checkItem() {

		ArrayList<Items> itemList = new ArrayList<Items>();

		BufferedReader br = null;

		System.out.println("*** 상품 리스트 *** \n");

		try {
			br = Files.newBufferedReader(Paths.get("./Items.csv"));
			br.readLine(); // ㅇㅅㅇ! 첫행 읽어 버림
			String line = "";

			while ((line = br.readLine()) != null) { //두번 째 행부터 읽음


				String array[] = line.split(",");

				items.setItemCode(Integer.parseInt(array[0]));
				items.setItemName(array[1]);
				items.setPrice(Integer.parseInt(array[2]));

				itemList.add(items);

				System.out.println(items.toString());

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
		} // while end
	}

	public void inputSuju() {
		checkCustom();
		checkItem();

		System.out.println("\n고객번호와 상품코드, 수량을 입력해 주세요.");

		customer.setCustomNum(sc.nextInt());
		items.setItemCode(sc.nextInt());
		sd.setSujuCount(sc.nextInt());
		
		//String array[] = line.split(",");
		List tmplist = new ArrayList();
		
		tmplist.add(customer.getCustomNum());
		tmplist.add(items.getItemCode());
		tmplist.add(sd.getSujuCount());
		
		inputList.add(tmplist);

		System.out.println(inputList);

		System.out.println("주문을 등록하시겠습니까?    (y/n)");
		if (sc.next().equals("y"))
			registSuju();
		else
			System.out.println("주문을 등록하지 않았습니다.");
		return;
	}

	public void registSuju() {
		
		List tmplist = new ArrayList();
		tmplist.add(e)

		System.out.println("주문번호" + suju.getSujuNum() + "가 등록 되었습니다.");
		System.out.println(jumunList);

	}

	public void cancelSuju() {
		for (int i = 0; i < jumunList.size(); i++) {
			if ( ((Customer)inputList.get(i)).getCustomNum() == sc.nextInt()) {
				jumunList.remove(i);
			}
		}
	}
}
