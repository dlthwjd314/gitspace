package UML;

import java.util.*;

public class Suju {
	private int sujuNum;
	private Date sujuDate = new Date();
	private SujuDetail sd;
	
	public void sujuRegist(int sujuNum,SujuDetail sd) {
		this.sujuNum=sujuNum++;
		this.sd = sd;
	}
	public int getSujuNum() {
		return sujuNum;
	}
	public void setSujuNum(int sujuNum) {
		this.sujuNum = sujuNum;
	}
	public void getSujuDate(Date sujuDate) {
		System.out.println(sujuDate);
	}

	
}
