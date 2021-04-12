
package Ejercicio1;


public class Producto extends Atributos {
    
   public Producto(int id, String Nombre, int Cantidad, String FDC, String FV){
   Id= id;
   nombre= Nombre;
   cantidad = Cantidad;
   FechaDeCreacion = FDC;
   FechaDeVencimiento= FV;
    }
    
  public Producto(String UsuarioBase, String Contrasenia, String NombreBase, String url ){
  UsuarioBaseDatos = UsuarioBase;
  contrasenia= Contrasenia;
  nombreBseDatos= NombreBase;
  urlBaseDatos= url;
  }
    
}
