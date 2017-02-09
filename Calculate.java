public class Calculate{
 
  public static void main(String[] args){

    System.out.println("  --- hi ---  ");

    int a = Integer.valueOf(args[0]);
    int b = Integer.valueOf(args[1]);
    int sum = a+b;


    float c = Float.valueOf(args[2]);
    float d = Float.valueOf(args[3]);
    float raz = c-d;

    System.out.println("sum: " + sum);
    System.out.println("raz: " + raz);
  }

}