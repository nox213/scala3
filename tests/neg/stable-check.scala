object Foo {
  def one: 1 = 1
}

object Test {
  def d1 = 1 match {
    case Foo.one => true // error
  }
}