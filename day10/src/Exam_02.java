class A02{}
interface B02{}

// Ŭ������ Ŭ������ ��ӹ��� �� �ִ�.
class C02 extends A02{}

// Ŭ������ �������̽��� ��ӹ��� �� �ִ�.
class D02 implements B02{}

// Ŭ������ Ŭ������ ��ӹް� �������̽��� ���� ��ӹ��� �� �ִ�.
class E02 extends A02 implements B02{}

// �������̽��� �������̽��� ��ӹ��� �� �ִ�.
interface F02 extends B02{}

// �������̽��� �������̽��� ���߻�� ���� �� �ִ�.
interface G02 extends B02, F02{}

// ��Ŭ������ �������̽��� ���߻�� ���� �� �ִ�.
class H02 implements B02, F02, G02{}

// Ŭ������ Ŭ������ ��ӹް� �������̽��� ���߻�� ���� �� �ִ�.
class I02 extends A02 implements B02, F02{}

public class Exam_02 {

}
