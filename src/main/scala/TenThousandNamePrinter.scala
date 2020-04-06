object TenThousandNamePrinter extends App {

    println(s"start ${Thread.currentThread.getName}")

    def printName: Unit = {
        Thread.sleep(1000)
        println(s"${Thread.currentThread.getName()}")
    }

    for (i <- 1 to 10000){
        new Thread(()=>printName).start()
    }

    println(s"end ${Thread.currentThread.getName}")
}