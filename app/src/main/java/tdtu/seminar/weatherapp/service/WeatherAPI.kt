package tdtu.seminar.weatherapp.service

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query
import tdtu.seminar.weatherapp.model.WeatherModel

//https://api.openweathermap.org/data/2.5/weather?q=saigon&appid=99295bffe6ab76b622005b35759d8796
interface WeatherAPI {
    @GET("data/2.5/weather?&units=metric&APPID=99295bffe6ab76b622005b35759d8796")
    fun getData(
        @Query("q") cityName: String): Single<WeatherModel>
}