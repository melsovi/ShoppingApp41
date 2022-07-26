package com.company.shoppingapp41.data.local

import androidx.lifecycle.LiveData
import androidx.room.*
import com.company.shoppingapp41.data.model.ShopItemDBModel

@Dao
interface ShopItemDao {

    @Query("SELECT * FROM shop_item")
    fun getAll(): LiveData<List<ShopItemDBModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addShopItem(shopItemDBModel: ShopItemDBModel)

    @Delete
    suspend fun deleteShopItem(shopItemDBModel: ShopItemDBModel)

    @Update
    suspend fun editShopItem(shopItemDBModel: ShopItemDBModel)
}