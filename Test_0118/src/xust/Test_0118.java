package xust;

/*
 ����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ�������������������Ŀ��ֵ�������������У����������ᱻ��˳������λ�á�
����Լ������������ظ�Ԫ�ء�

ʾ�� 1:
����: [1,3,5,6], 5
���: 2

ʾ�� 2:
����: [1,3,5,6], 2
���: 1

ʾ�� 3:
����: [1,3,5,6], 7
���: 4

ʾ�� 4:
����: [1,3,5,6], 0
���: 0
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
����������һ���������У��������е�������˳����б������õ���һ��������ǰ�������£�
1.     1
2.     11
3.     21
4.     1211
5.     111221
1 ������  "one 1"  ("һ��һ") , �� 11��
11 ������ "two 1s" ("����һ"��, �� 21��
21 ������ "one 2",  "one 1" ��"һ����" ,  "һ��һ") , �� 1211��

����һ�������� n��1 �� n �� 30��������������еĵ� n �
ע�⣺����˳�򽫱�ʾΪһ���ַ�����
 
ʾ�� 1:
����: 1
���: "1"

ʾ�� 2:
����: 4
���: "1211"
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