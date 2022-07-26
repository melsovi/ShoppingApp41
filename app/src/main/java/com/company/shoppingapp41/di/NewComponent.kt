package com.company.shoppingapp41.di

import android.app.Application
import com.company.shoppingapp41.domain.model.NameModule
import dagger.Component

@Component(modules = [NameModule::class])
interface NewComponent {
    fun inject(app: Application)
}