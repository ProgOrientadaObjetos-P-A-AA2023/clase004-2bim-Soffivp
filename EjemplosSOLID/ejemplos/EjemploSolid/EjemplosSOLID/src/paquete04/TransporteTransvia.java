/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author SALA I
 */
public class TransporteTransvia extends Transporte{

    private String cooperativaTranvia;
    public double tarifa;

    public void establecerCooperativaTranvia(String n) {
        cooperativaTranvia = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 20.00 + 0.10;
    }

    public String obtenerCooperativaTranvia() {
        return cooperativaTranvia;
    }

    @Override
    public double obtenerTarifa() {
        return tarifa;
    }
}
