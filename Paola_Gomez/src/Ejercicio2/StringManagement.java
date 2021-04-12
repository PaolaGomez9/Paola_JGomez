
package Ejercicio2;


import java.util.ArrayList;

public class StringManagement {
  private String cadena;
  private int tamanio;
  private ArrayList<Rule>lista = new ArrayList<Rule>();  

  public StringManagement(int tamanio){
    this.tamanio = tamanio;
  }
    
  public boolean setTrama(String cadena){
    if (cadena.length() == tamanio){
      this.cadena = cadena;
      return false;
    }else{
      return true;
    }
  }

  public String getTrama(){
    return this.cadena;
  }

  public void setRule(Rule nuevo){
    if (nuevo.getPosicionInicio() < 0 || nuevo.getPosicionFinal() < 0){
      System.out.println("\nNo se aceptan posiciones negativas");
      return;
    }else if(nuevo.getPosicionInicio() > nuevo.getPosicionFinal()){
      System.out.println("\nLa posicion Inicial no puede ser mayor a la posicion final");
    return;
    }
    for(int i = 0; i < lista.size(); ++i){
      Rule temp = lista.get(i);
      if ((nuevo.getPosicionInicio() > temp.getPosicionInicio() && nuevo.getPosicionInicio() < temp.getPosicionFinal()) || (nuevo.getPosicionFinal() > temp.getPosicionInicio() && nuevo.getPosicionFinal() < temp.getPosicionFinal())){
        System.out.println("\nRegla sobrepuesta con: " + temp.getNombre());
        return;
      }else if(nuevo.getPosicionInicio() == temp.getPosicionInicio() || nuevo.getPosicionFinal() == temp.getPosicionFinal()){
        System.out.println("\nNo pueden existir reglas con posiciones iguales");
        return;
      }else if(temp.getNombre().equals(nuevo.getNombre())){
        System.out.println("\nNo pueden existir dos o mas reglas con el mismo nombre");
        return;
      }
    }
    this.lista.add(nuevo);
  }
  
  public void getParte(String rule){
    System.out.println("\n-------------------------------");
    for(int i = 0; i < lista.size();i++){
      Rule temp = lista.get(i);
      if (rule.equals(temp.getNombre())){
        System.out.println("\n" + rule + " : " + cadena.substring(temp.getPosicionInicio(), temp.getPosicionFinal()));
        return;
      }
    }
    System.out.println("\nLa regla no existe o esta mal escrita");
  }  
}
