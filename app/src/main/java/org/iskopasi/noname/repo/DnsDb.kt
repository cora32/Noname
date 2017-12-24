package org.iskopasi.noname.repo

import org.iskopasi.noname.App
import org.iskopasi.noname.entities.DnscItem

/**
 * Created by cora32 on 23.12.2017.
 */
class DnsDb {
    fun getData() = App.db.dnsDao().getData()
    fun saveData(list: List<DnscItem>) = App.db.dnsDao().saveData(list)
}