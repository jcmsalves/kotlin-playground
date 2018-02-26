package com.jcmsalves.kotlinplayground.sealedclasses

sealed class ScreenState {
    class Error : ScreenState()
    class Loading : ScreenState()
    data class Data(val someData: SomeData) : ScreenState()
}

fun setScreenState(screenState: ScreenState) {
    when (screenState) {
        is ScreenState.Loading -> { /* set loading state in the view */ }
        is ScreenState.Data -> {
            /* hide loading or error states in the view and display data*/
            //sometextView.text = screenState.someData.name
        }
    }
}
