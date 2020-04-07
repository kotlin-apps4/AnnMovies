package com.example.annmovies.data.repository.category

import com.example.annmovies.data.hardcoded.category.CategoryDataSet
import com.example.annmovies.domain.model.Category
import com.example.annmovies.domain.repository.category.CategoryRepository
import io.reactivex.rxjava3.core.Single

/**
 * Created by anahi.salgado on 23/03/2020
 */
class CategoryRepositoryImpl: CategoryRepository {
    override fun getCategories(): Single<List<Category>> {
        return Single.just(CategoryDataSet.CATEGORIES)
    }
}