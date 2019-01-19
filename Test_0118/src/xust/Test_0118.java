package xust;

/**
 * date：2019/01/18
 * author:BetterMe1
 * program:leetcode:
 * compiler:jdk1.7.0_51
 */

/*
1.报数
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
/*
 * 先说一下对此题的理解:
 * 报数数列第一行默认是1，这里我是理解为第二行根据第一行的顺序，用数字阐述第一行，
 * 第一行有1个1，则第二行为11，
 * 以此类推，下一行都为上一行的阐述，
 * 第二行有2个1，则第三行为21，
 * 第三行有1个2,1个1，则第四行为1211
 * 第四行有1个1,1个2,2个1，第五行就为111221
 * 算法思想：
 * 先判断传入行数n的大小，超出范围1 ≤ n ≤ 30则返回false,n==1时返回"1",下面再利用循环，根据第一行计算下一行，循环n次，则计算到第n行，具体计算过程请看代码
 */
//public class Test_0118 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		//测试
//		for(int i=1; i<6;i++){
//			System.out.println(i+":   "+So.countAndSay(i));
//		}
//	}
//}
//
//class Solution {
//    public String countAndSay(int n) {
//    	if(n<1 || n>30){
//    		return "false";
//    	}
//    	if(n==1){
//    		return "1";
//    	}
//    	String ret="1";//本行的字符串
//    	String ret_next="";//下一行的字符串
//        for(int i=2; i<=n; i++){//n行，循环n次
//        	int j=0;
//        	if(i>2){
//        		ret=ret_next;
//        		ret_next="";
//        	}
//        	while(j<ret.length()){
//        		int count=0;//计数器计算上一行每位数字的个数
//        		char temp = ret.charAt(j);//临时变量存储要计算的这一位
//        		while(j<ret.length() && temp == ret.charAt(j) ){//相同时计数
//        			count++;
//        			j++;
//        		}
//        		ret_next=ret_next+(count+"")+String.valueOf(temp);//写入计算的结果
//        	}
//        }
//        return ret_next;
//    }
//}

/*
2.搜索插入位置
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

/*
 * 算法思想：
 * 由于数组是有序数组，因此只需要利用循环将目标值挨个与数组元素比较，如果数组元素小于目标值，说明还没有找到目标值或者插入位置还不确定，若数组元素不小于目标值，则此元素等于或大于目标值，等于则找到，大于则插入，因此只需要返回此时的下标即可。
 */
public class Test_0118 {
	public static void main(String[] args) {
		Solution So =new Solution();
		int[] nums={1,3,5,6};
		int target=5;
		System.out.println(So.searchInsert(nums, target));
	}
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int j=0;
        while(j<nums.length &&nums[j] < target){
        	j++;
        } 
        return j;
    }
}
