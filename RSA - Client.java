importsocket
import pickle
e = 7
p = 11
q = 13
def gcd(a, b):
while b != 0:
a, b = b, a % b
return a
# Euclid's extended algorithm for finding the multiplicative inverse of two numbers
Sap ID: 60003210028
def multiplicative_inverse(e, phi):
d = 0
x1 = 0
x2 = 1
y1 = 1
temp_phi = phi
while e > 0:
temp1 = temp_phi // e
temp2 = temp_phi - temp1 * e
temp_phi = e
e = temp2
x = x2 - temp1 * x1
y = d - temp1 * y1
x2 = x1
x1 = x
d = y1
y1 = y
if temp_phi == 1:
return d + phi
def is_prime(num):
Sap ID: 60003210028
if num == 2:
return True
if num < 2 or num % 2 == 0:
return False
for n in range(3, int(num ** 0.5) + 2, 2):
if num % n == 0:
return False
return True
def generate_key_pair():
if not (is_prime(p) and is_prime(q)):
raise ValueError("Both numbers must be prime.")
elif p == q:
raise ValueError("p and q cannot be equal")
# n = pq
n = p * q
# Phi is the totient of n
phi = (p - 1) * (q - 1)
# Choose an integer e such that e and phi(n) are coprime
# e = int(input("Enter the value of e:"))
# Use Euclid's Algorithm to verify that e and phi(n) are coprime
g = gcd(e, phi)
Sap ID: 60003210028
while g != 1:
# e = random.randrange(1, phi)
g = gcd(e, phi)
# Use Extended Euclid's Algorithm to generate the private key
d = multiplicative_inverse(e, phi)
# Return public and private key_pair
# Public key is (e, n) and private key is (d, n)
return ((e, n), (d, n))
def encrypt(pk, plaintext):
# Unpack the key into it's components
key, n = pk
# Convert each letter in the plaintext to numbers based on the character using a^b mod m
cipher = [pow(ord(char), key, n) for char in plaintext]
# Return the array of bytes
print(cipher)
return pickle.dumps(cipher)
s = socket.socket()
port = 12345
s.connect(("127.0.0.1", port))
print("Connection is established")
public, private = generate_key_pair()
Sap ID: 60003210028
msg = encrypt(public, "Hii!! Chakshu here")
print("Sending: " + str(msg))
s.send(msg)
print(s.recv(1024).decode())
s.close()