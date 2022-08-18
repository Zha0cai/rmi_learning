import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class CalcImpl extends UnicastRemoteObject implements Calc {
    // static final long serialVersionUID = 6198140339175398437L;
    protected CalcImpl() throws RemoteException {
        super();
    }

    @Override
    public Integer sum(List<Integer> params) throws RemoteException {
        Integer sum = 0;
        for (Integer param : params) {
            sum += param;
        }

        return sum;
    }
}
