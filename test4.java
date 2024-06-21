import java.util.Random class
public class test4 {
    public static void main(String[] args) {
        Random random = new Random();
    System.out.println(random.nextInt(10));
System.out.println(random.nextBoolean());
System.out.println(random.nextDouble());
System.out.println(random.nextFloat());
System.out.println(random.nextGaussian());
byte[]bytes=new byte[10];
random.nextBytes(bytes);
System.out.println();    }
    
}
