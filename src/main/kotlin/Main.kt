fun main() {
    var calculator = Calculator()
    var b=calculator.add(5757,9786)
    println(b)
    var c =calculator.divide(578,8)
    println(c)
    var d =calculator.multiply(776,9)
    println(d)
    var e =calculator.subtraction(676686,98787)
    println(e)
}

class Calculator{
    fun add(num1:Int,num2:Int):Int{
        return num1+num2
    }
    fun multiply(num1:Int,num2:Int):Int{
        return num1*num2
    }
    fun divide(num1:Int,num2:Int):Int{
        return num1/num2
    }
    fun subtraction(num1:Int,num2:Int):Int{
        return num1-num2
    }
}