package development.madcat.dagger2example.modules;

import dagger.Module;
import dagger.Provides;
import development.madcat.dagger2example.classes.NetworkUtils;

@Module
public class NetworkModule {

    @Provides
    NetworkUtils provideNetworkUtils(){
        return new NetworkUtils();
    }
}
