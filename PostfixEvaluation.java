// import java.util.*;

// // class Node {
// //     int data;
// //     Node next;

// //     Node(int data) {
// //         this.data = data;
// //         this.next = null;
// //     }
// // }

// class stack {
//     Node top = null;

//     public void push(int data) {
//         Node newNode = new Node(data);
//         newNode.next = top;
//         top = newNode;
//     }

//     public int pop() {
//         if (top == null) {
//             System.out.println("Stack Underflow");
//             return -1;
//         }

//         int popped = top.data;
//         top = top.next;
//         return popped;
//     }

//     public int peek() {
//         if (top == null) {
//             System.out.println("Stack is Empty");
//             return -1;
//         }
//         return top.data;
//     }

//     public boolean isEmpty() {
//         return top == null;
//     }
// }

// public class PostfixEvaluation {

//     public static int evaluatePostfix(String expression) {

//         stack st = new stack();
//         String[] arr1 = expression.split(" ");

//         for (String s : arr1) {

//             if (!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")) {
//                 st.push(Integer.parseInt(s));
//             } 
//             else {

//                 int b = st.pop();
//                 int a = st.pop();

//                 switch (s) {
//                     case "+":
//                         st.push(a + b);
//                         break;
//                     case "-":
//                         st.push(a - b);
//                         break;
//                     case "*":
//                         st.push(a * b);
//                         break;
//                     case "/":
//                         st.push(a / b);
//                         break;
//                 }
//             }
//         }

//         return st.pop();
//     }

//     public static void main(String[] args) {

//         String expression = "3 4 + 2 * 7 -";

//         int result = evaluatePostfix(expression);

//         System.out.println("Result: " + result);
//     }
// }