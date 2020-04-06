object QuadNumberPrinter extends App {

    def printCounter : Unit = {
        for(i <- 1 to 100000){ 
            println(s"${Thread.currentThread.getName} : ${i}")
    }}

    for (i <- 1 to 4) {
        new Thread(()=> printCounter).start()
    }

}
