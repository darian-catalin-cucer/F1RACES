package cucer.darian.f1races.koin

import cucer.darian.f1races.core.networking.repository.Repository
import cucer.darian.f1race.core.networking.API
import cucer.darian.f1racesusersearch.core.networking.VolleyManager
import cucer.darian.f1racesusersearch.core.repository.Repository
import cucer.darian.f1racesusersearch.core.repository.RepositoryImpl
import cucer.darian.f1racesusersearch.screens.details.UserDetailsViewModel
import cucer.darian.f1racesusersearch.screens.search.UserSearchViewModel
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