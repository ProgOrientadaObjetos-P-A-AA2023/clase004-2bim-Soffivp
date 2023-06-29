/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author SALA I
 */
public class TransporteTranvia {

    private String cooperativaTranvia;
    public double tarifa;

    public void establecerCooperativaTranvia(String n) {
        cooperativaTranvia = n;
    }

    public void establecerTarifa() {
        tarifa = 20.00 + 0.10;
    }

    public String obtenerCooperativaTranvia() {
        return cooperativaTranvia;
    }

    public double obtenerTarifa() {
        return tarifa;
    }
}
