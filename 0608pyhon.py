def three_args(*, var1=None, var2=None, var3=None):

    
    arguments = []
    if var1 is not None:
        arguments.append(f"var1 = {var1}")
    if var2 is not None:
        arguments.append(f"var2 = {var2}")
    if var3 is not None:
        arguments.append(f"var3 = {var3}")

    if arguments:
        print("Переданы аргументы: " + ", ".join(arguments))

# Примеры вызова функции:
three_args(var1=2, var3=10)
three_args(var1=3, var2=7)
three_args(var2=5)
three_args(var3=12, var1=8, var2=6)
