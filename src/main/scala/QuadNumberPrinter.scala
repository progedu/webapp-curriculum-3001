object QuadNumberPrinter extends App {

  def count(i: Int): Int = {
    println(s"${Thread.currentThread.getName} : ${i}")
    if (i == 100000) i
    else
      count(i + 1)
  }

  for (i <- 1 to 4) {
    new Thread(() => count(1)).start()
  }

}
