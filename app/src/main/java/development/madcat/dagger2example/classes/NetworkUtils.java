package development.madcat.dagger2example.classes;

import android.util.Log;

public class NetworkUtils {
    private String ipAdress;

    public NetworkUtils(String ipAdress) {
        this.ipAdress = ipAdress;
    }

    public void test(){
        Log.d("Test", "Test message from NetworkUtils - ipAdress: " + this.ipAdress);
    }
}
