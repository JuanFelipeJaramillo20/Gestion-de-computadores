/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valentina
 */
public class ComputadorDeMesa extends Computador{
    
    private String Torre;
    private String Parlantes;
    
    public ComputadorDeMesa(String Pantalla, String TarjetaMadre, String Procesador, String SistemaOperativo, 
            String DiscoDuro, String Teclado, String Mouse, String Torre, String Parlantes) {
        super(Pantalla, TarjetaMadre, Procesador, SistemaOperativo, DiscoDuro, Teclado, Mouse);
        this.Parlantes = Parlantes;
        this.Torre = Torre;
    }
    
    public String getTorre(){
        return Torre;
    }

    public void setTorre(String Torre){
        this.Torre = Torre;
    }
    
     public String getParlantes(){
        return Parlantes;
    }

    public void setParlantes(String Parlantes){
        this.Parlantes = Parlantes;
    }

    @Override
    public String toString() {
        return  super.toString() + ", ComputadorDeMesa{" + "Torre=" + Torre + ", Parlantes=" + Parlantes + '}';
    }
    
}
