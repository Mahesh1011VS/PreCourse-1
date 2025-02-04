class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if (top==-1){
           return true; 
        }
        else{
        return false;
        }
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        // Check for stack Overflow
        if (top == MAX-1) {
            System.out.println("Stack overflow");
            return false;
        } else {
        //Write your code here
            top = top + 1;
            a[top] = x;
            return true;

        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if (top ==-1){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
        int temp = a[top];
        //Write your code here
        a[top]=0;
        top--;
        return temp;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top==-1){
         //If empty return 0 and print " Stack Underflow"    
        return 0;
        }
        else{
            return a[top];
        }
    } 
} 
  
// Driver code 
public class Main{ 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.peek() + " Is the element at the top of the stack"); 
        
    } 
}
