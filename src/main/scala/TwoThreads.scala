object TwoThreads extends App {
  var now: Long = 0L

  val threadA = new Thread(() => {
    println("start threadA")
    Thread.sleep(1000)
    now = System.currentTimeMillis()
    println("end threadA")
  })

  val threadB = new Thread(() =>{
    println("start threadB")
    threadA.join()
    println(now.toString())
    println("end threadB")
  })

  threadA.start()
  threadB.start()
}
