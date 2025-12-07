
package javaapp.TP8.Parte1.Entities;

import javaapp.TP8.Parte1.Interfaces.Pago;
import javaapp.TP8.Parte1.Interfaces.PagoConDescuento;

public class TarjetaDeCredito implements Pago, PagoConDescuento{
    double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public void procesarPago(double payment) {
        double result = 0;
        try{
            if(payment <= amount){
                result += amount - payment;
                System.out.println("¡Pago aprobado!");
                System.out.println("El pago fue de $"+ payment);
            } else {
                throw new Exception("Fondos insuficientes en tu Tarjeta de Crédito");
            }
        } catch (Exception e){
            System.out.println("No fue posible continuar con la operación.");
        }
    }

    @Override
    public double aplicarDescuento(double total) {
        return total * 0.20;
    }

}
