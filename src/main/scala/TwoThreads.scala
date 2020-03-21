object TwoThreads extends App {
  var now: Long = 0L

  val threadA = new Thread(() => synchronized {
    Thread.sleep(1000)
    now = System.currentTimeMillis
  })
  val threadB = new Thread(() => {
    var old = 0L
    while (true) synchronized {
      if (now != old) {
        println(now)
        old = now
      }
    }
  })

  threadA.start()
  threadB.start()
}
