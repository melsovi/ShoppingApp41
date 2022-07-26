package com.company.shoppingapp41.domain.useCase

import com.company.shoppingapp41.domain.model.ShopItem
import com.company.shoppingapp41.domain.repository.ShopListRepository

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {
    suspend fun getShopItem(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}