package UML;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class JumunUI {
	Scanner sc = new Scanner(System.in);

	Customer customer = new Customer();
	Items items = new Items();
	Suju suju = new Suju();
	SujuDetail sd = new SujuDetail();
	
	ArrayList inputList = new ArrayList();
	ArrayList jumunList = new ArrayList();
	
	HashMap jumunMap = new HashMap();

	int count = 0;

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

				String array[] = line.split(",");

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
			br.readLine(); //첫행 읽어버림
			String line = "";

			while ((line = br.readLine()) != null) { // 두번 째 행부터 읽음

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

		ArrayList tmpList = new ArrayList();
		
		customer.setCustomNum(sc.nextInt());
		items.setItemCode(sc.nextInt());
		sd.setSujuCount(sc.nextInt());


		tmpList.add(customer.getCustomNum());
		tmpList.add(items.getItemCode());
		tmpList.add(sd.getSujuCount());
		
		inputList.add(tmpList);
		System.out.println(inputList);

		System.out.println("주문을 등록하시겠습니까?    (y/n)");
		if (sc.next().equals("y")) {
			registSuju();
		} else {
			inputList.remove(count);
			System.out.println("주문을 등록하지 않았습니다.");
			return;
		}
	}

	public void registSuju() {
		suju.sujuRegist(count++, sd);

		jumunMap.put(suju.getSujuNum(), inputList.get(count-1));

		System.out.println("주문번호" + suju.getSujuNum() + "가 등록 되었습니다.");

		Iterator<Integer> keys = jumunMap.keySet().iterator();
		while (keys.hasNext()) {
			int key = keys.next();
			System.out.println(String.format("주문번호 : %s, 값 : %s", key, jumunMap.get(key)));
		}
		System.out.println(jumunMap.size());
	}

	public void cancelSuju() {
	System.out.println("취소 하고 싶은 주문의 주문번호를 입력해 주세요.");
	int jumunNum = sc.nextInt();
	System.out.println("정말로 삭제하시겠습니까? (y/n)");
	if(sc.next().equals("y")) {
		jumunMap.remove(jumunNum);
		System.out.println("주문번호"+jumunNum+"이 취소 되었습니다.");
	}
	
	}
}
