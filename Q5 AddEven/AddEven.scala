object AddEven extends App{
    
    def IsEven(n:Int):Boolean = {
        if(n%2==0) true else false
    }

    def sum(n:Int):Int = n match {
        case 2 => n
        case x if(IsEven(n)) =>  n+sum(n-1)
        case _ => sum(n-1)
    }

    print(sum(10))

}