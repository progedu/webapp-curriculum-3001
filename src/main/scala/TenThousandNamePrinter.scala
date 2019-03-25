object TenThousandNamePrinter extends App {
  def printOwnThread():String = {
    Thread.currentThread.getName
  }

  for(i <-1 to 10000) {
    new Thread(() => {
      Thread.sleep(10000)
      println(printOwnThread())
    }).start()
  }
}
