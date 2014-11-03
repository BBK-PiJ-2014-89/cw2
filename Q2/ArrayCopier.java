import java.lang.reflect.Array;


public class ArrayCopier {
	private int[] src;
	private int[] dst=new int[10];
	public ArrayCopier(int[] src) {
		this.src=src;
	}
	public void copy(int[] src){
		this.src=src;
		this.dst=dst;
		
		if(dst.length>src.length){
			for (int i=0;i<src.length;i++){
				dst[i]=src[i];
			}
		}else {
			for (int i=0;i<dst.length;i++){
				dst[i]=src[i];
			}
		}
	}
	
	public int[] getDst(){
		return dst;
		
	}
	
}
