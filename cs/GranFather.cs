using System;

class GranFather{
  String name;
  int age;
  
  public GranFather(String name, int age){
    this.name = name;
    this.age = age;
  }
  
  public GranFather() : this("A", 99){
  }
  
  public void GranFatherInfo(){
    Console.WriteLine($"GranFather: {name}, {age}");
    
  }
    
    class Uncle{
      String name;
      int age;
      
      public Uncle(String name, int age){
        this.name = name;
        this.age = age;
      }
      
      public Uncle() : this("B", 88){
      }
      
      public void UncleInfo(){
        Console.WriteLine($"Uncle: {name}, {age}");
        
      }
    }
    
    class Father{
      String name;
      int age;
      
      public Father(String name, int age){
        this.name = name;
        this.age = age;
      }
      
      public Father() : this("C", 77){
      }
      
      public void FatherInfo(){
        Console.WriteLine($"Father: {name}, {age}");
      }
      
      public class Brother{
        String name;
        int age;
        
        public Brother(String name, int age){
          this.name = name;
          this.age = age;
        }
        
        public Brother() : this("D", 66){
        }
        
        public void BrotherInfo(){
          Console.WriteLine($"Brother: {name}, {age}");
          
        }
        
        public class Niece{
          String name;
          int age;
          
          public Niece(String name, int age){
            this.name = name;
            this.age = age;
          }
          
          public Niece() : this("E", 55){
          }
          
          public void NieceInfo(){
            Console.WriteLine($"Niece: {name}, {age}");
          }
        }
      }
      
      public class Me{
        String name;
        int age;
        
        public Me(String name, int age){
          this.name = name;
          this.age = age;
        }
        
        public Me() : this("F", 44){
        }
        
        public void MeInfo(){
          Console.WriteLine($"Me: {name}, {age}");
          
        }
        
        public class MyDog{
          String name;
          int age;
          
          public MyDog(String name, int age){
            this.name = name;
            this.age = age;
          }
          
          public MyDog() : this("G", 33){
          }
          
          public void MyDogInfo(){
            Console.WriteLine($"MyDog: {name}, {age}");
            
          }
        } 
      }
    }
  
  public static void Main (String[] args) {
  
    var gf = new GranFather();
    gf.GranFatherInfo();

    var u = new GranFather.Uncle();
    u.UncleInfo();

    var f = new GranFather.Father();
    f.FatherInfo();

    var b = new GranFather.Father.Brother();
    b.BrotherInfo();

    var n = new GranFather.Father.Brother.Niece();
    n.NieceInfo();

    var m = new GranFather.Father.Me();
    m.MeInfo();

    var d = new GranFather.Father.Me.MyDog();
    d.MyDogInfo();

  }
}