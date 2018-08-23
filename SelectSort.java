package sort;
/**
 *
 * @author  LiJing 
 * @date    2017年9月7日 上午10:26:28
 * @Version 1.0
 *
 */
public class SelectSort {
	/**
	 * 
	 * @Title: main
	 * @Description: 
	 * @param: @param args   
	 * @return: void   
	 * @throws
	 */
	public static void main(String[] args) {
		int[] arr={7,6,5,4,3,2,1,1,0,7,6,5,8,2,1,4};
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[temp]){
					temp=j;
				}
			}
			int a=0;
			a=arr[i];
			arr[i]=arr[temp];
			arr[temp]=a;
			temp=i+1;
		}
		for(int p:arr){
			System.out.println(p+"  ");
		}
	}

}
