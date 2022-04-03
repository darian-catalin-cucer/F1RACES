package cucer.darian.f1races

import android.app.Application
import cucer.darian.f1races.core.networking.VolleyManager
import cucer.darian.f1races.koin.networkModule
import cucer.darian.f1races.koin.repositoryModule
import cucer.darian.f1races.koin.viewModelsModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class F1RacesUserSearch: Application() {

    override fun onCreate() {
        super.onCreate()

        VolleyManager.initialise(this)

        startKoin {
            androidContext(this@F1RacesUserSearch)
            modules(listOf(viewModelsModule, repositoryModule, networkModule))
        }
    }
}