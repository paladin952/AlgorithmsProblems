# A. Tram
# time limit per test2 seconds
# memory limit per test256 megabytes
# inputstandard input
# outputstandard output
# Linear Kingdom has exactly one tram line. It has n stops, numbered from 1 to n in the order of tram's movement. At the i-th stop ai passengers exit the tram, while bi passengers enter it. The tram is empty before it arrives at the first stop. Also, when the tram arrives at the last stop, all passengers exit so that it becomes empty.

# Your task is to calculate the tram's minimum capacity such that the number of people inside the tram at any time never exceeds this capacity. Note that at each stop all exiting passengers exit before any entering passenger enters the tram.

# Input
# The first line contains a single number n (2 ≤ n ≤ 1000) — the number of the tram's stops.

# Then n lines follow, each contains two integers ai and bi (0 ≤ ai, bi ≤ 1000) — the number of passengers that exits the tram at the i-th stop, and the number of passengers that enter the tram at the i-th stop. The stops are given from the first to the last stop in the order of tram's movement.

# The number of people who exit at a given stop does not exceed the total number of people in the tram immediately before it arrives at the stop. More formally, . This particularly means that a1 = 0.
# At the last stop, all the passengers exit the tram and it becomes empty. More formally, .
# No passenger will enter the train at the last stop. That is, bn = 0.

def solve_the_problem():
	n = int(input())

	max_passagers_in_tran = 0
	total_passagers_in_tran_at_a_moment = 0
	for i in range(0, n):
		out, into = [int(x) for x in input().split(' ')]
		total_passagers_in_tran_at_a_moment -= out
		total_passagers_in_tran_at_a_moment += into
		if max_passagers_in_tran < total_passagers_in_tran_at_a_moment:
			max_passagers_in_tran = total_passagers_in_tran_at_a_moment
	print(max_passagers_in_tran)


if __name__ == "__main__":
	solve_the_problem()