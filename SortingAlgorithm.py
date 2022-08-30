array = [9, 1, 4, 1, 3, 0, 5]

placeholder = 0

for x in range(7):
    for y in range(7):
        if array[x] < array[y]:
            placeholder = array[x]
            array[x] = array[y]
            array[y] = placeholder

print(array)