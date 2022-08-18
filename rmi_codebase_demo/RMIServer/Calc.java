import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * 定义调用接口
 */
public interface Calc extends Remote {
    public Integer sum(List<Integer> params) throws RemoteException;
}
