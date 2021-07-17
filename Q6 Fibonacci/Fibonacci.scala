object Fibonacci extends App{

    def fsq(n:Int):Any = {
        if(n>0) fsq(n-1)
        print(f(n)+ " ")
    }

    def f(n:Int):Int =n match{
        case n if(n==0) => 0
        case n if(n==1) => 1
        case n => f(n-1)+f(n-2)
    }

    fsq(10)

}