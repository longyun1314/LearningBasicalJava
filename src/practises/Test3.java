package practises;

/**
 * Title: Test3.java
 * Description: 
 * Author: li_qiaoyun
 * 2019-09-18
 */
public class Test3 {

	
	public static void main(String[] args) {
		ATypeName name =new ATypeName();
		System.out.println(name.i);
		System.out.println(name.storage("test"));
	}

}
class ATypeName{
	int i;
	int storage(String s) {
	return s.length()*2;
	}
}
