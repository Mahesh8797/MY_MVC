package ArrayConcepts;

public class TwoDimenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{1,2,3},{4,5,6}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print( a[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("");
		String[][] arrStr = new String[3][4];
		for (int i = 0; i < arrStr.length; i++) {
			for (int j = 0; j < arrStr[i].length; j++) {
				arrStr[i][j] = "Str" + j;
				System.out.print(arrStr[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		int abc[][]=new int[3][4];
		abc[0][0]=4;
		abc[0][1]=4;
		abc[0][2]=6;
		abc[1][0]=7;
		for(int i=0;i<abc.length;i++)
		{
			for(int j=0;j<abc[i].length;j++)
			{
				System.out.print( abc[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
