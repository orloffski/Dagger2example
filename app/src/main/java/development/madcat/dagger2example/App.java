package development.madcat.dagger2example;

import android.app.Application;

import development.madcat.dagger2example.components.AppComponent;
import development.madcat.dagger2example.components.DaggerAppComponent;
import development.madcat.dagger2example.modules.NetworkModule;

public class App extends Application {
    private static AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.builder().networkModule(new NetworkModule("8.8.8.8")).build();
    }

    public static AppComponent getComponent() {
        return component;
    }
}
