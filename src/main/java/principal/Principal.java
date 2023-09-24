package principal;

import modelo.*;
import gestordedatos.*;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // Inicializar la tienda y cargar datos desde archivos CSV
        TiendaTecnologica tienda = new TiendaTecnologica("Dirección de la Tienda");

        // Agregar clientes de ejemplo
        Cliente cliente1 = new Cliente("Juan", "Perez", "juan@gmail.com", 123456789, "Soltero", "Ciudad A", tienda);
        Cliente cliente2 = new Cliente("Maria", "Lopez", "maria@gmail.com", 987654321, "Casado", "Ciudad B", tienda);

        tienda.agregarCliente(cliente1);
        tienda.agregarCliente(cliente2);
        // Agregar dispositivos de ejemplo
        DispositivoTecnologico dispositivo1 = new Computador("MarcaX", "ModeloX", "8GB", "600gb", "Intel i5",256, 15, 2023,"RTX 4080", "GP-850", "Neon 859",new Pantalla("MarcaX", "ModeloX", 2023));
        DispositivoTecnologico dispositivo2 = new Notebook("MarcaY", "ModeloY", "8GB", "600gb", "Intel i5",256, 15, 2023,"1080x900", "Normal", "4400 Mha");
        DispositivoTecnologico dispositivo3 = new Tablet("MarcaZ", "ModeloZ", "8GB", "600gb", "Intel i5",256, 15, 2023,"1080x900", "lapiz");

        tienda.agregarDispositivoTecnologico(dispositivo1);
        tienda.agregarDispositivoTecnologico(dispositivo2);
        tienda.agregarDispositivoTecnologico(dispositivo3);
        // Realizar una venta de ejemplo
        ArrayList<DispositivoTecnologico> dispositivosVenta = new ArrayList<>();
        dispositivosVenta.add(dispositivo1);
        dispositivosVenta.add(dispositivo2);

        Cliente clienteVenta = cliente1;
        String fechaVenta = "2023-09-24";

        Venta venta = new Venta(fechaVenta, clienteVenta, dispositivosVenta, 1);
        tienda.realizarVenta(venta, dispositivosVenta, 1);
        GestorDatos.guardarDatos(tienda);
        tienda.obtenerInformacionDispositivoTecnologico(dispositivo1);
    }
}