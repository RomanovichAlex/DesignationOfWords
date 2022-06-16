package by.romanovich.designationOfWords.ui.base

import by.romanovich.designationOfWords.data.AppState

// Нижний уровень. View знает о контексте и фреймворке
interface View {
    // View имеет только один метод, в который приходит некое состояние приложения
    fun renderData(appState: AppState)
}



