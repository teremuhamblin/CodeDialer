package com.codedialer.secretcode.Data.Mapper

import com.codedialer.secretcode.Data.Local.entities.SecretCodeEntity
import com.codedialer.secretcode.Data.Local.entities.CategoryEntity
import com.codedialer.secretcode.Domain.Model.SecretCode
import com.codedialer.secretcode.Domain.Model.Category

fun SecretCodeEntity.toDomain() = SecretCode(
    id = id,
    code = code,
    description = description,
    categoryId = categoryId,
    isFavorite = isFavorite
)

fun SecretCode.toEntity() = SecretCodeEntity(
    id = id,
    code = code,
    description = description,
    categoryId = categoryId,
    isFavorite = isFavorite
)

fun CategoryEntity.toDomain() = Category(
    id = id,
    name = name
)
