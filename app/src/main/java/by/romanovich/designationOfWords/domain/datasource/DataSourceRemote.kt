package by.romanovich.designationOfWords

import by.romanovich.designationOfWords.domain.datasource.DataSource
import by.romanovich.designationOfWords.domain.datasource.RetrofitImplementation
import by.romanovich.designationOfWords.data.DataModel
import io.reactivex.Observable

// Для получения внешних данных мы будем использовать Retrofit
class DataSourceRemote(private val remoteProvider: RetrofitImplementation =
    RetrofitImplementation()) :
    DataSource<List<DataModel>> {
    override fun getData(word: String): Observable<List<DataModel>> =
        remoteProvider.getData(word)
}

