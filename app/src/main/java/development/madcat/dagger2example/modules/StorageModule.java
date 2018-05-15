package development.madcat.dagger2example.modules;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import development.madcat.dagger2example.classes.DatabaseHelper;
import development.madcat.dagger2example.scopes.PerApplication;

@Module
public class StorageModule {

    @PerApplication
    @Named("database_one")
    @Provides
    DatabaseHelper provideDatabaseHelper(){
        return new DatabaseHelper();
    }

    @PerApplication
    @Named("database_two")
    @Provides
    DatabaseHelper provideDatabaseHelperTest(){
        return new DatabaseHelper();
    }
}
