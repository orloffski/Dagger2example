package development.madcat.dagger2example.components;

import dagger.Component;
import development.madcat.dagger2example.MainActivity;
import development.madcat.dagger2example.SecondActivity;
import development.madcat.dagger2example.scopes.PerApplication;
import development.madcat.dagger2example.modules.NetworkModule;
import development.madcat.dagger2example.modules.StorageModule;

@PerApplication
@Component(modules = {StorageModule.class, NetworkModule.class})
public interface AppComponent {

    void injectsMainActivity(MainActivity mainActivity);
    void injectSecondActivity(SecondActivity secondActivity);

    MainActivityComponent createMainActivityComponent();
    SecondActivityComponent createSecondActivityComponent();
}
