while True:
    try:
        a=input("Enter value of a: ")
        b=input("Enter value of b: ")
        a = int(a)
        b = int(b)
        break
    except ValueError:
        print("Error in input")

i = a + 1
while(i<b):
    if(i%2==0):
        print(str(i), end=" ")
    i+=1
