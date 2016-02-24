# A. George and Accommodation
# time limit per test1 second
# memory limit per test256 megabytes
# inputstandard input
# outputstandard output
# George has recently entered the BSUCP (Berland State University for Cool Programmers). George has a friend Alex who has also entered the university. Now they are moving into a dormitory.
#
# George and Alex want to live in the same room. The dormitory has n rooms in total. At the moment the i-th room has pi people living in it and the room can accommodate qi people in total (pi ≤ qi). Your task is to count how many rooms has free place for both George and Alex.
#
# Input
# The first line contains a single integer n (1 ≤ n ≤ 100) — the number of rooms.
#
# The i-th of the next n lines contains two integers pi and qi (0 ≤ pi ≤ qi ≤ 100) — the number of people who already live in the i-th room and the room's capacity.
#
# Output
# Print a single integer — the number of rooms where George and Alex can move in.


def solve_the_problem():
    rooms_nr = int(input())

    res = 0
    for i in range(0, rooms_nr):
        people, capacity = [int(x) for x in input().split(' ')]
        if capacity - people >= 2:
            res += 1

    print(res)

if __name__ == "__main__":
    solve_the_problem()
