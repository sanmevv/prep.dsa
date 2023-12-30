A = [[1,5,7],
     [4,0,2],
     [6,0,3]]
B = [[1,0,2],
     [1,0,3],
     [5,0,2]]
C =[[0,0,0],
    [0,0,0],
    [0,0,0]]

def bruteForce(A,B):
    C = [[0] * len(A[0]) for _ in range(len(A))]
    for i in range(len(A)):
        for j in range(len(A[0])):
            C[i][j] = A[i][j] * B[i][j]
    return C

def optimal(A,B):
    C = [[A[i][j] + B[i][j] for j in range(len(A[0]))]  for i in range(len(A))]
    return C

print(bruteForce(A,B))
print(optimal(A,B))
