package cucer.darian.f1races.core.repository.models

data class F1RacesData(
    val calctime: Double,
    val cnt: Int,
    val cod: String,
    val list: List<Race>,
) {
    val id: Unit
}