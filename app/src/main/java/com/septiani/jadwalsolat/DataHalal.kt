package com.septiani.jadwalsolat

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class DataHalal {

    @SerializedName("title")
    @Expose
    var title: String? = null

    @SerializedName("nomor_sertifikat")
    @Expose
    var nomor_sertifikat: String? = null

    @SerializedName("produsen")
    @Expose
    var produsen: String? = null

    @SerializedName("berlaku_hingga")
    @Expose
    var berlaku_hingga: String? = null

    constructor() {}

    constructor(title: String, nomor_sertifikat: String, produsen: String, berlaku_hingga: String) {
        this.title = title
        this.nomor_sertifikat = nomor_sertifikat
        this.produsen = produsen
        this.berlaku_hingga = berlaku_hingga
    }
}