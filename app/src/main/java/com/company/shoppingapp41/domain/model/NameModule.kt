package com.company.shoppingapp41.domain.model

import dagger.Module
import dagger.Provides

@Module
class NameModule {

    @Provides
    fun provideName(name: String): String {
        return name
    }
}