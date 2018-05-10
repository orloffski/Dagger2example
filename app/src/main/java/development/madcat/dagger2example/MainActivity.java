package development.madcat.dagger2example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;
import javax.inject.Named;

import development.madcat.dagger2example.classes.DatabaseHelper;
import development.madcat.dagger2example.classes.MailHelper;
import development.madcat.dagger2example.classes.NetworkUtils;
import development.madcat.dagger2example.components.MailComponent;
import development.madcat.dagger2example.modules.MailModule;

public class MainActivity extends AppCompatActivity {

    @Named("database_one")
    @Inject
    DatabaseHelper databaseHelper;

    @Named("database_two")
    @Inject
    DatabaseHelper databaseHelperTest;

    @Inject
    NetworkUtils networkUtils;

    @Inject
    MailHelper mailHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.getComponent().injectsMainActivity(this);
        App.getComponent().createMailComponent(new MailModule("orloffski@gmail.com")).injectsMainActivity(this);

        networkUtils.test();
        databaseHelper.test();
        databaseHelperTest.test();
        mailHelper.test();
    }
}
