# num = 100
# while num != 10:
#     print("Hello World")
#     num = int(input("Enter num again: "))

# counting game
# start = True
# count = 0
# sum = 0

# while start:
#     number = int(input("Enter a number: "))
#     if number != 0:
#         count+=1
#         sum+=number
#     else:
#         start = False
# average = sum/count
# print(f"You've entered {count} numbers")
# print(f"The average of the numbers is {average}")

# * This program reads a line of text entered by the user. * It prints a list of the letters that occur in the text, * and it reports how many different letters were found.

word = input("Enter Word: ")
letter = []
new_letter = []
num = ['a','b','c']
for i in word:
    if i in num:
        if i in num:
            letter.append(i)
    else:
        new_letter.append(i)

print(new_letter)


