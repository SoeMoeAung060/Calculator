package android.example.calculator

sealed class CalculatorOperation(val symbol : String){

    object Plus : CalculatorOperation("+")
    object Subtract : CalculatorOperation("-")
    object Multiply : CalculatorOperation("×")
    object Divide : CalculatorOperation ("÷")

}
