package com.jcmsalves.kotlinplayground.runtimechecks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import org.jetbrains.annotations.Nullable;

public class SomeActivityJava extends AppCompatActivity {

    private static final String SOME_EXTRA_KEY = "some_extra_key";
    private boolean isRefreshing = false;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (!getIntent().getExtras().containsKey(SOME_EXTRA_KEY)) {
            finish();
        }

        String passedArgument = getIntent().getExtras().getString(SOME_EXTRA_KEY);
        // do something with passed argument

        refreshSomething();

    }

    private void refreshSomething() {
        if (isRefreshing) {
            return;
        }

        isRefreshing = true;
        // do something that requires a valid state
    }
}
