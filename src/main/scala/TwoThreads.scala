object TwoThreads extends App {
  var now: Long = 0L

  val threadA = new Thread(() => {
    Thread.sleep(1000)
    synchronized {
      now = System.currentTimeMillis
    }
  })

  val threadB = new Thread(() => {
    val last = now
    var changed = false
    while (!changed) {
      Thread.sleep(100)
      synchronized {
        if (last != now) {
          println("now changed :" + now)
          changed = true
        }
      }
    }
  })

  threadA.start()
  threadB.start()
}
