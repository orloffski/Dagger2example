package development.madcat.dagger2example.modules;

import dagger.Module;
import dagger.Provides;
import development.madcat.dagger2example.classes.DatabaseHelper;

@Module
public class StorageModule {

    @Provides
    DatabaseHelper provideDatabaseHelper(){
        return new DatabaseHelper();
    }
}
