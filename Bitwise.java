public class Bitwise {
    public static void main(String[] args) {
        int num1 = 12; 
        int num2 = 5;  
        int andResult = num1 & num2;      
        int orResult = num1 | num2;       
        int xorResult = num1 ^ num2;      
        int notResult = ~num1;           
        int leftShift = num1 << 2;        
        int rightShift = num1 >> 2;      
        System.out.println("\nResults of Bitwise Operations:");
        System.out.println(num1 + " & " + num2 + " = " + andResult);
        System.out.println(num1 + " | " + num2 + " = " + orResult);
        System.out.println(num1 + " ^ " + num2 + " = " + xorResult);
        System.out.println("~" + num1 + " = " + notResult);
        System.out.println(num1 + " << 2 = " + leftShift);
        System.out.println(num1 + " >> 2 = " + rightShift);
    }
}
