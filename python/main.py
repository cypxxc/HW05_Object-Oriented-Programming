class GranFather:
  def __init__(self,name="A", age=99):
    self.name = name
    self.age = age
  def GranFatherInfo(self):
    print(f"GranFather: {self.name},{self.age}")
    
  class Uncle:
    def __init__(self,name="B", age=88):
      self.name = name
      self.age = age
    def UncleInfo(self):
      print(f"Uncle: {self.name}, {self.age}")
    
  class Father:
    def __init__(self,name="C", age=77):
      self.name = name
      self.age = age
    def FatherInfo(self):
      print(f"Father: {self.name}, {self.age}")
    
    class Brother:
      def __init__(self,name="D", age=66):
        self.name = name
        self.age = age
      def BrotherInfo(self):
        print(f"Brother: {self.name}, {self.age}")
        
      class Niece:
        def __init__(self,name="E",age=55):
          self.name = name
          self.age = age
        def NieceInfo(self):
          print(f"Niece: {self.name},{self.age}")
    
    class Me:
      def __init__(self,name="F",age=44):
        self.name = name
        self.age = age
      def MeInfo(self):
        print(f"Me: {self.name},{self.age}")
        
      class MyDog:
        def __init__(self,name="G",age=33):
          self.name = name
          self.age = age
        def MyDogInfo(self):
          print(f"MyDog: {self.name},{self.age}")

gf = GranFather()
gf.GranFatherInfo()

u = GranFather.Uncle()
u.UncleInfo()

f = GranFather.Father()
f.FatherInfo()

b = GranFather.Father.Brother()
b.BrotherInfo()

n = GranFather.Father.Brother.Niece()
n.NieceInfo()

m = GranFather.Father.Me()
m.MeInfo()

md = GranFather.Father.Me.MyDog()
md.MyDogInfo()