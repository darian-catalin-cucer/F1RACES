package cucer.darian.f1races.koin

import cucer.darian.f1races.core.networking.repository.Repository
import dalian.razvan.cucer.twitterusersearch.core.networking.API
import dalian.razvan.cucer.twitterusersearch.core.networking.VolleyManager
import dalian.razvan.cucer.twitterusersearch.core.repository.Repository
import dalian.razvan.cucer.twitterusersearch.core.repository.RepositoryImpl
import dalian.razvan.cucer.twitterusersearch.screens.details.UserDetailsViewModel
import dalian.razvan.cucer.twitterusersearch.screens.search.UserSearchViewModel
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