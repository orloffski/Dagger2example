package development.madcat.dagger2example.components;

import dagger.Component;
import development.madcat.dagger2example.classes.DatabaseHelper;
import development.madcat.dagger2example.classes.NetworkUtils;
import development.madcat.dagger2example.modules.StorageModule;

@Component(modules = {StorageModule.class, NetworkUtils.class})
public interface AppComponent {
    DatabaseHelper getDatabaseHelper();
    NetworkUtils getNetworkUtils();
}
