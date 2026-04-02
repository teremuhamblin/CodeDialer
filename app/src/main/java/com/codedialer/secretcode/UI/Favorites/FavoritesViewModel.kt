package com.codedialer.secretcode.UI.Favorites

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.codedialer.secretcode.Domain.Model.SecretCode
import com.codedialer.secretcode.Domain.UseCase.GetAllCodesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FavoritesViewModel @Inject constructor(
    getAllCodesUseCase: GetAllCodesUseCase
) : ViewModel() {

    val favorites: LiveData<List<SecretCode>> =
        getAllCodesUseCase().asLiveData()
}
