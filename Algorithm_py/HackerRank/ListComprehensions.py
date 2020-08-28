if __name__ == '__main__':
    x = int(input())
    y = int(input())
    z = int(input())
    n = int(input())

 
    
result = [[ix,iy,iz] for ix in range(x+1) for iy in range(y+1) for iz in range(z+1) if ix+iy+iz !=n ]
print(result)