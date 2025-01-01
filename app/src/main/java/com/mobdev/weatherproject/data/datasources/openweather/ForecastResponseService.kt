package com.mobdev.weatherproject.data.datasources.openweather

import com.mobdev.weatherproject.domain.models.ForecastResponseModel
import com.mobdev.weatherproject.utils.API_KEY
import com.mobdev.weatherproject.utils.LANG
import com.mobdev.weatherproject.utils.UNITS
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject

class ForecastResponseService @Inject constructor(
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO,
    private val api: ApiClient
) {
    suspend fun getForecastResponse(latitude: Float, longitude: Float): ForecastResponseModel {
        return withContext(dispatcher) {
            val response: Response<ForecastResponseModel> = api.getForecastResponse(latitude, longitude, API_KEY, UNITS, LANG)
            response.body()!!
        }
    }

    suspend fun getForecastResponse(geoId: String): ForecastResponseModel {
        return withContext(dispatcher) {
            val response: Response<ForecastResponseModel> = api.getForecastResponse(geoId, API_KEY, UNITS, LANG)
            response.body()!!
        }
    }

}
