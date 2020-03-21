object TenThousandNamePrinter extends App {

  for (i <- 0 to 100000) {
    new Thread(() => {
      Thread.sleep(1000)
      println(Thread.currentThread().getName())
    }).start()
  }

}
