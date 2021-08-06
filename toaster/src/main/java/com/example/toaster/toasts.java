package com.example.toaster;
import android.widget.Toast;
import android.content.Context;

public class toasts {

    public static void Custom(Context context, String s){
        android.widget.Toast.makeText(context, ""+s, Toast.LENGTH_SHORT).show();
    }
}
