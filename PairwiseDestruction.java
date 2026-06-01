// import java.util.*;
// // class Node{
// //     String data;
// //     Node next;
// //     Node(String data){
// //         this.data = data;
// //         this.next = null;
// //     }
// // }
// class Stack{
//     Node top=null;
//     int count=0;
//     public void push(String data){
//         Node newNode = new Node(data);
//         newNode.next = top;
//         top = newNode;
//         count++;
//     }
//     public void pop(){
//         if(top != null){
//             top = top.next;
//             count--;
//         }
//     }
//     public String peek(){
//         if(top != null){
//             return top.data;
//         }
//         return null;
//     }
//     public boolean isEmpty(){
//         return top == null;
//     }
//     public  int size(){
//         return count;
//     }
// }
// public class PairwiseDestruction{

//     public static int pairwise(String[] arr){
//         Stack stack = new Stack();
        
//         for(String s: arr){
//             if(!stack.isEmpty() && stack.peek().equals(s)){
//                 stack.pop();
//             } else {
//                 stack.push(s);
//             }
//         }
//         return stack.size();
//     }
//     public static void main(String[] args) {
//         // String[] arr = {"gfg","for","greeks","greeks","for"};
//         Scanner sc=new Scanner(System.in);
//         String str=sc.nextLine();
//         String[] arr = str.split(" ");
//         int result = pairwise(arr);
//         System.out.println(result);
//     }
// }
