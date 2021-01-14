package Main;


import java.awt.GridLayout;

import View.tp04ex1;

public class Main {

	public static void main(String[] args) {
		
		tp04ex1 f1 = new tp04ex1("TP04 - LPII", 600, 300, 100, 100);

		f1.setLayout(new GridLayout(4,2));
		f1.setVisible(true);
		
		
	}

}
