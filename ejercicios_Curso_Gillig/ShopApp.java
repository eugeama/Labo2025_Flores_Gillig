package ejercicios_Curso_Gillig;

import io.helidon.webserver.Routing;
import java.net.InetAddress;
import java.net.UnknownHostException;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.util.ArrayList;
import java.util.Arrays;

public class ShopApp

{
    public static void main(String[] args) {
        System.out.println("Welcome to duke choice shop");
        double tax = 1.2;
        double total = 0.0;
        double promedio =0.0;
        Ropa item1 = new Ropa("Blue Jacket", 20.9, 'm');
        Ropa item2 = new Ropa("Orange T-shirt", 10.5, 's');
        Ropa item4 = new Ropa("Green scarf", 15.5, 's');
        ArrayList<Ropa>items=new ArrayList<>();
        Cliente c1 = new Cliente();
        items.add(item1);
        items.add(item2);
        items.add(item4);

        c1.setNombre("pinky");
        c1.setSize('s');
        System.out.println("Hello"+c1.getNombre());
        Arrays.sort(new ArrayList[]{c1.getItems()});
        try {
            Item list = new Item(items);
            Routing routing = Routing.builder()
                    .get("/items",list).build();
            ServerConfiguration config = ServerConfiguration.builder()
                    .bindAddress(InetAddress.getLocalHost())
                    .port(8888).build();
            WebServer ws = WebServer.create(config,routing);
            ws.start();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }


        for (Ropa i: c1.getItems()){
            System.out.println("Iteam 1 datos:"+" "+i.getDescripcion()+" "+ i.getPrecio()+ " "+i.getTalle());
        }


        int medidas = 3;
        c1.setSize(medidas);

        System.out.println("total="+ c1.getPrecioTotal()+" "+"y el promedio fue:"+c1.getCostoP());

    }
}
