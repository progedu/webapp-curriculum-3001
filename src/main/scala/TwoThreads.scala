import java.util.concurrent.CountDownLatch

object TwoThreads extends App {
  var now: Long = 0L

  val latch = new CountDownLatch(1)

  val threadA = new Thread(() => {
    Thread.sleep(1000)
    now = System.currentTimeMillis()
    latch.countDown()
  })
  val threadB = new Thread(() => {
    latch.await()
    print(now)
  })

  threadA.start()
  threadB.start()
}
