import sys
input = sys.stdin.readline

N, K = map(int, input().split())
arr = [0 for _ in range(N)]

for i in range(N) :
    arr[i] = list(map(int, sys.stdin.readline().split()))
S, X, Y = map(int, sys.stdin.readline().split())

def check_vi(i, j):
    global arr, N, k, mark
    if 0 <= i and i < N and 0 <= j and j < N:
        if arr[i][j] == 0:
            arr[i][j] = -1*mark*(k + 1)
            
mark = -1
for s in range(S):
    mark *= -1
    if (arr[X-1][Y-1] != 0): #찾는 값이 채워지면 출력하고 종료 (채워지면 값 변화 x 때문)
        break
    for k in range(K):
        for i in range(N):
            for j in range(N):
                if arr[i][j] == mark*(k+1):
                    for dx, dy in [1, 0],[-1, 0],[0, 1],[0, -1]: 
                        check_vi(i+dx, j+dy)
                        
if (arr[X-1][Y-1] < 0):
    print(-1*arr[X-1][Y-1])
else:
    print(arr[X-1][Y-1])