import java.util.ArrayList;

public class Ejercicio2

{
  public static void main(String[] args)
  {
    carro miCarro = new carro();
    System.out.println("El carro tiene: " + miCarro.puertas);
    miCarro.AgregarPuerta();
    System.out.println("Se agregó una puerta y ahora tiene: " + miCarro.puertas);
  
  }
}


class carro{


  public int puertas = 4;

  public void AgregarPuerta(){
    this.puertas++;
  }
}
