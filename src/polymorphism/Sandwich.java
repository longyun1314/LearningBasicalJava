//: polymorphism/Sandwich.java
// Order of constructor calls.

import static net.mindview.util.Print.*;

class Meal {
  Meal() { print("Meal()"); }
}

class Bread {
  Bread() { print("Bread()"); }
}

class Cheese {
  Cheese() { print("Cheese()"); }
}

class Lettuce {
  Lettuce() { print("Lettuce()"); }
}

class Lunch extends Meal {
  Lunch() { print("Lunch()"); }
}

class PortableLunch extends Lunch {
  PortableLunch() { print("PortableLunch()");}
}

public class Sandwich extends PortableLunch {
  private static Bread b = new Bread();
  private Cheese c = new Cheese();
  private Lettuce l = new Lettuce();
  public Sandwich() { print("Sandwich()"); }
  public static void main(String[] args) {
    new Sandwich();
  }
} /* Output:
Bread()
Meal()
Lunch()
PortableLunch()
Cheese()
Lettuce()
Sandwich()
*///:~
/*有静态域执行静态域->main方法(实例化对象)->有父类则找到最初的基类，初始化基类成员变量，调用基类构造器->初始化调用成员的初始化方法->调用导出类构造器主体
备注：实例化对象时先递归找到最初的基类，初始化基类成员变量，执行基类构造器，最后初始化导出类变量和构造器
*/
