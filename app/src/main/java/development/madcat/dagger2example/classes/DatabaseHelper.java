package development.madcat.dagger2example.classes;

import android.util.Log;

public class DatabaseHelper {

    private String databaseName;

    public DatabaseHelper(String databaseName){
        this.databaseName = databaseName;
    }

    public void test(){
        Log.d("Test", "Test message from DatabaseHelper - databaseName: " + this.databaseName + " id: " + this);
    }
}
