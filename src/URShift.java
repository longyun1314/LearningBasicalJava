public class URShift {
  public static void main(String[] args) {
    int i = -1;
    print(Integer.toBinaryString(i));
    i >>>= 10;// 无符号右移位操作符 向右移动 高位补0,前10位为0
    print(Integer.toBinaryString(i));
   
    long l = -1;// 无符号右移位操作符 向右移动 高位补0
    print(Long.toBinaryString(l));
    l >>>= 10;
    print(Long.toBinaryString(l));
    
    short s = -1;
    print(Integer.toBinaryString(s));// 转为int 由于为负数，高位补1
    s >>>= 10;// 移位前转为int， 高位补1， 然后向右无符号移动10位，高位补0， 再转为short，取低位进行截取还是-1
    print(Integer.toBinaryString(s));
    byte b = -1;
    print(Integer.toBinaryString(b));
    b >>>= 10;// 移位前转为int， 高位补1， 然后向右无符号移动10位，高位补0， 再转为short，取低位进行截取还是-1
    print(Integer.toBinaryString(b));
    b = -1;
    print(Integer.toBinaryString(b));
    
 // 移位前转为int， 高位补1， 然后向右无符号移动10位，高位补0
    print(Integer.toBinaryString(b>>>10));
    print(Integer.toString(b>>>10));
  }

/**b
* Decription:
* Author: li_qiaoyun
* 2019-09-23
*/
private static void print(String binaryString) {
    System.out.println(binaryString);
}
} /* Output:
11111111111111111111111111111111
1111111111111111111111
1111111111111111111111111111111111111111111111111111111111111111
111111111111111111111111111111111111111111111111111111
11111111111111111111111111111111
11111111111111111111111111111111
11111111111111111111111111111111
11111111111111111111111111111111
11111111111111111111111111111111
1111111111111111111111
*///:~
