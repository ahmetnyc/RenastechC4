package day27;

public class Test {
    public static void main(String[] args) {
      My m = new Foo();
      Tempo t = (Tempo)m;
      Foo f = (Foo)t;
    }
}
interface  My{}
abstract class  Tempo implements My{}
class Foo extends Tempo{}