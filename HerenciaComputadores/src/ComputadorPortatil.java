/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valentina
 */
public class ComputadorPortatil extends Computador {
    
    private String Bateria;
    private String Cargador;
    

    public ComputadorPortatil(String Pantalla, String TarjetaMadre, String Procesador, String SistemaOperativo, 
            String DiscoDuro, String Teclado, String Mouse, String Bateria, String Cargador) {
        super(Pantalla, TarjetaMadre, Procesador, SistemaOperativo, DiscoDuro, Teclado, Mouse);
        this.Bateria = Bateria;
        this.Cargador = Cargador;
    }
    
    public String getBateria(){
        return Bateria;
    }

    public void setBateria(String Bateria){
        this.Bateria = Bateria;
    }
    
    public String getCargador(){
        return Cargador;
    }

    public void setCargador(String Cargador){
        this.Cargador = Cargador;
    }

    @Override
    public String toString() {
        return  super.toString() + ", ComputadorPortatil{" + "Bateria=" + Bateria + ", Cargador=" + Cargador + '}';
    }
    
}
