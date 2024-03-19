n = int(input())

for i in range(n) :
    str = input()
    parts = str.split()
    k = int(parts[0])
    text = parts[1]

    for j in range(len(text)) :
        print(text[j]*k,end= "")
    print()
