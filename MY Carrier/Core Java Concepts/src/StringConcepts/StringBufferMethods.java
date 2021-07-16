package StringConcepts;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sub=new StringBuffer("Maheshwari");
StringBuilder str=new StringBuilder();
int capa=str.capacity();
System.out.println("The capacity of string is "+capa);
int capacity=sub.capacity();
//the capacity of empty string is 16 so another string comes it starts counting from 16 so here we have 10 letters so 26
System.out.println("The capacity of string is "+capacity);
sub.append(" Y");
System.out.println("The capacity of string is "+capacity);
System.out.println(sub);
sub.insert(2, 'H');
System.out.println(sub);
sub.replace(2, 4, "yogesh"); //here start index is inclusive and end is exclusive
System.out.println(sub); 
sub.delete(0, 2);        //here start index is inclusive and end is exclusive
System.out.println(sub); 
sub.reverse();
System.out.println(sub); 
System.out.println("The capacity of string is "+capacity); 


	}
	

}
