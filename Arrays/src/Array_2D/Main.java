package Array_2D;

public class Main {
	public static void main(String[] args) {
		int arr [][] = {{1,2,3},{4,5,6},{7,8,5}};
		shuffle(arr);
		}
	public static void shuffle(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");	
		}
	}
	

}
