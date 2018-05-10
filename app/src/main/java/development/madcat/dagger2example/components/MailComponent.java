package development.madcat.dagger2example.components;

import dagger.Subcomponent;
import development.madcat.dagger2example.MainActivity;
import development.madcat.dagger2example.modules.MailModule;

@Subcomponent(modules = {MailModule.class})
public interface MailComponent {
    void injectsMainActivity(MainActivity mainActivity);
}
