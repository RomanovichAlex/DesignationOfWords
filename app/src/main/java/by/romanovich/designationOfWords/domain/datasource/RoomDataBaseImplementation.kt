package by.romanovich.designationOfWords.domain.datasource

import by.romanovich.designationOfWords.data.DataModel
import io.reactivex.Observable

class RoomDataBaseImplementation : DataSource<List<DataModel>> {
    override fun getData(word: String): Observable<List<DataModel>> {
        TODO("not implemented") // To change body of created functions use File
// | Settings | File Templates.
    }
}