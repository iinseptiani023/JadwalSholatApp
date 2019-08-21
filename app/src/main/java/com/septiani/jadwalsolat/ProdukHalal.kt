package com.septiani.jadwalsolat

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ProdukHalal {

    @SerializedName("status")
    @Expose
    var status: String? = null

    @SerializedName("data")
    @Expose
    var data: List<DataHalal>? = null

    @SerializedName("next_page")
    @Expose
    var next_page: String? = null

    constructor() {}

    constructor(status: String, data: List<DataHalal>, next_page: String) {
        this.status = status
        this.data = data
        this.next_page = next_page
    }
}