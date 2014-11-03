
public class Q2_main {

	public static void main(String[] args) {
		int[] dst =new int[10];
		int[] src1={1,6,5,45,4,8,7,2,3,4};
		int[] src2={1,6,5,45,4,8,7};
		int[] src3={1,6,5,45,4,8,7,2,4,5,58,4,8,5,5,2,5,4};
		ArrayCopier arr1=new ArrayCopier(src1,dst);
		ArrayCopier arr2=new ArrayCopier(src2,dst);
		ArrayCopier arr3=new ArrayCopier(src3,dst);
		arr1.copy(src1);
		printArray(src1,dst);
		arr2.copy(src2);
		printArray(src2,dst);
		arr3.copy(src3);
		printArray(src3,dst);
		
	}
	static void printArray(int[] src, int[] dst){
		System.out.print("src: ");
		for (int i=0;i<src.length;i++){
			System.out.print(src[i]+" ");
		}
		System.out.println();
		System.out.print("dst: ");
		for (int i=0;i<dst.length;i++){
			System.out.print(dst[i]+" ");
		}
		System.out.println("\n");
	}

}
