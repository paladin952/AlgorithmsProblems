# A. Petya and Strings
# time limit per test2 seconds
# memory limit per test256 megabytes
# inputstandard input
# outputstandard output
# Little Petya loves presents. His mum bought him two strings of the same size for his birthday. The strings consist of uppercase and lowercase Latin letters. Now Petya wants to compare those two strings lexicographically. The letters' case does not matter, that is an uppercase letter is considered equivalent to the corresponding lowercase letter. Help Petya perform the comparison.

# Input
# Each of the first two lines contains a bought string. The strings' lengths range from 1 to 100 inclusive. It is guaranteed that the strings are of the same length and also consist of uppercase and lowercase Latin letters.

# Output
# If the first string is less than the second one, print "-1". If the second string is less than the first one, print "1". If the strings are equal, print "0". Note that the letters' case is not taken into consideration when the strings are compared.


def calculate_solution(word1, word2):
	res = 0
	for i in range(0, len(word1)):
		if word1[i] == word2[i]:
			res = 0
		elif ord(word1[i]) < ord(word2[i]):
			return -1
		else:
			return 1
	return res

def solve_the_problem():
	s1 = input()
	s2 = input()

	print(calculate_solution(s1.lower(), s2.lower()))
	

if __name__ == "__main__":
    solve_the_problem()