
import java.util.ArrayList;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class StringExample {
    public static void main (String[] args) {
        String str="Parse This String";
    
        //displayString(str);
        //displayBackwards(str);
        //findingSpace(str, 'S');
        parsingString(str);
        //SplitString(str);
        
        }  
    
    static void parsingString(String str){
        ArrayList<String> words = new ArrayList<String>();
        
        while(str.length() > 0){
            for(int i=0; i<str.length();i++){
                if(i==str.length()-1){
                    words.add(str.substring(0));
                    str = "";
                    break;
                }
                else if(str.charAt(i)==' '){
                    
                    words.add(str.substring(0,i));
                    str = str.substring(i+1);
                    break;
                }
            }
        }
        for(String s : words) 
            System.out.print(s + " ");
            System.out.println("There are " + words.size());
            
            System.out.println("Setelah ditambah : ");
            words.add(" Now");
            System.out.println(words);
            
            System.out.println("Setelah diremove : ");
            words.remove(3);
            System.out.println(words);
            
            System.out.println("Collection : ");
            Collections.sort(words);
            System.out.println(words);
            
        
    }
    
    static void RemoveString(String str){

        String[] words = str.split(" ");
        
        String[] tokens = str.split("i");
        String[] tokens2 = str.split("[hi]");
        for(String token : tokens2){
            System.out.print(token + ", ");
        }
    }
    /*static void SplitString(String str){

        String[] words = str.split(" ");
        
        String[] tokens = str.split("i");
        String[] tokens2 = str.split("[hi]");
        for(String token : tokens2){
            System.out.print(token + ", ");
        }
    }*/
    
    
    
    /*static void displayString(String str){
        System.out.println(str);
    
        for(int index=0; index < str.length();index++){
        System.out.println(str.charAt(index));
        }
    }
    
    static void displayBackwards(String str){
        System.out.println("Read backwards");
        
        String strBackwards= "";
        for(int index=str.length()-1; index >= 0;index--){
            strBackwards+=str.substring(index,index+1);
            //System.out.print(str.charAt(index));
        }
        System.out.println(strBackwards);
    }
      
    static void findingSpace(String str, char c){
        int count = 0;
        
        for(int index=0; index < str.length();index++){
            if(str.charAt(index)==c)count++;
        }
        System.out.println(count);
    }
    */
}
