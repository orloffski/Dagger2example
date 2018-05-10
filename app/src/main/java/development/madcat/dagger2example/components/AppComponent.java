package development.madcat.dagger2example.components;

import dagger.Component;
import development.madcat.dagger2example.MainActivity;
import development.madcat.dagger2example.modules.MailModule;
import development.madcat.dagger2example.modules.NetworkModule;
import development.madcat.dagger2example.modules.StorageModule;

@Component(modules = {StorageModule.class, NetworkModule.class})
public interface AppComponent {

    MailComponent createMailComponent(MailModule mailModule);

    void injectsMainActivity(MainActivity mainActivity);
}
