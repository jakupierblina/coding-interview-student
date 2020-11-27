if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())

 #find the runner-up score!
 def findrun(n,arr):
    print (sorted(set(arr))[-2])