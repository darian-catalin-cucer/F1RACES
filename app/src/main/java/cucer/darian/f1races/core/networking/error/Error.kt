package cucer.darian.f1races.core.networking.error

import cucer.darian.f1races.utils.Constants

data class Error (@SerializedName(Constants.PARAMETERS) val parameters: String,
                  @SerializedName(Constants.MESSAGE) val message: String)