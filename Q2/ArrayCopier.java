public class ArrayCopier {
	private int[] src;
	private int[] dst;
	public ArrayCopier(int[] src, int[] dst) {
		this.src=src;
		this.dst=dst;
	}
	public void copy(int[] src){
		this.src=src;
		
		if(src.length>dst.length){
			for (int i=0;i<dst.length;i++){
				dst[i]=src[i];
			}
		}else {
			for (int i=0;i<dst.length;i++){
				if(i>src.length-1){
					dst[i]=0;
				}else dst[i]=src[i];
				
			}
		}
	}	
}
