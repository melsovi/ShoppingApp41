package com.company.shoppingapp41.domain.useCase

import androidx.lifecycle.LiveData
import com.company.shoppingapp41.domain.model.ShopItem
import com.company.shoppingapp41.domain.repository.ShopListRepository

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): LiveData<List<ShopItem>> {
        return shopListRepository.getShopList()
    }
}