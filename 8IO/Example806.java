//8.1.5 装饰设计模式
class Car{
  private String carName;
  public Car(String carName){
    this.carName=carName;
  }
  public void show(){
    System.out.println("我是"+carName+",具有基本功能");
  }

}
class RadarCar{
  public Car myCar;
  public RadarCar(Car myCar){        //用一个类的构造方法接收被包装的对象
    this.myCar=myCar;
  }
  public void show(){               //实现封装的功能
    myCar.show();
    System.out.println("具有倒车雷达功能");
  }
}
public class Example806{
  public static void main(String[] args){
    Car benz=new Car("Benz");
    System.out.println("-------包装前-------");
    benz.show();
    RadarCar decoratedCar_benz=new RadarCar(benz);
    System.out.println("-------包装后-------");
    decoratedCar_benz.show();
  }
}