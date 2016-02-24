# A. New Year Candles
# time limit per test1 second
# memory limit per test256 megabytes
# inputstandard input
# outputstandard output
# Vasily the Programmer loves romance, so this year he decided to illuminate his room with candles.
#
# Vasily has a candles.When Vasily lights up a new candle, it first burns for an hour and then it goes out. Vasily is smart, so he can make b went out candles into a new candle. As a result, this new candle can be used like any other new candle.
#
# Now Vasily wonders: for how many hours can his candles light up the room if he acts optimally well? Help him find this number.
#
# Input
# The single line contains two integers, a and b (1 ≤ a ≤ 1000; 2 ≤ b ≤ 1000).
#
# Output
# Print a single integer — the number of hours Vasily can light up the room for.


def solve_the_problem():

    result = 0
    a, b = [int(x) for x in input().split()]
    result += a
    while a >= b:
        carry = a % b
        a = int(a/b)
        result += a
        a += carry


    print(result)



if __name__ == "__main__":
    solve_the_problem()

123 + 24 + 5 + 1