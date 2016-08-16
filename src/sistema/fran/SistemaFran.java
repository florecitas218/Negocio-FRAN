
package sistema.fran;

import Modelo.Empresa;
import Vistas.Productos;


public class SistemaFran {


    public static void main(String[] args) {
        Empresa negocio = new Empresa (1, " El Franco", "3764200636","yacyreta");
        Productos ventanaProductos = new Productos (negocio);
        ventanaProductos.setVisible(true);
    }
    
}
