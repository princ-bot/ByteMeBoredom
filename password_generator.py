import random

uppercase_letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
lowercase_letters = uppercase_letters
digits = "0123456789"
symbol = "!@#$%^&*(){}[]?"

upper, lower, nums, syms, = True, False, True, True

all = ""

if upper:
    all += uppercase_letters
if lower:
    all += lowercase_letters
if nums:
    all += digits
if syms:
    all += symbol

length = 20
amount = 1


for x in range(amount):
    password = "".join(random.sample(all, length))
    print(password)