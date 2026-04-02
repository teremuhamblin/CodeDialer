package com.codedialer.secretcode.UI.Categories

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.codedialer.secretcode.Domain.Model.Category
import com.codedialer.secretcode.Domain.UseCase.GetCategoriesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CategoriesViewModel @Inject constructor(
    getCategoriesUseCase: GetCategoriesUseCase
) : ViewModel() {

    val categories: LiveData<List<Category>> =
        getCategoriesUseCase().asLiveData()
}
