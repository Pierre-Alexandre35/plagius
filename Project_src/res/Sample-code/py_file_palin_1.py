num = input('Enter any number : ')
try:
    val = int(num)
    if num == str(num)[::-1]:
        print('The given number is PALINDROME')
    else:
        print("That's not a valid number, Try Again X")

except:
    x = 3