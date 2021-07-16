package ArrayConcepts;

import java.util.Arrays;

public class AddElementstoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj1[]={1,2,3};
		Object obj2[]={4,5,6};
		System.out.println(Arrays.toString(obj1));
		Object obj3[]=add(obj1,"5");
		System.out.println(Arrays.toString(obj3));
		Object obj4[]=add(obj2,obj3);
		System.out.println(Arrays.toString(obj4));
	}

	private static Object[] add(Object[] arr, Object...elements)
	{
		Object tempArr[]=new Object[arr.length+elements.length];
		System.arraycopy(arr, 0, tempArr, 0, arr.length);
				
		for(int i=0;i<elements.length;i++)
		
			tempArr[arr.length+i]=elements[i];
			return tempArr;
				
	}
}
