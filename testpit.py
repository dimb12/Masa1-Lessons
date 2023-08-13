import random
num1 = random.randrange(1, 10) 
num2 = random.randrange(10, 100)

# Правильный ответ
correct_answer = num1 * num2

# Запрос ответа у пользователя
user_answer = int(input(f"Сколько будет {num1} * {num2}? "))

# Проверка ответа пользователя
if user_answer == correct_answer:
    print("Верно! Поздравляю!")
else:
    print(f"Ошибка! Правильный ответ: {correct_answer}")
