package it.chicio.explorejavascriptinterfaces;

import android.app.AlertDialog;
import android.content.Context;
import android.webkit.JavascriptInterface;

public class FormJavascriptInterface {
    private Context context;

    FormJavascriptInterface(Context context) {
        this.context = context;
    }

    @JavascriptInterface
    public void showUser(String name, String email) {
        new AlertDialog.Builder(context)
                .setTitle("User")
                .setMessage(name + " " + email)
                .show();
    }
}