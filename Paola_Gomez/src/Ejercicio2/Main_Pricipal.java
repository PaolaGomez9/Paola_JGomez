
package Ejercicio2;


public class Main_Pricipal {

    public static void main(String[] args) {
   
    //Juanito Perez 0801199901234Ingenieria Química -> 44
    StringManagement M = new StringManagement(45); 
    if (M.setTrama("Juanito Perez 0801199901234Ingenieria Química")){
     
      System.out.println("La cadena no cumple con el tamanio definido");
    }else{
      //System.out.println(M.getTrama().length());
      M.setRule(new Rule("nombreCliente", 0, 14, "Nombre del Cliente"));
      M.setRule(new Rule("Identidad", 14, 27, "Identida del Cliente"));
      M.setRule(new Rule("Carrera", 27, 45, "Nombre del Cliente"));

         
      M.getParte("nombreCliente");
      M.getParte("Identidad");
      M.getParte("Carrera");
      M.getParte("La Hora sadsad");
    }

    StringManagement M1 = new StringManagement(45); 
    
    if (M1.setTrama("Jovanny Rubio 080119910098Ingenieria Sistemas")){
      System.out.println("La cadena no cumple con el tamanio definido");
    }else{
      M1.setRule(new Rule("nombreCliente",0,13,"nombreCliente" ));
      M1.setRule(new Rule("nombreCliente",14,27,"nombreCliente" ));
      M1.getParte("nombreCliente");
    }
  
}
}