package com.mobdev.weatherproject.data.repositories

import com.mobdev.weatherproject.data.datasources.openweather.CityInfoService
import com.mobdev.weatherproject.domain.models.CityInfoModel
import javax.inject.Inject

class CityInfoRepository @Inject constructor(
    private val api: CityInfoService
) {
    suspend fun getCityInfo(latitude: Float, longitude: Float): CityInfoModel {
        return api.getCityInfo(latitude, longitude)
    }

    suspend fun getCityInfo(geoId: String): CityInfoModel? {
        return api.getCityInfo(geoId)
    }
}