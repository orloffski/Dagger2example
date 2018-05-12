package development.madcat.dagger2example.components;

import javax.inject.Singleton;

import dagger.Component;
import development.madcat.dagger2example.MainActivity;
import development.madcat.dagger2example.SecondActivity;
import development.madcat.dagger2example.modules.MailModule;
import development.madcat.dagger2example.modules.NetworkModule;
import development.madcat.dagger2example.modules.StorageModule;

@Singleton
@Component(modules = {StorageModule.class, NetworkModule.class})
public interface AppComponent {

    MailComponent createMailComponent(MailModule mailModule);

    void injectsMainActivity(MainActivity mainActivity);

    void injectSecondActivity(SecondActivity secondActivity);
}
