package my;

/**
 * Title: AnimalTest.java
 * Description: 多态测试
 * Author: li_qiaoyun
 * 2019-09-08
 */
public class AnimalTest {

	/**
	* Decription:
	* Author: li_qiaoyun
	* 2019-09-08
	*/ 
	public static void main(String[] args) {
		//step1 实例化cat对象 
		Cat cat = new Cat();
		// step2 实例化Dog对象
		Dog dog =new Dog();
		show(cat);
		show(dog);
		
		

	}
	/**
	 * 
	* Decription:向上转型 运行时才知道被调用的代码
	* Author: li_qiaoyun
	* 2019-09-08
	 */
	public static void show(Animal animal) {
		animal.eat();
		// 继承类没有work方式，直接调animal.work()时，在编译时会报错
		if(animal instanceof Dog) {
			Dog dog =(Dog) animal;
			dog.work();
		} else if(animal instanceof Cat) {
			Cat cat =(Cat) animal;
			cat.work();
		}
	}
}
	abstract class Animal {
		void eat() {
			
		}
	}
	class Cat extends Animal{
		public void eat() {
		 System.out.println("猫吃鱼");
		}
		public void work() {
			System.out.println("猫抓老鼠");
		}
	}
	class Dog extends Animal{
		public void eat() {
			System.out.println("狗啃骨头");
		}
		public void work() {
			System.out.println("狗咬人");
		}
	}
