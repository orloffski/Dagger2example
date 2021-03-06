package development.madcat.dagger2example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;
import javax.inject.Named;

import development.madcat.dagger2example.classes.DatabaseHelper;
import development.madcat.dagger2example.classes.NetworkUtils;

public class SecondActivity extends AppCompatActivity {

    @Named("database_one")
    @Inject
    DatabaseHelper databaseHelper;

    @Named("database_two")
    @Inject
    DatabaseHelper databaseHelperTest;

    @Inject
    NetworkUtils networkUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        App.getComponent().injectSecondActivity(this);

        databaseHelper.test();
        databaseHelperTest.test();
        networkUtils.test();

        App.getComponent().createSecondActivityComponent().getSecondActivityHelper().test();
    }
}
