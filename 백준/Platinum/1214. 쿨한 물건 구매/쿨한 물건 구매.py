d, p, q = map(int,input().split())
p, q = max(p, q),min(p, q)
small = 1e10

for i in range(min(d // p, q)+1):
  small = min(small, (q - (d - p * i) % q) % q)

small = min(small, (p - (d % p)) % p)
print(d + small)