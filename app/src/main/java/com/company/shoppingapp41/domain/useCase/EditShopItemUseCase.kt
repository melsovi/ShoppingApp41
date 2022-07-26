package com.company.shoppingapp41.domain.useCase

import com.company.shoppingapp41.domain.model.ShopItem
import com.company.shoppingapp41.domain.repository.ShopListRepository

class EditShopItemUseCase(private val shopEditRepository: ShopListRepository) {
    suspend fun editShopItem(shopItem: ShopItem) {
        shopEditRepository.editShopItem(shopItem)
    }
}