// import java.util.Arrays;
// import java.util.HashMap;

// class Solution {
//     public static int[] twoSum(int[] nums, int target) {
//         HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

//         for (int i = 0; i < nums.length; i++) {  // Corrected loop condition
//             int required_num = target - nums[i];
//             if (hm.containsKey(required_num)) {
//                 int[] arr = { hm.get(required_num), i };
//                 return arr;
//             }
//             hm.put(nums[i], i);
//         }
//         return null;
//     }

//     public static void main(String[] args) {
//         int[] nums = { 2, 7, 11, 15 };
//         System.out.println(Arrays.toString(twoSum(nums, 9)));
//     }
// }


// class Solution{
//     public ListNode addtwoNo(ListNode l1, ListNode l2){
//         ListNode temp=new ListNode();
//         ListNode head=temp;
//         int carry=0;

//         while (l1!=null || l2!=null){
//             if (l1!=null){
//                 carry+=l1.val;
//                 l1=l1.next;
//             }
//             if (l2!=null){
//                 carry+=l2.val;
//                 l2=l2.next;
//             }

//             temp.next=new ListNode(carry%10);
//             temp=temp.next;
//             carry=carry/10;
//         }
//         if (carry==1){
//             temp.next=new ListNode(1);
//         }

//         return head.next;
//     }
// }

// class twoSum{
//     public int minOperation(int[] nums){
//         int n=nums.length;
//         HashMap <Integer,Integer> hm=new HashMap<>();

//         for (int i=0;i<n;i++){
//             hm.put(nums[i],hm.getOrDefault(nums[i], 0)+1);
//         }
//         int result=0;
//         for(HashMap.Entry<Integer.Integer> entry:hm.entrySet()){
//             if (freq==1){
//                 return -1;
//             }
//             result += Math.ceil((double)freq/3);
//         }
//         return result;
//     }
// }