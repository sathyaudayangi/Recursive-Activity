object Addition extends App{

    def sum(n:Int):Int = {
        if(n==1) {
            1
        }
        else{
            n+sum(n-1)
        }

    }

    print(sum(5))

}