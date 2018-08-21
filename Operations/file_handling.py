
l=['a','b','d']
with open("track.txt",'a+') as fp:
    fp.truncate()
    for items in l:
        fp.write(items + '\n')
with open("track.txt",'r+') as fp:
    p = []
    for lines in fp:
        print(lines)
        p.append(lines)
