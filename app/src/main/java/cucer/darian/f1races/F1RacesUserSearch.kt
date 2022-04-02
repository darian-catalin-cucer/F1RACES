package cucer.darian.f1races

import android.app.Application
import cucer.darian.f1races.koin.networkModule
import cucer.darian.f1races.koin.repositoryModule
import cucer.darian.f1races.koin.viewModelsModule
import cucer.darian.f1races.koin.networking.VolleyManager
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class F1RacesUserSearch: Application() {

    override fun onCreate() {
        super.onCreate()

        VolleyManager.initialise(this)

        startKoin { this:KoinApplication
            androidContext(this@F1RacesUserSearch)
            modules(listOf(viewModelsModule, repositoryModule, networkModule))
        }
    }
}