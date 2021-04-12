
package Ejercicio1;

public class Cliente extends Atributos {
     public Cliente(int id, String Nombre , String Direccion, String Nacimiento){
   this.Id = id;
   this.nombre = Nombre;
   this.direccion = Direccion;
   this.FechaDeNacimiento = Nacimiento;
   }   

   
   public Cliente(String UsuarioBase, String Contrasenia, String NombreBase, String url ){
  UsuarioBaseDatos = UsuarioBase;
  contrasenia= Contrasenia;
  nombreBseDatos= NombreBase;
  urlBaseDatos= url;
  }
  
  
    
}
