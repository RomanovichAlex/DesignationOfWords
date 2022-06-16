package by.romanovich.designationOfWords.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import by.romanovich.designationOfWords.data.AppState
import by.romanovich.designationOfWords.domain.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable

abstract class BaseViewModel<T : AppState>(

    protected open val liveDataForViewToObserve: MutableLiveData<T> = MutableLiveData(),
    protected open val compositeDisposable: CompositeDisposable = CompositeDisposable(),
    protected open val schedulerProvider: SchedulerProvider = SchedulerProvider()
) : ViewModel() {// Наследуемся от ViewModel
// Метод, благодаря которому Activity подписывается на изменение данных,
// возвращает LiveData, через которую и передаются данные
open fun getData(word: String, isOnline: Boolean): LiveData<T> =
    liveDataForViewToObserve
    // Единственный метод класса ViewModel, который вызывается перед
// уничтожением Activity
    override fun onCleared() {
        compositeDisposable.clear()
    }
}

