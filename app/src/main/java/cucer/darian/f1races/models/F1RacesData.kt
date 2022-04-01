package cucer.darian.f1races.models

data class F1RacesData(
    val calctime: Double,
    val cnt: Int,
    val cod: String,
    val list: List<Race>,
)