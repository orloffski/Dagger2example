package development.madcat.dagger2example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import javax.inject.Inject;
import javax.inject.Named;

import development.madcat.dagger2example.classes.DatabaseHelper;
import development.madcat.dagger2example.classes.NetworkUtils;
import development.madcat.dagger2example.components.MainActivityComponent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Named("database_one")
    @Inject
    DatabaseHelper databaseHelper;

    @Named("database_two")
    @Inject
    DatabaseHelper databaseHelperTest;

    @Inject
    NetworkUtils networkUtils;

    Button btnSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSecond = findViewById(R.id.btnSecond);
        btnSecond.setOnClickListener(this);

        App.getComponent().injectsMainActivity(this);

        networkUtils.test();
        databaseHelper.test();
        databaseHelperTest.test();

        App.getComponent().createMainActivityComponent().getMainActivityHelper().test();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
