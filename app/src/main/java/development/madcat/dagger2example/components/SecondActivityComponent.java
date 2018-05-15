package development.madcat.dagger2example.components;

import dagger.Subcomponent;
import development.madcat.dagger2example.classes.SecondActivityHelper;
import development.madcat.dagger2example.modules.SecondActivityModule;

@Subcomponent(modules = {SecondActivityModule.class})
public interface SecondActivityComponent {
    SecondActivityHelper getSecondActivityHelper();
}
