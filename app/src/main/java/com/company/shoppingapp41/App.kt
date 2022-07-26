package com.company.shoppingapp41

import android.app.Application
import androidx.room.Room
import com.company.shoppingapp41.data.local.AppDataBase
import com.company.shoppingapp41.di.
import com.company.shoppingapp41.di.NewComponent
import com.company.shoppingapp41.domain.model.ShopItem
import dagger.internal.DaggerCollections
import javax.inject.Inject

class App : Application() {

    @Inject
    lateinit var shopItem: ShopItem

    init {
        DaggerNewComponent.create().inject(this)
    }

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(applicationContext, AppDataBase::class.java, "dataBase").fallbackToDestructiveMigration().build()
    }


    companion object {
        lateinit var db: AppDataBase
    }
}