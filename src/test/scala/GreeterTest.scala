
import org.scalatest.funsuite.AnyFunSuite

class GreeterTest extends AnyFunSuite {

  test("sayHello says hello") {
    assert(Greeter.sayHello == "hello")
  }

}
