package cucer.darian.f1races.core.networking.repository.models

data class F1RacesComplex(
    val clouds: Clouds,
    val coord: Coord,
    val dt: Int,
    val id: Int,
    val main: Main,
    val name: String,
    val rain: Rain,
    val weather: List<Weather>,
    val wind: Wind
)