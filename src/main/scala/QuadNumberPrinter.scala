object QuadNumberPrinter extends App {
  for (i <- 1 to 4) {
    new Thread(() => for (j <- 1 to 100000) println("thread " + i + ": " + j)).start()
  }
}
