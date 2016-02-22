# B. Taxi
# time limit per test3 seconds
# memory limit per test256 megabytes
# inputstandard input
# outputstandard output
# After the lessons n groups of schoolchildren went outside and decided to visit Polycarpus to celebrate his birthday. We know that the i-th group consists of si friends (1 ≤ si ≤ 4), and they want to go to Polycarpus together. They decided to get there by taxi. Each car can carry at most four passengers. What minimum number of cars will the children need if all members of each group should ride in the same taxi (but one taxi can take more than one group)?
#
# Input
# The first line contains integer n (1 ≤ n ≤ 105) — the number of groups of schoolchildren. The second line contains a sequence of integers s1, s2, ..., sn (1 ≤ si ≤ 4). The integers are separated by a space, si is the number of children in the i-th group.
#
# Output
# Print the single number — the minimum number of taxis necessary to drive all children to Polycarpus.

import math


def calculate_frequency(list):
    res = [0, 0, 0, 0]

    for i in list:
        res[i - 1] += 1
    return res

# TODO in progress
def solve_the_problem():
    n = input()

    children_in_group = [int(x) for x in input().split(' ')]

    res = 0

    freq_list = calculate_frequency(children_in_group)
    # add the group with 4 children
    res += freq_list[3]
    freq_list[3] = 0

    # add group with 3
    if freq_list[2] < freq_list[0]:
        res += freq_list[2]
        freq_list[0] -= freq_list[2]
        freq_list[2] = 0

        res += int(freq_list[1] / 2)
        res += math.ceil((freq_list[0] + freq_list[1] % 2) / 4)
    else:
        res += freq_list[0]
        freq_list[2] = freq_list[2] - freq_list[0]
        freq_list[0] = 0

        res += freq_list[2]
        res += math.ceil(freq_list[1] / 2)


    print(int(res))


if __name__ == "__main__":
    solve_the_problem()
