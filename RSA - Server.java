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
def multiplicative_inverse(e, phi):
d = 0
x1 = 0
Sap ID: 60003210028
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
if num == 2:
return True
if num < 2 or num % 2 == 0:
Sap ID: 60003210028
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
while g != 1:
# e = random.randrange(1, phi)
g = gcd(e, phi)
Sap ID: 60003210028
# Use Extended Euclid's Algorithm to generate the private key
d = multiplicative_inverse(e, phi)
# Return public and private key_pair
# Public key is (e, n) and private key is (d, n)
return ((e, n), (d, n))
def decrypt(pk, ciphertext):
# Unpack the key into its components
key, n = pk
# Generate the plaintext based on the ciphertext and key using a^b mod m
aux = [str(pow(char, key, n)) for char in ciphertext]
# Return the array of bytes as a string
plain = [chr(int(char2)) for char2 in aux]
return "".join(plain)
s = socket.socket()
print("socket issuccessfully created")
port = 12345
s.bind(("", port))
print("socket binded to %s" % (port))
s.listen(5)
print("Socket is listening")
public, private = generate_key_pair()
Sap ID: 60003210028
print("Private key is - " + str(private[0]))
while True:
c, addr = s.accept()
print("Got connection from", addr)
msg = pickle.loads(c.recv(1024))
print(msg)
msg = decrypt(private, msg)
print("Received: " + msg)
c.send(msg.upper().encode())
c.close()