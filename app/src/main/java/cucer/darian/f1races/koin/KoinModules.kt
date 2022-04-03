package cucer.darian.f1races.koin

import cucer.darian.f1races.core.repository.Repository
import cucer.darian.f1races.core.networking.API
import cucer.darian.f1races.core.networking.VolleyManager
import cucer.darian.f1races.core.repository.RepositoryImpl
import cucer.darian.f1races.screens.details.UserDetailsViewModel
import cucer.darian.f1races.screens.search.UserSearchViewModel
import org.koin.dsl.module

val viewModelsModule = module{
    single { UserSearchViewModel(get()) }
    single { UserDetailsViewModel(get()) }
}

val repositoryModule = module {
    single { RepositoryImpl(get()) as Repository }
}

val networkModule = module {
    single { VolleyManager as API }
}