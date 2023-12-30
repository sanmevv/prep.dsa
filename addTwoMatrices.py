def matrix(m,n):
    o = []
    for i in range(m):
        row = []
        for j in range(n):
            inp = int(input(f"Enter the value of o[{i}][{j}]"))
            row.append(inp)
        o.append(row)
    return o

m = int (input("Enter the value of m: \n"))
n = int (input("Enter the value of n: \n"))

print("Enter matrix A: ")
A = matrix(m,n)
print(A)

print("Enter matrix B: ")
B = matrix(m,n)
print(B)

def sum(A,B):
    output = []
    for i in range(len(A)):
        row = []
        for j in range(len(A[0])):
            row.append(A[i][j] + B[i][j])
        output.append(row)
    return output

print(f"The sum of matrix {A} and matrix {B} is: {sum(A,B)}")
            