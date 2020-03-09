package practises;

import java.util.Random;

/**
 * Title: TestRandom.java
 * Description: 
 * Author: li_qiaoyun
 * 2019-10-12
 */
public class TestRandom {

	/**
	* Decription:
	* Author: li_qiaoyun
	* 2019-10-12
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random(47);
		for(int i=0; i<10; i++) {
		    System.out.println(ran.nextDouble());
			// System.out.println(ran.nextInt(100)+1);
		}

	}

}
