phrasa = input("Введите фразу: ")

# Приведем все символы к нижнему регистру и удалим пробелы
phrase = phrasa.lower().replace(" ", "")


# пусть i будет первым символом в фразе, а j последним  
i = 0 
j = len(phrase) - 1
palindrome = True
while i < j:
    if phrase[i] != phrase[j]:
        palindrome = False
        break
    # двигаемся к центру фразы сравнивая символы
    i += 1
    j -= 1

if palindrome:
    print("Это палиндром!")
else:
    print("Это не палиндром!")
