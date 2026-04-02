package com.codedialer.secretcode.UI.Categories

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.codedialer.secretcode.Domain.UseCase.GetCategoriesUseCase

class CategoriesViewModel(
    getCategoriesUseCase: GetCategoriesUseCase
) : ViewModel() {

    val categories: LiveData<List<com.codedialer.secretcode.Domain.Model.Category>> =
        getCategoriesUseCase().asLiveData()
}
