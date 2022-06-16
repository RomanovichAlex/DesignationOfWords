package by.romanovich.designationOfWords.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.romanovich.designationOfWords.data.AppState
import by.romanovich.designationOfWords.presenter.Presenter
import by.romanovich.designationOfWords.viewModel.BaseViewModel

abstract class BaseActivity<T : AppState> : AppCompatActivity() {
// В каждой Активити будет своя ViewModel, которая наследуется от BaseViewModel
    abstract val model: BaseViewModel<T>
// Каждая Активити будет отображать какие-то данные в соответствующем состоянии
    abstract fun renderData(appState: T)
}

















   //MVP
    /*// Храним ссылку на презентер
    protected lateinit var presenter: Presenter<T, View>
    protected abstract fun createPresenter(): Presenter<T, View>
    abstract override fun renderData(appState: AppState)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = createPresenter()
    }
    // Когда View готова отображать данные, передаём ссылку на View в презентер
    override fun onStart() {
        super.onStart()
        presenter.attachView(this)
    }
    // При пересоздании или уничтожении View удаляем ссылку, иначе в презентере
// будет ссылка на несуществующую View
    override fun onStop() {
        super.onStop()
        presenter.detachView(this)
    }
}*/
