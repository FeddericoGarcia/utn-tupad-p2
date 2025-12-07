
package javaapp.TP8.Parte1.Entities;

import javaapp.TP8.Parte1.Interfaces.Notificable;

public class Cliente implements Notificable{
    private int id;
    private String name, email;

    public Cliente(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", name=" + name + ", email=" + email + '}';
    }

    @Override
    public void notifyToCustomer() {
        try{
            if(!email.isEmpty()){
                System.out.println("""
                                   ¡Notificación de compra confirmada!
                                   Queremos informarte que tu compra se realizo exitosamente.
                                   Que lo disfrutes!
                                   """);
            } else {
                throw new Exception("Email vacio");
            }
        }catch (Exception e){
            System.out.println("""
                               ¡Upps, Notificación fallída!
                               No hemos podido enviar el detalle de tu compra.
                               Intentá más tarde...
                               """);
        }
    }
    
}
