object TwoThreads extends App {
  var now: Long = 0L

  val threadA = new Thread(() => {
    Thread.sleep(1000)
    now = System.currentTimeMillis()
  })
  val threadB = new Thread(() => {
    while(now == 0){}
    println(now)
  })

  threadA.start()
  threadB.start()
}
