#include <iostream>
#include <string>
using namespace std;

class GranFather{
  public:
  string name;
  int age;
  
  GranFather(string name, int age) : name(name), age(age){}
  GranFather() : GranFather("A",99){}
  
  void GranFatherInfo(){
    cout << "GranFather: " << name << ", " << age << endl;
  }
  
  class Uncle{
    public:
    string name;
    int age;
    
    Uncle(string name, int age) : name(name), age(age){}
    Uncle() : Uncle("B",88){}
    
    void UncleInfo(){
      cout << "Uncle: " << name << ", " << age << endl;
    }
  };
  
  class Father{
    public:
    string name;
    int age;
    
    Father(string name, int age) : name(name), age(age){}
    Father() : Father("C",77){}
    
    void Fatherinfo(){
      cout << "Father: " << name << ", " << age << endl;
    }
    
    class Brother{
      public:
      string name;
      int age;
      
      Brother(string name, int age) : name(name), age(age){}
      Brother() : Brother("D",66){}
      
      void BrotherInfo(){
        cout << "Brother: " << name << ", " << age << endl;
      }
      
      class Niece{
        public:
        string name;
        int age;
        
        Niece(string name, int age) : name(name), age(age){}
        Niece() : Niece("E",55){}
        
        void NieceInfo(){
          cout << "Niece: " << name << ", " << age << endl;
        }
      };
    };
    
    class Me{
      public:
      string name;
      int age;
      
      Me(string name, int age) : name(name), age(age){}
      Me() : Me("F",44){}
      
      void MeInfo(){
        cout << "Me: " << name << ", " << age << endl;
      }
      
      class MyDog{
        public:
        string name;
        int age;
        
        MyDog(string name, int age) : name(name), age(age){}
        MyDog() : MyDog("G", 33){}
        
        void MyDogInfo(){
          cout << "MyDog: " << name << ", " << age << endl;
        }
      };
    };
  };
};

int main() 
{
    GranFather gf;
    gf.GranFatherInfo();
    
    GranFather::Uncle u;
    u.UncleInfo();
    
    GranFather::Father f;
    f.Fatherinfo();
    
    GranFather::Father::Brother b;
    b.BrotherInfo();
    
    GranFather::Father::Brother::Niece n;
    n.NieceInfo();
    
    GranFather::Father::Me m;
    m.MeInfo();
    
    GranFather::Father::Me::MyDog md;
    md.MyDogInfo();
}
