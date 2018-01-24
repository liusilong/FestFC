package com.lsl.festfc.example;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.lsl.latte.app.Latte;
import com.lsl.latte.ec.icon.FontEcModule;

/**
 * Created by liusilong on 2018/1/24.
 * version:1.0
 * Describe:
 */

public class ExampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withApiHost("http://127.0.0.1/")
                .configure();
    }
}
