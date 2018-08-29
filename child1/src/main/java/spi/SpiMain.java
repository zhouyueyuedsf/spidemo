package spi;

import java.util.Iterator;
import java.util.ServiceLoader;

public class SpiMain {

    public static void getConnection(){
        ServiceLoader<DemoService> serviceLoader = ServiceLoader.load(DemoService.class);
        Iterator<DemoService> services = serviceLoader.iterator();
        while (services.hasNext()) {
            DemoService service = services.next();
            System.out.println(service.sayHi("world"));
        }
    }

}
