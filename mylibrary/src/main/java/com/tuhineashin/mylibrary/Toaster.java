package com.tuhineashin.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    public static void SimpleToastGit(Context context, String data){
        Toast.makeText(context, ""+data, Toast.LENGTH_SHORT).show();
    }

}
