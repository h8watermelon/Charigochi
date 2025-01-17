package com.example.charigochi.data

import com.example.charigochi.data.network.CatFactService
import com.example.charigochi.data.network.service
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CatFactRepository @Inject constructor() {
    private val catFactService: CatFactService = service
    suspend fun getFact(language: CatFactLanguage) = withContext(Dispatchers.IO) {
        service.getFacts(language.code).data[0]
    }
}

