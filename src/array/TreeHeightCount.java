//to find out howm manybtrees are visible to you in you have all tress in one line but diff in height
package array;

public class TreeHeightCount {

	int getTreeCount(int[] input) {
		int count=1;
		int treeHeight=0;
		int initialHeight=3;
		for(int index=1; index<input.length; index++) {
			if(input[index]>initialHeight && input[index]>treeHeight) {
				count++;
				treeHeight=input[index];
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		TreeHeightCount thc= new TreeHeightCount();
		//int[] arr= {3,4,4,7,5,6,99};
		int[] arr= {3,5,9,13};
		System.out.println("Total visible tree= "+thc.getTreeCount(arr));
	}
}
