package review;

public class ArrayReturn {
	static int[] makeArray() {
		int temp[]=new int[4];
		for(int i=0;i<temp.length;i++)
			temp[i]=i;
		return temp;
	}
	static int[] makeArray2(int n) {
		int temp[]=new int[n];
		for(int i=0;i<temp.length;i++)
			temp[i]=i;
		return temp;
	}
	public static void main(String[] args) {
		int intArray[],a[],b[];
		intArray= makeArray();
		a=makeArray2(7);
		b=makeArray2(3);
		for(int i : intArray)
			System.out.print(i+" ");
		for(int i : a)
			System.out.print(i+" ");
		for(int i : b)
			System.out.print(i+" ");
	}

}
