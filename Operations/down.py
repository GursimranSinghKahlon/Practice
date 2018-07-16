import urllib2
songdata=urllib2.urlopen('https://url').read()
output=open("filname.extension",'wb')
output.write(songdata)
output.close()
