import org.scalatest.FunSuite

class GreeterTest extends FunSuite {

  test("sayHello says hello") {
    assert(Greeter.sayHello == "hello")
  }

}
