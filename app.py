# summation of 1 to N
# time complexity of this algorithms is O(n)

n = int(input("Enter a number: "))

sumOfOneToN = 0

for i in range(n + 1):
    sumOfOneToN += i

print(f"The sum of 1 to {n} is {sumOfOneToN}")

# summation of 1 to N
# time complexity of this algorithms is O(1)

n = int(input("Enter a number: "))

sumOfOneToN = int(n * (n + 1) / 2)
print(f"The sum of 1 to {n} is {sumOfOneToN}")

