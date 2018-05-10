package development.madcat.dagger2example.modules;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import development.madcat.dagger2example.classes.DatabaseHelper;

@Module
public class StorageModule {

    @Named("database_one")
    @Provides
    DatabaseHelper provideDatabaseHelper(){
        return new DatabaseHelper("database_1");
    }

    @Named("database_two")
    @Provides
    DatabaseHelper provideDatabaseHelperTest(){
        return new DatabaseHelper("database_test");
    }
}
