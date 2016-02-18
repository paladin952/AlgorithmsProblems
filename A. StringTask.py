# A. String Task
# time limit per test2 seconds
# memory limit per test256 megabytes
# inputstandard input
# outputstandard output
# Petya started to attend programming lessons. On the first lesson his task was 
# to write a simple program. The program was supposed to do the following: in the 
# given string, consisting if uppercase and lowercase Latin letters, 0
# 
# deletes all the vowels,
# inserts a character "." before each consonant,
# replaces all uppercase consonants with corresponding lowercase ones.
# Vowels are letters "A", "O", "Y", "E", "U", "I", and the rest are consonants.
#  The program's input is exactly one string, it should return the output as a single 
# string, resulting after the program's processing the initial string.
# 
# Help Petya cope with this easy task.
# 
# Input
# The first line represents input string of Petya's program. This string only
#  consists of uppercase and lowercase Latin letters and its length is from 1 to 100, inclusive.
# 
# Output
# Print the resulting string. It is guaranteed that this string is not empty.

VOWELS = ["A", "O", "Y", "E", "U", "I"]


def solve_the_problem():
    string = input()

    result = ""
    for letter in string:
        if not letter in VOWELS and not letter in [x.lower() for x in VOWELS]:
            result += "."
            result += letter
    print(result.lower())


if __name__ == "__main__":
    solve_the_problem()
