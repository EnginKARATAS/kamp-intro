package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String msg = "�nternet �ubeye gir";
		double dolarDun = 8.6;
		double dolarBugun = 8.6;
		int vade = 36;
 		System.out.println(msg);
		if (dolarBugun < dolarDun ) {
			System.out.println("Dolar Dustu");
		}
		else if (dolarBugun > dolarDun) {
			System.out.println("dolar yukseldi");
		}
		else {
			System.out.println("de�erler e�it");
		}
		System.out.println("-----------");
		 
 		String[] krediler = {
				"konut kredisi", 
				"yat�r�m kredisi",
				"ciic 	 i kredisi",
				"msb kredi",
				"meg  k redi",
				"k�lt�r bakanl��� kredisi"
		};
 		for(String kredici :krediler) {
 			System.out.println(kredici);
 		}
		
	}

}
	