object QuadNumberPrinter extends App {

  def run(): Unit = {
    for (i <- 1 to 100000)
      println(Thread.currentThread().getName + ": " + i)
  }
  val thread0 = new Thread(() => run())
  val thread1 = new Thread(() => run())
  val thread2 = new Thread(() => run())
  val thread3 = new Thread(() => run())
  thread0.start()
  thread1.start()
  thread2.start()
  thread3.start()

}
