object QuadNumberPrinter extends App {
  var counter = 0

  def next:Int = synchronized {
    counter = counter + 1
    counter
  }

  for(i <- 1 to 5){
    new Thread(() => for(j <- 1 to 20000){
      println(Thread.currentThread().getName() +": " + next)
    }).start()
  }
}
