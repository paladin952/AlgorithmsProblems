# A. Epic Game
# time limit per test2 seconds
# memory limit per test256 megabytes
# inputstandard input
# outputstandard output
# Simon and Antisimon play a game. Initially each player receives one fixed positive integer that doesn't change throughout the game.
# Simon receives number a and Antisimon receives number b. They also have a heap of n stones. The players take turns to make a move and 
# Simon starts. During a move a player should take from the heap the number of stones equal to the greatest common divisor of the fixed 
# number he has received and the number of stones left in the heap. A player loses when he cannot take the required number of stones (i. e. the heap has strictly less stones left than one needs to take).

# Your task is to determine by the given a, b and n who wins the game.

# Input
# The only string contains space-separated integers a, b and n (1 ≤ a, b, n ≤ 100) — the fixed numbers Simon and Antisimon have received correspondingly and the initial number of stones in the pile.

# Output
# If Simon wins, print "0" (without the quotes), otherwise print "1" (without the quotes).

from fractions import gcd

def solve_the_problem():
	a, b, n = [int(x) for x in input().split(' ')]

	turn = 0

	while True:
		remove_stones = 0
		if turn == 0:
			remove_stones = gcd(a, n)
		else:
			remove_stones = gcd(b, n)

		n -= remove_stones

		if n < 0:
			if turn == 0:
				print(1)
				return
			else:
				print(0)
				return
		
		if turn == 0:
			turn = 1
		else:
			turn = 0




  


if __name__ == "__main__":
    solve_the_problem()