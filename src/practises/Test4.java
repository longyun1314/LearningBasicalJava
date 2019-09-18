package practises;

/**
 * Title: Test4.java
 * Description: 
 * Author: li_qiaoyun
 * 2019-09-18
 */
public class Test4 {

	/**
	* Decription:
	* Author: li_qiaoyun
	* 2019-09-18
	* @see Test4
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Incrementable.increment();
      StaticTest test1 =new StaticTest();
      StaticTest test2 =new StaticTest();
      System.out.println(test1.i);
      System.out.println(test2.i);
	}

}
class StaticTest{
	static int i=47;
}
class Incrementable{
	static void increment() {
		StaticTest.i++;
	}
}
