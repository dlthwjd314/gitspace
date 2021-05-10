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

	int count = 0;

	public void checkCustom() {
		ArrayList<Customer> customList = new ArrayList<Customer>();

		System.out.println("����ȣ�� Ȯ���Ϸ��� ������ �Է��� �ּ���.");

		BufferedReader br = null;
		int i = 0;
		String put_name = sc.next();

		try {
			br = Files.newBufferedReader(Paths.get("./customers.csv"));
			br.readLine();
			String line = "";

			while ((line = br.readLine()) != null) {

				// List<String> tmpList = new ArrayList<String>();
				String array[] = line.split(",");

				// tmpList = Arrays.asList(array);

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

		System.out.println("*** ��ǰ ����Ʈ *** \n");

		try {
			br = Files.newBufferedReader(Paths.get("./Items.csv"));
			br.readLine(); // ������! ù�� �о� ����
			String line = "";

			while ((line = br.readLine()) != null) { // �ι� ° ����� ����

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
		if (inputList.size() != 0)
			inputList.clear();

		checkCustom();
		checkItem();

		System.out.println("\n����ȣ�� ��ǰ�ڵ�, ������ �Է��� �ּ���.");

		customer.setCustomNum(sc.nextInt());
		items.setItemCode(sc.nextInt());
		sd.setSujuCount(sc.nextInt());

		// String array[] = line.split(",");

		inputList.add(customer.getCustomNum());
		inputList.add(items.getItemCode());
		inputList.add(sd.getSujuCount());

		System.out.println(inputList);

		System.out.println("�ֹ��� ����Ͻðڽ��ϱ�?    (y/n)");
		if (sc.next().equals("y")) {
			registSuju();
		} else {
			inputList.clear();
			System.out.println("�ֹ��� ������� �ʾҽ��ϴ�.");
			return;
		}
	}

	public void registSuju() {
		suju.sujuRegist(count++, sd);

		HashMap jumunMap = new HashMap();

		jumunMap.put(suju.getSujuNum(), inputList);

		System.out.println("�ֹ���ȣ" + suju.getSujuNum() + "�� ��� �Ǿ����ϴ�.");

		Iterator<Integer> keys = jumunMap.keySet().iterator();
		while (keys.hasNext()) {
			int key = keys.next();
			System.out.println(String.format("Ű : %s, �� : %s", key, jumunMap.get(key)));
		}

	}

	public void cancelSuju() {

	}
}
