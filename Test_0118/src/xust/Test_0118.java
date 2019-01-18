package xust;

/*
 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
你可以假设数组中无重复元素。

示例 1:
输入: [1,3,5,6], 5
输出: 2

示例 2:
输入: [1,3,5,6], 2
输出: 1

示例 3:
输入: [1,3,5,6], 7
输出: 4

示例 4:
输入: [1,3,5,6], 0
输出: 0
 */

//public class Test_0118 {
//	public static void main(String[] args) {
//		Solution So =new Solution();
//		int[] nums={1,3,5,6};
//		int target=5;
//		System.out.println(So.searchInsert(nums, target));
//	}
//}
//
//class Solution {
//    public int searchInsert(int[] nums, int target) {
//        int j=0;
//        while(j<nums.length &&nums[j] < target){
//        	j++;
//        } 
//        return j;
//    }
//}
/*
报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
1.     1
2.     11
3.     21
4.     1211
5.     111221
1 被读作  "one 1"  ("一个一") , 即 11。
11 被读作 "two 1s" ("两个一"）, 即 21。
21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。

给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
注意：整数顺序将表示为一个字符串。
 
示例 1:
输入: 1
输出: "1"

示例 2:
输入: 4
输出: "1211"
 */
public class Test_0118 {
	public static void main(String[] args) {
		Solution So = new Solution();
		System.out.println(So.countAndSay(4));
	}
}

class Solution {
    public String countAndSay(int n) {
    	if(n==0){
    		return "false";
    	}
    	if(n==1){
    		return "1";
    	}
    	String ret="1";
    	String ret_next="";
        for(int i=2; i<=n; i++){
        	int j=0;
        	if(i>2){
        		ret=ret_next;
        		ret_next="";
        	}
        	while(j<ret.length()){
        		int count=0;
        		int temp = ret.charAt(j);
        		while(temp == ret.charAt(j) && j<ret.length()){
        			count++;
        			j++;
        		}
        		ret_next=ret_next+(count+"")+String.valueOf(temp);
        		j++;
        	}
        }
        return ret_next;
    }
}