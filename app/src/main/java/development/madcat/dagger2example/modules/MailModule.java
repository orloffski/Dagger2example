package development.madcat.dagger2example.modules;

import dagger.Module;
import dagger.Provides;
import development.madcat.dagger2example.classes.MailHelper;

@Module
public class MailModule {

    private String eMail;

    public MailModule(String eMail) {
        this.eMail = eMail;
    }

    @Provides
    MailHelper provideMailHelper(){
        return new MailHelper(this.eMail);
    }

}
