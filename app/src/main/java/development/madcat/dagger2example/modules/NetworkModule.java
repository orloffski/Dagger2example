package development.madcat.dagger2example.modules;

import dagger.Module;
import dagger.Provides;
import development.madcat.dagger2example.classes.NetworkUtils;
import development.madcat.dagger2example.scopes.PerApplication;

@Module
public class NetworkModule {

    @PerApplication
    @Provides
    NetworkUtils provideNetworkUtils(){
        return new NetworkUtils();
    }
}
