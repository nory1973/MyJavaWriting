//列挙型のサンプル　二種類の定義　その２
public class Enum_sample{
  public enum animal{
    Dog,
    Cat,
    Mouse,
    Monkey
  }
  public static void main(String[] args){
    animal creature_type = animal.Cat;
    switch(creature_type){
    case Dog: System.out.println("dog!"); break;
    case Cat: System.out.println("cat!"); break;
    case Mouse: System.out.println("mouse!"); break;
    case Monkey: System.out.println("monkey!"); break;
    }
    for(animal ANIMAL : creature_type.values()) {
    System.out.println(ANIMAL);
    }
        
  }
//  protected enum animal {
//    Dog,
//    Cat,
//    Mouse,
//    Monkey
//};
}
