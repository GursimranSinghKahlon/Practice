
from bs4 import BeautifulSoup
import re
import requests
from os.path import basename

webpage = input("Enter the url : ")
webpage = 'http://web.stanford.edu/class/cs193a/lectures.shtml'
className = input("Enter the class name : ")

html = requests.get('{}'.format(webpage)).text
soup = BeautifulSoup(html, 'lxml')
links = soup.find_all('a', attrs={"class" :"filename", "href" :re.compile(r".*.zip$")})
#soup.findAll(attrs={"name" : "stainfo"})

for link in links:
	url="http://web.stanford.edu/class/cs193a/"+ link['href']
	filename = basename(link['href'])
	print(url)
	print(filename)
	with open('{}'.format(filename),'wb') as output:
		r = requests.get(url, allow_redirects=True)
		output.write(r.content)
	
		
print(len(links))
