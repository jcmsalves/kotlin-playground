package com.jcmsalves.kotlinplayground.runtimechecks

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class SomeActivity : AppCompatActivity() {

    companion object {
        private const val SOME_EXTRA_KEY = "some_extra_key"
    }

    private var isRefreshing = false

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        require(intent.extras.containsKey(SOME_EXTRA_KEY), {
            "SOME_EXTRA is required to launch SomeActivity"
        })

        val passedArgument = intent.extras.getString(SOME_EXTRA_KEY)
        // do something with passed argument
        refreshSomething()
    }

    private fun refreshSomething() {
        require(!isRefreshing, {
            "Trying to refresh state while already refreshing"
        })

        isRefreshing = true
        // do something that requires a valid state
    }
}
