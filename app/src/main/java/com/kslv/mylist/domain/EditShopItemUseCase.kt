package com.kslv.mylist.domain

class EditShopItemUseCase (private val shopListRepository : ShopListRepository) {
    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)

    }
}