# C. Lucky Numbers
# time limit per test0.5 seconds
# memory limit per test64 megabytes
# inputstandard input
# outputstandard output
# The numbers of all offices in the new building of the Tax Office of IT City will have lucky numbers.
#
# Lucky number is a number that consists of digits 7 and 8 only. Find the maximum number of offices in the new building of the Tax Office given that a door-plate can hold a number not longer than n digits.
#
# Input
# The only line of input contains one integer n (1 ≤ n ≤ 55) — the maximum length of a number that a door-plate can hold.
#
# Output
# Output one integer — the maximum number of offices, than can have unique lucky numbers not longer than n digits.
#

from math import factorial


def number_permutations(n, k):
    """
    return the number of ordered permutations of
    k items taken from a population of size n
    uses algorithm n!/(n-k)!
    """
    return factorial(n) / factorial(n - k)


def solve_the_problem():
    n = int(input())
    res = 0

    for i in range(1, n + 1):
        res += int(number_permutations(i, i))
    print(res * 2)


if __name__ == "__main__":
    solve_the_problem()
