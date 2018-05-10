package development.madcat.dagger2example.modules;

import dagger.Module;
import dagger.Provides;
import development.madcat.dagger2example.classes.NetworkUtils;

@Module
public class NetworkModule {

    private String ipAdress;

    public NetworkModule(String ipAdress) {
        this.ipAdress = ipAdress;
    }

    @Provides
    NetworkUtils provideNetworkUtils(){
        return new NetworkUtils(this.ipAdress);
    }
}
