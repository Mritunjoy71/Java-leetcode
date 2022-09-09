from didww_encrypt import Encrypt, MODE_SANDBOX

with open("E:\\others\\Java-leetcode\\Java-leetcode\\src\\doc.pdf", mode="rb") as f:
    data = f.read()

enc = Encrypt.new(MODE_SANDBOX)
enc_data = enc.encrypt(data)
enc_filename = "E:\\others\\Java-leetcode\\Java-leetcode\\src\\doc.pdf.enc"
with open(enc_filename, mode="wb") as f:
    f.write(enc_data)

# print(f"encrypted file saved: {enc_filename}")
print(enc.fingerprint)