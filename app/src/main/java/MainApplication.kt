import android.app.Application
import android.util.Log

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.d("my-app", "onStart")
    }

    override fun onTerminate() {
        super.onTerminate()
    }
}