import java.util.ArrayList;

public class Ejercicio1

{
  public static void main(String[] args)
  {
  System.out.println("Los numeros a sumar serán: 5+7+8");
    int a = 5;
    int b = 7;
    int c = 8;
    
  int resultado = suma(a,b,c);
    System.out.println("total: " + resultado);
    
  }
  public static int suma(int a, int b, int c)
  {
    
    return a+b+c;
  }
  
  
}
