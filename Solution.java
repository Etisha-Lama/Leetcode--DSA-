// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// public class Solution {



//     static int solveMeFirst(int a, int b) {
//         return a+b;
//       // Hint: Type return a+b; below
      
// 	}

//  public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int a;
//         a = in.nextInt();
//         int b;
//         b = in.nextInt();
//         int sum;
//         sum = solveMeFirst(a, b);
//         System.out.println(sum);
// 	}
// }

//------------------------------------------------REVERSE A LINKED LIST-----------------------------------------

// class Solution{
//     public ListNode reverseList(ListNode head){
//         return reverseSolve(head);
//     }

//     private ListNode reverseSolve(ListNode head){
//         if (head==null || head.next==null){
//             return head;
//         }
//         ListNode last=reverseSolve(head.next);
//         head.next.next=head;
//         head.next=last;
//         return last;
//     }
    
// }

// -----------------------------------------------------MERGE TWO LINKED LIST-----------------------------------

// class Solution{
//     public ListNode mergeTwoList(ListNode l1,ListNode l2){
//         if (l1==null){
//             return l2;
//         }
//         if (l2==null){
//             return l2;
//         }
//         ListNode result;
//         if (l1.val<l2.val){
//             result=l1;
//             result.next=mergeTwoList(l1.next, l2);
//         }
//         else{
//             result=l2;
//             result.next=mergeTwoList(l1, l2.next);
//         }
//         return result;
//     }
// }

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>CHECK SIMILAR LEAF>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

// import javax.swing.tree.TreeNode;

// class Solution{
//     public boolean LeafSimilar(TreeNode root1,TreeNode root2){
//         StringBuilder s1=new StringBuilder();
//         StringBuilder s2=new StringBuilder();

//         inorder(root1,s1);
//         inorder(root2,s2);

//         return (s1.toString().equals(s2.toString()));
//     }
//     private void inorder(TreeNode root, StringBuilder s){
//         if(root==null){
//             return;
//         }

//         if (root.left==null && root.right==null){
//             s.append(root.val).append("_");
//             return;
//         }
//         inorder(root.left, s);
//         inorder(root.right, s);
//     }

// }
// ----------------------------------------------ROMAN TO INTEGER-------------------------------------------------------------------------------

// import java.util.HashMap;
// import java.util.Map;

// class Solution{
//     public int romanToInt(String s){
//         Map <Character,Integer> map=new HashMap<>();
//         map.put('I',1);
//         map.put('V',5);
//         map.put('X',10);
//         map.put('L',50);
//         map.put('C',100);
//         map.put('D',500);
//         map.put('M',1000);

//         int result= map.get(s.charAt(s.length()-1));
//         for(int i=s.length()-2;i>=0;i--){
//             if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
//                 result-=map.get(s.charAt(i));
//             }
//             else{
//                 result+=map.get(s.charAt(i));
//             }
//         }
//         return result;
//     }
// }

// ------------------------------------------------Maximum difference BETWEEN NODE AND ANCESTOR----------------------------------------------------


// class Solution{
//     public int findMaxDiff(TreeNode root,int mini,int maxi){
//         if (root==null){
//             return Math.abs(mini-maxi);
//         }

//         mini=Math.min(root.val, mini);
//         maxi=Math.max(root.val.maxi);

//         int l=findMaxDiff(root.left, mini, maxi);
//         int r=findMaxDiff(root.right, mini, maxi);

//         return Math.max(l, r);
//     }

//     public int MaxAncestor(TreeNode root){
//         int mini=root.val;
//         int maxi=root.val;

//         return findMaxDiff(root, mini, maxi);
//     }
// }


// ----------------------------------------------------DETERMINE IF STRING HALVES ARE ALIKE-------------------------------------------------------

// class Solution{
//     public boolean isVowel(char ch){
//         return (ch=='a' || ch=='e' || ch=='1' || ch=='o' || ch=='u' || ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U');
//     }

//     public boolean halvesAreAlike(String s){
//         int n=s.length();

//         int mid=n/2;

//         int i=0,j=mid;

//         int countleft=0;
//         int countright=0;

//         while (i<n/2 && j<n) {

//             if(isVowel(s.charAt(i))) countleft++;

//             if (isVowel(s.charAt(i))) countright++;

//             i++;
    //         j++;
            
    //     }
    //     return countleft==countright;
    // }
// }

// --------------------------------------------------------------FIND PLAYERS WITH 0/1 LOSSES-----------------------------------------------------

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// class Solution{
//     public List<List<Integer>> findWinner(int[][] matches){
//         List<Integer> zeroLose=new ArrayList<>();
//         List<Integer> oneLose=new ArrayList<>();
//         Map<Integer,Integer> map=new HashMap<>();

//         for(int[] team:matches){
//             map.put(team[0], map.getOrDefault(team[0],0)+0);
//             map.put(team[1],map.getOrDefault(team[1], 1)+1);
//         }

//         for(int i:map.keySet()){
//             if(map.get(i)==0){
//                 zeroLose.add(i);
//             }

//             else if(map.get(i)==1){
//                 oneLose.add(i);
//             }

//         }

//         Collections.sort(zeroLose);
//         Collections.sort(oneLose);

//         return Arrays.asList(zeroLose,oneLose);
//     }
// }


// --------------------------------------------------INSERT DELETE GET RANDOM O(1)----------------------------------------------------------------
// class RandomizedSet {
//     HashMap<Integer,Integer> map;
//     List<Integer> list;
    
//     public RandomizedSet() {
//         list = new ArrayList<>();
//         map = new HashMap<>();  
//     }
    
//     public boolean insert(int val) {
//         if(map.containsKey(val)) return false;
//         list.add(val);
//         map.put(val, list.size()-1);
//         return true;
//     }
//         public boolean remove(int val) {
//         if(map.containsKey(val) == false)
//             return false;
//         int ind=map.get(val);
//         Collections.swap(list,ind,list.size()-1);
//         int swappedWith=list.get(ind);
//         map.put(swappedWith,ind);
//         list.remove(list.size()-1);
//         map.remove(val);
//         return true;
//     }
    
//     /** Get a random element from the set. */
//     public int getRandom() {
//         Random random=new Random();
//         int n=random.nextInt(list.size());
//         return list.get(n);

//     }
// }