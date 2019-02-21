package textimagemaker.hooyee.com.textimagemaker.util;

import android.util.Log;

public class Logs {
    private static final String TAG = "Logs ";

    public static void iprintln(String str) {
        iprintln( "", str );
    }

    public static void eprintln(String str) {
        eprintln( "", str );
    }

    public static void iprintln(String tag, String str) {
        Log.i( TAG + tag, str );
    }

    public static void eprintln(String tag, String str) {
        Log.e( TAG + tag, str );
    }
}
