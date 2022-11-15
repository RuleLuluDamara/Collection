import java.util.Stack;  

public class StackPush{  
    public static void main(String[] args){  
    Stack<String> stack1= new Stack<>();  
    
        stack1.push("Ferari");  
        stack1.push("Lamborghini");  
        stack1.push("Porsche");  
        stack1.push("Minicooper");  
        System.out.println("Stack: " + stack1);   
        
        String fruits = stack1.peek();  
        System.out.println("Element: " + fruits);  
        
        int location = stack1.search("Posrche");  
        System.out.println("Location of Posrche: " + location);  
    }
}  