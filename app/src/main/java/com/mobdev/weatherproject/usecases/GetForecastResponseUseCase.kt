package com.mobdev.weatherproject.usecases

import com.mobdev.weatherproject.data.repositories.ForecastResponseRepository
import com.mobdev.weatherproject.domain.models.ForecastResponseModel
import javax.inject.Inject

class GetForecastResponseUseCase @Inject constructor(
    private val repository: ForecastResponseRepository
) {

    suspend fun getForecastResponse(latitude: Float, longitude: Float): ForecastResponseModel =
        repository.getForecastResponse(latitude, longitude)

    suspend fun getForecastResponse(geoId: String): ForecastResponseModel =
        repository.getForecastResponse(geoId)

}
