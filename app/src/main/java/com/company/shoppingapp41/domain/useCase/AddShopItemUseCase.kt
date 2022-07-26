package com.company.shoppingapp41.domain.useCase

import com.company.shoppingapp41.domain.model.ShopItem
import com.company.shoppingapp41.domain.repository.ShopListRepository

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {
    suspend fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}