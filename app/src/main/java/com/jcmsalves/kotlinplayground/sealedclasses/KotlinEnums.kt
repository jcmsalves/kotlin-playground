package com.jcmsalves.kotlinplayground.sealedclasses

enum class BasicScreenState {
    ERROR,
    LOADING,
    DATA
}

enum class ScreenStateField(val someData: SomeData) {
    ERROR(SomeData("1", "some data 1")),
    LOADING(SomeData("2", "some data 2")),
    DATA(SomeData("3", "some data 3"))
}

fun setBasicScreenState(basicScreenState: BasicScreenState) {
    when(basicScreenState) {
        BasicScreenState.ERROR -> { /* set error state in the view */ }
        BasicScreenState.LOADING -> { /* set loading state in the view */ }
        BasicScreenState.DATA -> { /* hide loading or error states in the view */ }
    }
}

fun displayData(someData: SomeData) {
    // actually display the data in the view
    //sometextView.text = someData.name
}