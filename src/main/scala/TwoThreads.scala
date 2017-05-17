object TwoThreads extends App {
  var now: Long = 0L

  val threadA = new Thread(() => ??? )
  val threadB = new Thread(() => ??? )

  threadA.start()
  threadB.start()
}
