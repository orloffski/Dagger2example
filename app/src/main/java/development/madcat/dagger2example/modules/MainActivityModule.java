package development.madcat.dagger2example.modules;

import dagger.Module;
import dagger.Provides;
import development.madcat.dagger2example.classes.MainActivityHelper;

@Module
public class MainActivityModule {

    @Provides
    MainActivityHelper provideMainActivityHelper(){return new MainActivityHelper();}
}
