package development.madcat.dagger2example.components;

import dagger.Subcomponent;
import development.madcat.dagger2example.classes.MainActivityHelper;
import development.madcat.dagger2example.modules.MainActivityModule;

@Subcomponent(modules = {MainActivityModule.class})
public interface MainActivityComponent {
    MainActivityHelper getMainActivityHelper();
}
