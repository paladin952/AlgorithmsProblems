# A. Insomnia cure
# time limit per test2 seconds
# memory limit per test256 megabytes
# inputstandard input
# outputstandard output
# «One dragon. Two dragon. Three dragon», — the princess was counting. She had trouble falling asleep, and she got bored of counting lambs when she was nine.
#
# However, just counting dragons was boring as well, so she entertained herself at best she could. Tonight she imagined that all dragons were here to steal her, and she was fighting them off. Every k-th dragon got punched in the face with a frying pan. Every l-th dragon got his tail shut into the balcony door. Every m-th dragon got his paws trampled with sharp heels. Finally, she threatened every n-th dragon to call her mom, and he withdrew in panic.
#
# How many imaginary dragons suffered moral or physical damage tonight, if the princess counted a total of d dragons?
#
# Input
# Input data contains integer numbers k, l, m, n and d, each number in a separate line (1 ≤ k, l, m, n ≤ 10, 1 ≤ d ≤ 105).
#
# Output
# Output the number of damaged dragons.


def solve_the_problem():
    k = int(input())
    l = int(input())
    m = int(input())
    n = int(input())

    damage_list = [k, l, m, n]

    d = int(input())

    result = 0
    for i in range(0, d):
        for j in damage_list:
            if (i + 1) % j == 0:
                result += 1
                break

    print(result)


if __name__ == "__main__":
    solve_the_problem()
