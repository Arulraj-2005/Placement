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
// class Duplicate{

//     public static String fun(String str){
//     Stack st = new Stack();
//     for(int i=0;i<str.length();i++){
//         char c = str.charAt(i);
//         String s = Character.toString(c);
//         if(!s.equals("]")){
//             st.push(s);
//         }
//         else{
//             StringBuilder sb = new StringBuilder();
//             while(!st.isEmpty() && !st.peek().equals("[")){
//                 sb.insert(0, st.peek());
//                 st.pop();
//             }
//             st.pop(); // remove [
//             String numstr = "";
//             while(!st.isEmpty() && Character.isDigit(st.peek().charAt(0))){
//                 numstr = st.peek() + numstr;
//                 st.pop();
//             }
//             int num = Integer.parseInt(numstr);
//             for(int j=0;j<num;j++){
//                 st.push(sb.toString());
//             }
//         }
//     }
//     StringBuilder res = new StringBuilder();

//     while(!st.isEmpty()){
//         res.insert(0, st.peek());
//         st.pop();
//     }

//     return res.toString();
// }
//     public static void main(String[] args) {
    
//         Scanner sc=new Scanner(System.in);
//         String str=sc.nextLine();
//         System.out.println(fun(str));
        

        
//     }
// }