package by.romanovich.designationOfWords.domain.datasource

import by.romanovich.designationOfWords.data.DataModel
import io.reactivex.Observable

// Для локальных данных используется Room
class DataSourceLocal(private val remoteProvider: RoomDataBaseImplementation =
                          RoomDataBaseImplementation()
) :
    DataSource<List<DataModel>> {
    override fun getData(word: String): Observable<List<DataModel>> =
        remoteProvider.getData(word)
}