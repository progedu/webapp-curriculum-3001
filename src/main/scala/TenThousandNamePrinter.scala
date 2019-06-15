object TenThousandNamePrinter extends App {

  for (i <- 1 to 10000) {
    val thread = new Thread(() => {
      Thread.sleep(1000)
      println(Thread.currentThread().getName)
    })
    thread.start()
  }

}