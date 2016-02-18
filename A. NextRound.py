# A. Next Round
# time limit per test3 seconds
# memory limit per test256 megabytes
# inputstandard input
# outputstandard output
# "Contestant who earns a score equal to or greater than the k-th place finisher's score will
# advance to the next round, as long as the contestant earns a positive score..." — an excerpt from contest rules.
#
# A total of n participants took part in the contest (n ≥ k), and you already know their scores.
#  Calculate how many participants will advance to the next round.
#
# Input
# The first line of the input contains two integers n and k (1 ≤ k ≤ n ≤ 50) separated by a single space.
#
# The second line contains n space-separated integers a1, a2, ..., an (0 ≤ ai ≤ 100), where ai is
# the score earned by the participant who got the i-th place. The given sequence is non-increasing
#  (that is, for all i from 1 to n - 1 the following condition is fulfilled: ai ≥ ai + 1).
#
# Output
# Output the number of participants who advance to the next round.


def solve_the_problem():
    n, k = input().split(' ')

    result_sum = 0
    numbers = input().split(' ')
    kth_score = int(numbers[int(k)-1])

    for i in range(0, len(numbers)):
        score = int(numbers[i])
        if score >= kth_score and score > 0:
            result_sum += 1
        else:
            break

    print(result_sum)


if __name__ == "__main__":
    solve_the_problem()
