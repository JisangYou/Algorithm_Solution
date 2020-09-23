if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    
    set_t= set(arr)
    list_t = list(set_t)
    list_t.sort()
    print(list_t[len(list_t)-2])