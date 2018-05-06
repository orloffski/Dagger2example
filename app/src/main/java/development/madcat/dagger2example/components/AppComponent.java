package development.madcat.dagger2example.components;

import dagger.Component;
import development.madcat.dagger2example.classes.DatabaseHelper;
import development.madcat.dagger2example.classes.NetworkUtils;
import development.madcat.dagger2example.modules.NetworkModule;
import development.madcat.dagger2example.modules.StorageModule;

@Component(modules = {StorageModule.class, NetworkModule.class})
public interface AppComponent {
    NetworkUtils getNetworkUtils();
    DatabaseHelper getDatabaseHelper();
}
