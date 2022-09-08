class A02{}
interface B02{}

// 클래스는 클래스를 상속받을 수 있다.
class C02 extends A02{}

// 클래스는 인터페이스를 상속받을 수 있다.
class D02 implements B02{}

// 클래스는 클래스를 상속받고 인터페이스를 각각 상속받을 수 있다.
class E02 extends A02 implements B02{}

// 인터페이스는 인터페이스를 상속받을 수 있다.
interface F02 extends B02{}

// 인터페이스는 인터페이스를 다중상속 받을 수 있다.
interface G02 extends B02, F02{}

// ※클래스는 인터페이스를 다중상속 받을 수 있다.
class H02 implements B02, F02, G02{}

// 클래스는 클래스를 상속받고 인터페이스를 다중상속 받을 수 있다.
class I02 extends A02 implements B02, F02{}

public class Exam_02 {

}
