import urllib2
songdata=urllib2.urlopen('https://firebasestorage.googleapis.com/v0/b/picfi-79b51.appspot.com/o/image.jpg?alt=media&token=5944cfb2-6e3a-4861-a0e3-8e05298ea787').read()
output=open("filname.jpg",'wb')
output.write(songdata)
output.close()
