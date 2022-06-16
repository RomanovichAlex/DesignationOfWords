package by.romanovich.designationOfWords.data

import by.romanovich.designationOfWords.domain.datasource.DataSource
import by.romanovich.designationOfWords.domain.repository.Repository
import io.reactivex.Observable

class RepositoryImplementation(private val dataSource: DataSource<List<DataModel>>) :
    Repository<List<DataModel>> {
    // Репозиторий возвращает данные, используя dataSource (локальный или
// внешний)
    override fun getData(word: String): Observable<List<DataModel>> {
        return dataSource.getData(word)
    }
}
