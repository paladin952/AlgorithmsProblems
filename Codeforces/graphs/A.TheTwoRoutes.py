# A. The Two Routes
# time limit per test2 seconds
# memory limit per test256 megabytes
# inputstandard input
# outputstandard output
# In Absurdistan, there are n towns (numbered 1 through n) and m bidirectional railways. There is also an absurdly simple road network — for each pair of different towns x and y, there is a bidirectional road between towns x and y if and only if there is no railway between them. Travelling to a different town using one railway or one road always takes exactly one hour.
#
# A train and a bus leave town 1 at the same time. They both have the same destination, town n, and don't make any stops on the way (but they can wait in town n). The train can move only along railways and the bus can move only along roads.
#
# You've been asked to plan out routes for the vehicles; each route can use any road/railway multiple times. One of the most important aspects to consider is safety — in order to avoid accidents at railway crossings, the train and the bus must not arrive at the same town (except town n) simultaneously.
#
# Under these constraints, what is the minimum number of hours needed for both vehicles to reach town n (the maximum of arrival times of the bus and the train)? Note, that bus and train are not required to arrive to the town n at the same moment of time, but are allowed to do so.
#
# Input
# The first line of the input contains two integers n and m (2 ≤ n ≤ 400, 0 ≤ m ≤ n(n - 1) / 2) — the number of towns and the number of railways respectively.
#
# Each of the next m lines contains two integers u and v, denoting a railway between towns u and v (1 ≤ u, v ≤ n, u ≠ v).
#
# You may assume that there is at most one railway connecting any two towns.
#
# Output
# Output one integer — the smallest possible time of the later vehicle's arrival in town n. If it's impossible for at least one of the vehicles to reach town n, output  - 1.

from collections import defaultdict

# TODO finish this
def shortest_path(graph, start, end, path=[]):
    path += [start]
    if start == end:
        return path
    if start not in graph.keys():
        return None
    shortest = None
    for node in graph[start]:
        if node not in path:
            newpath = shortest_path(graph, node, end, path)
            if newpath:
                if not shortest or len(newpath) < len(shortest):
                    shortest = newpath
    return shortest


def solve_the_problem():
    n, m = [int(x) for x in input().split(' ')]

    graph_railway = defaultdict(list)
    for i in range(0, m):
        u, v = [int(x) for x in input().split(' ')]
        graph_railway[u].append(v)


    print(shortest_path(graph_railway, 1, n))


if __name__ == "__main__":
    solve_the_problem()
