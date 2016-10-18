package notes.stormpath.com.stormpathnotes;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by dmlong on 10/18/16.
 */

public class UIUtils {



    private static Toast toast;

    public static void toast(String s, Context context) {
        cancelToast();
        toast = Toast.makeText(context, s, Toast.LENGTH_SHORT);
        toast.show();
    }

    public static void cancelToast() {
        if (toast != null)
            toast.cancel();
    }
}
