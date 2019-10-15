import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NetworkTest {

    Network network;
    Desktop desktop;
    Printer printer;

    @Before
    public void before() {
        network = new Network("CodeClan", 2);
        desktop = new Desktop("Keith's Desktop", "Apple", "Macbook Pro");
        printer = new Printer();
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan", network.getName());
    }

    @Test
    public void deviceListStartsEmpty() {
        assertEquals(0, network.deviceCount());
    }

    @Test
    public void canConnectDesktop() {
        network.connect(desktop);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void canConnectPrinter() {  //NEW TEST
        network.connect(printer);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void shouldEmptyDeviceListAfterDisconnectingAll(){
        network.connect(desktop);
        network.connect(printer);
        network.disconnectAll();
        assertEquals(0, network.deviceCount());
    }

    @Test
    public void maxNumberDevicesReached() {
        network.connect(desktop);
        network.connect(desktop);
        assertEquals("Maximum number of devices connected", network.connect(printer));
    }

    @Test
    public void
}
