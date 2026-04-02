package com.codedialer.secretcode.UI.Favorites

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.codedialer.secretcode.Domain.UseCase.GetAllCodesUseCase

class FavoritesViewModel(
    getAllCodesUseCase: GetAllCodesUseCase
) : ViewModel() {

    val favorites: LiveData<List<com.codedialer.secretcode.Domain.Model.SecretCode>> =
        getAllCodesUseCase().asLiveData()
}
