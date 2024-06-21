public class test3 {
    public static void main(String[] args) {
        Integer i = 2;
        Double d = 3.5;
        System.out.println(i.intValue());//intvalue() returns the primitive value 
        System.out.println(d.doubleValue());

        String ageStr = "16";
        //Integer.paret and double.parsedouble are often used tp convert an input string to a number so you can do math on it.
        //they are not the AP exam
        System.out.println("Age"
        +ageStr
        +"in 10years is"
        +(Integer.parseInt(ageStr)+10));
        System.out.println(
            "Note that + with strungs does concatenation, not addition"
            +(ageStr+10)    
        );
    }
}
