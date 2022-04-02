package cucer.darian.f1races.core.networking.repository.models

data class Main(
    val grnd_level: Double,
    val humidity: Int,
    val pressure: Double,
    val sea_level: Double,
    val temp: Double,
    val temp_max: Double,
    val temp_min: Double
)