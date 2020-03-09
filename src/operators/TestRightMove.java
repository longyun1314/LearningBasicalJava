package practises;

/**
 * Title: TestRightMove.java
 * Description: 
 * Author: li_qiaoyun
 * 2019-10-12
 */
public class TestRightMove {

	/**
	* Decription:
	* Author: li_qiaoyun
	* 2019-10-12
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short s = -1;
		System.out.println(Integer.toBinaryString(s));// 转为int 由于为负数，高位补1
	    s >>>= 10;// 移位前转为int， 高位补1， 然后向右无符号移动10位，高位补0， 再转为short，取低位进行截取还是-1
	    System.out.println(s);
	    System.out.println(Integer.toBinaryString(s));
	}
	private static void print(String binaryString) {
	    System.out.println(binaryString);
	}

}
