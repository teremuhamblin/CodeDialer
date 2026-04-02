package com.codedialer.secretcode.UI.Home

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.codedialer.secretcode.Domain.UseCase.GetAllCodesUseCase

class HomeViewModel(
    getAllCodesUseCase: GetAllCodesUseCase
) : ViewModel() {

    val codes: LiveData<List<com.codedialer.secretcode.Domain.Model.SecretCode>> =
        getAllCodesUseCase().asLiveData()
}
