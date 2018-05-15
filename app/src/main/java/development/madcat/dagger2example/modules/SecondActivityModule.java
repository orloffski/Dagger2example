package development.madcat.dagger2example.modules;

import dagger.Module;
import dagger.Provides;
import development.madcat.dagger2example.classes.SecondActivityHelper;

@Module
public class SecondActivityModule {

    @Provides
    SecondActivityHelper provideSecondActivityHelper(){return new SecondActivityHelper();}

}
