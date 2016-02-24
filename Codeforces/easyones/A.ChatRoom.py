# A. Chat room
# time limit per test2 seconds
# memory limit per test256 megabytes
# inputstandard input
# outputstandard output
# Vasya has recently learned to type and log on to the Internet. He immediately entered a chat room and decided to say hello to everybody. Vasya typed the word s. It is considered that Vasya managed to say hello if several letters can be deleted from the typed word so that it resulted in the word "hello". For example, if Vasya types the word "ahhellllloou", it will be considered that he said hello, and if he types "hlelo", it will be considered that Vasya got misunderstood and he didn't manage to say hello. Determine whether Vasya managed to say hello by the given word s.
#
# Input
# The first and only line contains the word s, which Vasya typed. This word consisits of small Latin letters, its length is no less that 1 and no more than 100 letters.
#
# Output
# If Vasya managed to say hello, print "YES", otherwise print "NO".

FINAL_RESULT = ['h', 'e', 'l', 'l', 'o']


def calculate_freq(letter, word):
    frequency = 0
    for i in word:
        if i == letter:
            frequency += 1
    return frequency


def solve_the_problem():
    word = input()
    result = []
    for i in word:
        if i == 'h':
            if len(result) == 0:
                result.append(i)
        elif i == 'e':
            if len(result) == 1 and result[0] == 'h':
                result.append(i)
        elif i == 'l':
            if len(result) == 2 and result[1] == 'e' or len(result) == 3 and result[2] == 'l':
                result.append(i)
        elif i == 'o':
            if len(result) == 4 and result[3] == 'l':
                result.append(i)
    if result == FINAL_RESULT:
        print("YES")
    else:
        print("NO")


if __name__ == "__main__":
    solve_the_problem()
