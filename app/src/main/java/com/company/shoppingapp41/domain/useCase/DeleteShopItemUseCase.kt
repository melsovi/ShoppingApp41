package com.company.shoppingapp41.domain.useCase

import com.company.shoppingapp41.domain.model.ShopItem
import com.company.shoppingapp41.domain.repository.ShopListRepository

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {
    suspend fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }
}