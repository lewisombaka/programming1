# num = 100
# while num != 10:
#     print("Hello World")
#     num = int(input("Enter num again: "))

# counting game
start = True
count = 0
sum = 0

while start:
    number = int(input("Enter a number: "))
    if number != 0:
        count+=1
        sum+=number
    else:
        start = False
average = sum/count
print(f"You've entered {count} numbers")
print(f"The average of the numbers is {average}")