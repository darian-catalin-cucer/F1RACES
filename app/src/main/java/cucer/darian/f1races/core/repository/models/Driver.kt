package cucer.darian.f1races.core.repository.models

import com.google.gson.annotations.SerializedName

data class Driver(@SerializedName("driverName")val name: String = "",
                  @SerializedName("age") val age: Int = 0)
