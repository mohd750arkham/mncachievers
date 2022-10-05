package level2;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 10;//by default variables store only one value
		
		//arrays
		int[] nums= {10,20,30,40};//this is a single dimensional array of size 4 - one row 4 columns
		
		//how to read an array
		
		System.out.println(nums[3]);//this will return the value at index 3
		
		System.out.println(nums.length);//this will return the size of array
		
		//how to assign a value in a array
		
		System.out.println(nums[1]);
		nums[1]=100;
		
		System.out.println(nums[1]);
		
		for(int i=0;i<nums.length;i++) {//this for loop was there from jdk1 to jdk4
			System.out.println(nums[i]);
		}
		//jdk 5 - new for loop - also called as enhanced for loop
		for(int i:nums) {//this enhanced for loop is only for arrays and list collections
			System.out.println(i);
		}
	}
}
	