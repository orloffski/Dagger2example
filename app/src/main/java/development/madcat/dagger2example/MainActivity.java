package development.madcat.dagger2example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import development.madcat.dagger2example.classes.DatabaseHelper;
import development.madcat.dagger2example.classes.NetworkUtils;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper databaseHelper;
    NetworkUtils networkUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
