public class URShift {
  public static void main(String[] args) {
    short s = -1;
    System.out.println(s);
    // 转为int 由于为负数，高位补1
    print(Integer.toBinaryString(s));
    // 移位前转为int， 高位补1， 然后向右无符号移动10位，高位补0， 再转为short，取低位进行截取还是-1
    s >>>= 10;
    print(Integer.toBinaryString(s));
    byte b = -1;
    print(Integer.toBinaryString(b));
    // 移位前转为int， 高位补1， 然后向右无符号移动10位，高位补0， 再转为short，取低位进行截取还是-1
    b >>>= 10;
    print(Integer.toBinaryString(b));
    b = -1;
    print(Integer.toBinaryString(b));
    
 // 移位前转为int， 高位补1， 然后向右无符号移动10位，高位补0,不再转换为byte
    print(Integer.toBinaryString(b>>>10));
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
/** 对char byte short类型的值进行移位处理，在移位之前，会先转换为int类型，得到的结果也是int类型
 * >>= 、<<= 、>>>= 移位复制操作时，得到的值可能不准确，因为会先转换为int类型，在右移操作，然后被截断，赋给原来的类型
 */
