object QuadNumberPrinter extends App {
  def countUp(threadNo: Int): Unit = {
    for (i <- 1 to 100000) {
      println(s"thread ${threadNo}: ${i}")
    }
  }

  for (i <- 0 to 4) {
    new Thread(() => {countUp(i)}).start()
  }
}
