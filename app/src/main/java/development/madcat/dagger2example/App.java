package development.madcat.dagger2example;

import android.app.Application;

import development.madcat.dagger2example.components.AppComponent;
import development.madcat.dagger2example.components.DaggerAppComponent;

public class App extends Application {
    private static AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }

    public static AppComponent getComponent() {
        return component;
    }
}
