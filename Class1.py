# def calculate_change(amount):
# def calculate_change(amount):
#     denominations = [200, 100, 50, 20]
#     counts = [0] * len(denominations)

#     for i, denom in enumerate(denominations):
#         while amount >= denom:
#             amount -= denom
#             counts[i] += 1

#     if amount == 0:
#         for denom, count in zip(denominations, counts):
#             print(f"{denom}x{count}", end=", ")
#     else:
#         print("Извините, но размен невозможен!")


# summa = int(input("Введите сумму в шекелях: "))
# calculate_change(summa)

# list = [1, '2', '3', 17, '5']
# sum = 0

# for i in list:
# #     if i = str:
# # i = int(i)
#     sum += i

# print("Сумма:", sum)


# my_list = [12, 33, 24, 7, 19]
# # четные
# for num in list:      
#     if num % 2 == 0:
#         print(num)
# нечетные
# for num in list:      
#     if num %  == 0:
#         print(num)
# word = 'кот'
# reversed_word = ''
# for char in word:
#     word1 = char + word1
# print(reversed_word)
# list = '0123456789'
# delete = list[1:4] + list[6:-1]
# print(delete)
# a=75
# b=93
# x=a*b
# y=a+b
# print(a, "+"b = y)
# print(a,"*",b = x)
slovo = 'синхрофазотрон'
letters_count = {}

for letter in slovo:
    if letter in letters_count:
        letters_count[letter] += 1
    else:
        letters_count[letter] = 1

print(f"Количество видов букв: {len(letters_count)}")
print("Число вхождений каждой буквы:")
for letter, count in letters_count.items():
    print(f"{letter}: {count}")