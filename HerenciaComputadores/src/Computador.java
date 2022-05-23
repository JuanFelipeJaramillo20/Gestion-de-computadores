


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valentina
 */
public class Computador {
    
    private String Pantalla;
    private String TarjetaMadre;
    private String Procesador;
    private String SistemaOperativo;
    private String DiscoDuro;
    private String Teclado;
    private String Mouse;
    private static int contador = 0;
    
    public Computador (String Pantalla, String TarjetaMadre, String Procesador, String SistemaOperativo, String DiscoDuro,
            String Teclado, String Mouse){
        
        this.Pantalla = Pantalla;
        this.TarjetaMadre = TarjetaMadre;
        this.Procesador = Procesador;
        this.SistemaOperativo = SistemaOperativo;
        this.DiscoDuro = DiscoDuro;
        this.Teclado = Teclado;
        this.Mouse = Mouse;
    }
    
    public String getPantalla(){
        return Pantalla;
    }
    
    public void setPantalla(String pantalla){
        this.Pantalla = Pantalla;
    }
    
    public String getTarjetaMadre(){
        return TarjetaMadre;
    }
    
    public void setTarjetaMadre(String TarjetaMadre){
        this.TarjetaMadre = TarjetaMadre;
    }
    
    public String getProcesador(){
        return Procesador;
    }
    
    public void setProcesador(String Procesador){
        this.Procesador = Procesador;
    }
    
    public String getSistemaOperativo(){
        return Procesador;
    }
    
    public void setSistemaOperativo(String SistemaOperativo){
        this.SistemaOperativo = SistemaOperativo;
    }
    
    public String getDiscoDuro(){
        return DiscoDuro;
    }
    
    public static void aumentarContador(){
        contador++;
    }
    
    public static void reducirContador(){
        contador--;
    }
    
    public void setDiscoDuro(String DiscoDuro){
        this.DiscoDuro = DiscoDuro;
    }
    
    public String getTeclado(){
        return Teclado;
    }
    
    public void setTeclado(String Teclado){
        this.Teclado = Teclado;
    }
    
    public String getMouse(){
        return Mouse;
    }
    
    public void setMouse(String Mouse){
        this.Mouse = Mouse;
    }

    @Override
    public String toString() {
        return "computador{" + "Pantalla=" + Pantalla + ", TarjetaMadre=" + TarjetaMadre + ", Procesador=" + Procesador + ", SistemaOperativo=" + SistemaOperativo + ", DiscoDuro=" + DiscoDuro + ", Teclado=" + Teclado + ", Mouse=" + Mouse + '}';
    }
    
    
}
