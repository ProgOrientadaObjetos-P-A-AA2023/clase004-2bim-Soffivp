/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList <Transporte> listatipos = new ArrayList<>();
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        TransporteTransvia tvia = new TransporteTransvia();
        tvia.establecerCooperativaTranvia("Coop loja");
        tvia.establecerTarifa();
        
        listatipos.add(bus);
        listatipos.add(taxi);
        listatipos.add(tvia);
        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransportes(listatipos);
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f\n", 
                tipos.obtenerPromedioTarifas());
        
    }
}
