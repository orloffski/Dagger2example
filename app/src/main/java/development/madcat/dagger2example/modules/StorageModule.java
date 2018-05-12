package development.madcat.dagger2example.modules;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import development.madcat.dagger2example.classes.DatabaseHelper;

@Module
public class StorageModule {

    @Singleton
    @Named("database_one")
    @Provides
    DatabaseHelper provideDatabaseHelper(){
        return new DatabaseHelper("database_1");
    }

    @Singleton
    @Named("database_two")
    @Provides
    DatabaseHelper provideDatabaseHelperTest(){
        return new DatabaseHelper("database_test");
    }
}
