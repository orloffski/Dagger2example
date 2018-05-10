package development.madcat.dagger2example.modules;

import dagger.Module;
import dagger.Provides;
import development.madcat.dagger2example.classes.MailHelper;

@Module
public class MailModule {

    @Provides
    MailHelper provideDatabaseHelper(){
        return new MailHelper();
    }

}
