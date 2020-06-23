object QuadNumberPrinter extends App {
  for(i <- 1 to 10){
    new Thread(() => for(j <- 1 to 100000)  println(s"thread ${i}: ${j}")).start()
  }
}
