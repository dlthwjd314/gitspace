package UML;

import java.time.LocalDate;

public interface Suju {
	int sujuCode = 0;
	LocalDate sujuDate = LocalDate.now();
	
	void Regist(int sujuCode);
	void getSujuDate(String sujuDate);
	
}
