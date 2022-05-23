
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valentina
 */
public class main {
    
    public static void main(String[] args) {
        ArrayList<Computador> computadores;
    computadores = new ArrayList<>();
    
    
    ComputadorPortatil CP1 = new ComputadorPortatil("LCD", "AsRock", "intel", "windows", 
            "estado solido", "incorporado", "incorporado", "muchos watts", "hp");
    
    ComputadorDeMesa CM1 = new ComputadorDeMesa("LSD", "lenovo", "qualcom", "ios", 
            "mecanico", "mecanico", "razer", "hp", "jbl");
    
    for(int i = 1; i <=10; i++ ){
        computadores.add(CP1);
        Computador.aumentarContador();
        computadores.add(CM1);
        Computador.aumentarContador();
    }
    
        for (int i = 0; i < computadores.size(); i++) {
            System.out.println(computadores.get(i));
            
        }
    
    


    
    }
    
   
}
