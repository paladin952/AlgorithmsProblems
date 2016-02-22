# A. Beautiful Year
# time limit per test2 seconds
# memory limit per test256 megabytes
# inputstandard input
# outputstandard output
# It seems like the year of 2013 came only yesterday. Do you know a curious fact? The year of 2013 is the first year after the old 1987 with only distinct digits.

# Now you are suggested to solve the following problem: given a year number, find the minimum year number which is strictly larger than the given one and has only distinct digits.

# Input
# The single line contains integer y (1000 ≤ y ≤ 9000) — the year number.

# Output
# Print a single integer — the minimum year number that is strictly larger than y and all it's digits are distinct. It is guaranteed that the answer exists.

from collections import Counter

def is_beautiful_year(year_as_list):
	for i in year_as_list:
		if i > 1:
			return False
	return True

def solve_the_problem():
	year = int(input())
	while True:
		year += 1
		counts = [int(x) for x in Counter(list(str(year))).values()]
		if is_beautiful_year(counts):
			print(year)
			return


if __name__ == "__main__":
    solve_the_problem()