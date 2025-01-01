package com.mobdev.weatherproject.domain.models

import com.google.gson.annotations.SerializedName

data class CountryModel (
    @SerializedName("country")  val countryId: String
)
