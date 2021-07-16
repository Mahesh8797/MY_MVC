package OOPSConcepts;

class Cat
{
	
}
class Dog
{
	
}
public class InstanceOF extends Cat{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog d=new Dog();
Cat c=new Cat();
InstanceOF io= new InstanceOF();
Cat cd=io;
InstanceOF ab=(InstanceOF)cd;

boolean flag;
flag= d instanceof Dog;
System.out.println(flag);
flag = c instanceof Cat;
System.out.println(flag);
flag= ab instanceof Cat;
System.out.println(flag);
//flag= ab instanceof Dog; 
System.out.println(flag);



	}

}
