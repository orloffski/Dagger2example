package development.madcat.dagger2example.classes;

import android.util.Log;

import javax.inject.Inject;

public class MailHelper {

    @Inject
    public MailHelper(){}

    public void test(){
        Log.d("Test", "Test message from MailHelper");
    }
}
