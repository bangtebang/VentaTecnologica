package gestordedatos;
import modelo.*;
import java.util.ArrayList;
import java.io.*;

public class GestorDatos {

    public static void guardarDatos(TiendaTecnologica tiendaTecnologica) {
        try{
            FileWriter clienteWriter = new FileWriter("clientes.csv");
            clienteWriter.write("Nombre,Apellido,Correo,Numero de Contacto,Estado Civil,Ciudad\n");
            ArrayList<Cliente> clientes = tiendaTecnologica.getClientes();
            for (Cliente cliente : clientes) {
                clienteWriter.write(cliente.getNombre() + "," +
                        cliente.getApellido() + "," +
                        cliente.getCorreoElectronico() + "," +
                        cliente.getNumeroContacto() + "," +
                        cliente.getEstadoCivil() + "," +
                        cliente.getCiudad() + "\n");
            }
            clienteWriter.close();

        // Guardar datos de dispositivos en un archivo CSV
            FileWriter dispositivoWriter = new FileWriter("dispositivos.csv");
            dispositivoWriter.write("marca, modelo, memoriaRam, memoriaAlmacenamiento, procesador, precio, cantidadStock, anoFabricacion\n");
            ArrayList<DispositivoTecnologico> dispositivos = tiendaTecnologica.getCatalogo();
            for (DispositivoTecnologico dispositivo : dispositivos) {
                if (dispositivo instanceof Computador) {
                    Computador computador = (Computador) dispositivo;
                    dispositivoWriter.write(computador.getMarca() + "," +
                            computador.getModelo() + "," +
                            computador.getMemoriaRam() + "," +
                            computador.getMemoriaAlmacenamiento() + "," +
                            computador.getProcesador() + "," +
                            computador.getPrecio() + "," +
                            computador.getCantidadStock() + "," +
                            computador.getAnoFabricacion() + "\n");
                } else if (dispositivo instanceof Notebook) {
                    Notebook notebook = (Notebook) dispositivo;
                    dispositivoWriter.write(notebook.getMarca() + "," +
                            notebook.getModelo() + "," +
                            notebook.getMemoriaRam() + "," +
                            notebook.getMemoriaAlmacenamiento() + "," +
                            notebook.getProcesador() + "," +
                            notebook.getPrecio() + "," +
                            notebook.getCantidadStock() + "," +
                            notebook.getAnoFabricacion() + "\n");
                } else if (dispositivo instanceof Tablet) {
                    Tablet tablet = (Tablet) dispositivo;
                    dispositivoWriter.write(tablet.getMarca() + "," +
                            tablet.getModelo() + "," +
                            tablet.getMemoriaRam() + "," +
                            tablet.getMemoriaAlmacenamiento() + "," +
                            tablet.getProcesador() + "," +
                            tablet.getPrecio() + "," +
                            tablet.getCantidadStock() + "," +
                            tablet.getAnoFabricacion() + "\n");
                }
            }
            dispositivoWriter.close();
            FileWriter ventaWriter = new FileWriter("ventas.csv");
            ventaWriter.write("Fecha,Cliente,Dispositivos\n");
            ArrayList<Venta> ventas = tiendaTecnologica.getVentas();
            for (Venta venta : ventas) {
                String fecha = venta.getFechaCompra();
                Cliente cliente = venta.getCliente();
                ArrayList<DispositivoTecnologico> dispositivosventa = venta.getDispositivoTecnologico();
                StringBuilder dispositivosStr = new StringBuilder();
                for (DispositivoTecnologico dispositivo : dispositivosventa) {
                    dispositivosStr.append(dispositivo.getDescripcion());
                    dispositivosStr.append(", ");
                }
                if (dispositivosStr.length() > 2) {
                    dispositivosStr.setLength(dispositivosStr.length() - 2);
                }
                ventaWriter.write(fecha + "," + cliente.getNombre() + " " + cliente.getApellido() + "," + dispositivosStr.toString() + "\n");
            }

            ventaWriter.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}