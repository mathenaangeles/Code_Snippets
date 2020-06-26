# Check if the number is prime by checking if it is divisibly by a number between one and itself.
def is_prime(x):
    for i in range(2, x):
        if x % i == 0:
            return False
    return True


# Print all the prime numbers from 0 to 100.
primes = [i for i in range(0, 100) if is_prime(i)]
print("Prime Numbers Between 0 and 100: \n{}\n".format(primes))

# Print the sum of all prime numbers from 0 to 100.
total = sum(primes)
print("Sum: \n{}\n".format(total))

# Get the sum of the digits of any given number.


def digit_sum(x):
    num = [int(i) for i in str(x)]
    return sum(num)


# Print the digit sum of prime numbers from 0 to 100.
sums = [digit_sum(i) for i in primes]
print("Digit Sums:\n{}\n".format(sums))

# Print all prime numbers from 0 to 100 as a single string.
print("String of Primes:\n"+"".join(map(str, primes)))
