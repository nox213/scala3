//> using options -Werror -Wnonunit-statement -Wvalue-discard
import scala.util.chaining.given
@main def main = {
  val it = Iterator.continually(42)
  it.hasNext.tap(if (_) it.next())
}