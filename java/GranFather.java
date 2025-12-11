class GranFather{
  String name;
  int age;
  
  public GranFather(String name, int age){
    this.name = name;
    this.age = age;
  }
  
  public GranFather(){
    this("A", 99);
  }
  
  public void GranFatherInfo(){
    System.out.println("GranFather: " + name + ", " + age);
  }
    
    class Uncle{
      String name;
      int age;
      
      public Uncle(String name, int age){
        this.name = name;
        this.age = age;
      }
      
      public Uncle(){
        this("B", 88);
      }
      
      public void UncleInfo(){
        System.out.println("Uncle: " + name + ", " + age);
      }
    }
    
    class Father{
      String name;
      int age;
      
      public Father(String name, int age){
        this.name = name;
        this.age = age;
      }
      
      public Father(){
        this("C", 77);
      }
      
      public void FatherInfo(){
        System.out.println("Father: " + name + ", " + age);
      }
      
      public class Brother{
        String name;
        int age;
        
        public Brother(String name, int age){
          this.name = name;
          this.age = age;
        }
        
        public Brother(){
          this("D", 66);
        }
        
        public void BrotherInfo(){
          System.out.println("Brother: " + name + ", " + age);
        }
        
        public class Niece{
          String name;
          int age;
          
          public Niece(String name, int age){
            this.name = name;
            this.age = age;
          }
          
          public Niece(){
            this("E", 55);
          }
          
          public void NieceInfo(){
            System.out.println("Niece: " + name + ", " + age );
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
        
        public Me(){
          this("F", 44);
        }
        
        public void MeInfo(){
          System.out.println("Me: " + name + ", " + age);
        }
        
        public class MyDog{
          String name;
          int age;
          
          public MyDog(String name, int age){
            this.name = name;
            this.age = age;
          }
          
          public MyDog(){
            this("G", 33);
          }
          
          public void MyDogInfo(){
            System.out.println("MyDog: " + name + ", " + age);
          }
        } 
      }
    }
  
  public static void main (String[] args) {
  GranFather gf = new GranFather();
  gf.GranFatherInfo();

  GranFather.Uncle u = gf.new Uncle();
  u.UncleInfo();

  GranFather.Father f = gf.new Father();
  f.FatherInfo();

  GranFather.Father.Brother b = f.new Brother();
  b.BrotherInfo();

  GranFather.Father.Brother.Niece n = b.new Niece();
  n.NieceInfo();

  GranFather.Father.Me m = f.new Me();
  m.MeInfo();

  GranFather.Father.Me.MyDog md = m.new MyDog();
  md.MyDogInfo();

  }
}