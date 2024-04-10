
package pruebas;

public class Pruebas {

    
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        //muestra un mensaje, variable por consola
        
        // String (texto), int (numero), double (numeros decimales), boolean (verdadero o falso)
        
        //una variable es como una caja qu te permite almacenar un tipo de dato especifico, pero en java
        //siempre tenes que declarar de que tipo es la variable antes que nada.
        // ej:  TIPOVARIABLE  NOMBRE VARIABLE  =  DATO
        String variabletexto="Esto es una variable de texto";
        System.out.println(variabletexto);
        
        int num = 12 ;
        int fer = 12;
        int resultado= num + fer;
        System.out.println("El resultado es "+resultado + " yo");
        //+ se utiliza para concatenar, es decir para mezclar texto con variables
        
        boolean mali= true;
        double dec= 0.5;
        System.out.println(dec);
        System.out.println(mali);
        
        
        //condicional: 
        if (mali == true)  {
            System.out.println("Esto pasa si se cumple la condicion");
        }else{
            System.out.println("esto es lo que pasa sino cumple la condicion");
        }
        
        
        
        
        
        
        
        
    }
    
}
