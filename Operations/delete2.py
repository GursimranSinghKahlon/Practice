import os
dir=os.listdir(".")
print(dir)
for x in dir:
	try:
		path=os.path.join(x,"changename.py")
		os.unlink(path)
	except:
		print("no")

	
