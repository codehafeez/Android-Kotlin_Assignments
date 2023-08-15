package com.codehafeez.lifecycle_example1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
class MainActivity : AppCompatActivity(), LifecycleObserver {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Add the activity as a lifecycle observer
        lifecycle.addObserver(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onActivityCreated() {
        Log.d("lifecycle", "Handle activity created event")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onActivityStarted() {
        Log.d("lifecycle", "Handle activity started event")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onActivityResumed() {
        Log.d("lifecycle", "Handle activity resumed event")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onActivityPaused() {
        Log.d("lifecycle", "Handle activity paused event")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onActivityStopped() {
        Log.d("lifecycle", "Handle activity stopped event")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onActivityDestroyed() {
        Log.d("lifecycle", "Handle activity destroyed event")
    }
}
