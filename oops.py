class person:
    def __init__(self,name,age,language):
        self.name = name
        self.age = age
        self.language = language
    def info(self):
        print(f"{self.name} is {self.age} and a {self.occupation}")

class Employee:
    def __init__(self,name,id):
        self.name = name
        self.id = id
    def showDetails(self):
        print(f"The name of the employee {self.id} is {self.name}")
        
class Programmer(Employee,person):
    def showLanguage(self):
        print(f"The default language of the employee {self.id} is python")
        
e = Programmer("Sana","7089",)
e.showLanguage()

class Math:
    def __init__(self,num):
        self.num = num
    def addToNum(self,n):
        self.num = self.num + n

@staticmethod
def add(a,b):
    return a + b

a = Math(5)
print(a.num)
a.addToNum(6)
print(a.num)

print(add(5,6))

class Emp:
    comp = "Chubb"
    def __init__(self,name):
        self.name = name
        self.raise_amt = 0.02
    def show(self):
        print(f"name of the employee is {self.name} and the raise amount is {self.raise_amt} at {self.comp}")
        
a = Emp("Satyam")
a.raise_amt = 0.03
a.show()
b = Emp("Bhuvan")
b.show()

class Parent:
    def parentMethod(self):
        print("This is the parent method")

class Child(Parent):
    def parentMethod(self):
        print("sana")
        super().parentMethod()
    def childMethod(self):
        print("Child method this is")
        super().parentMethod()

child_obj = Child()
child_obj.childMethod()
child_obj.parentMethod()

print(5 + 2)
print(5 - 2)
print(5 * 2)
print(5 / 2) # floating point ans
print(5 // 2) # integer ans 
print(5 % 2) # modulo : remiander operator
print(5 ** 2) # power operator returns 5 ^ 2 = 25

print(5 == 2)
print( 5 > 2)
print(5 < 2)
print(5 >= 2)
print(5 <= 2)
print(5 != 2)

print(5 > 2 or 2 > 1)
print(5 > 2 and 2 < 1)
print(not 2 > 3)

nums = range(5)
print(nums)

i = 1
while i <= 4:
    print(i)
    i = i + 1

i = 1
while i < 5:
    print(i * "*")
    i = i + 1
    
m = [1,2,3,4,5]
print(m[0 : 4])
print(m[2 : 3])

m = [95,98,97]
m.append(87)
m.insert(0,99)
print(87 in m)

ids = ["402","407","409","500","503","507"]
for id in ids:
    if id == "500":
        break
    print(id)
print("==============")
for id in ids:
    if id == "407":
        continue
    print(id)
    
tuple_marks = (95,98,32,96,97,90,97,92,45,97,46)
print(tuple_marks.count(97))
print(tuple_marks.index(32))

#[] = list
#() = tuple optional 
# if person = "sana","satyam" : tuple by default
#{} = set

m = {95,98,97,90,97}

for score in m:
    print(score)
    
m = {"eng" : 95, "chem" : 98}
print(m["chem"])
m["physics"] = 97
print(m)

m["physics"] = 99
print(m)