package development.madcat.dagger2example.classes;

import android.util.Log;

import javax.inject.Inject;

public class MailHelper {

    private String eMail;

    @Inject
    public MailHelper() {
        this.eMail = "";
    }

    public MailHelper(String eMail) {
        this.eMail = eMail;
    }

    public void test(){
        Log.d("Test", "Test message from MailHelper - eMail: " + this.eMail);
    }
}
