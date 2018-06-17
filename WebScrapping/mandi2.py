import requests
from bs4 import BeautifulSoup

url = 'https://data.gov.in/resources/current-daily-price-various-commodities-various-markets-mandi'
'''https://data.gov.in/node/86943/datastore/export/csv'''

#load and scrape
response = requests.get(url) 
html = response.content
print(html)
soup = BeautifulSoup(html, "lxml")
soup2 = soup.prettify()
print(soup2)
links = soup.find_all('a')
for link in links:
	print(link.get('href'))

'''
import os

def file_is_empty(path):
	try:
		return (os.stat(path).st_size==0)
	except:
		return (0)
'''		
import os		
if not os.path.exists('latest.csv'):	    
	with open('latest.csv','a+') as file:
		string = ' "", "state","district","market","commodity","variety","arrival_date","min_price","max_price","modal_price"\n '
		file.write(string) 
		   
i=1
	
while(1):
	try:		
		api = "https://api.data.gov.in/resource/9ef84268-d588-465a-a308-a864a43d0070?api-key=579b464db66ec23bdd000001cdd3946e44ce4aad7209ff7b23ac571b&format=csv&offset={starting}".format(starting=i)
		print(api)
		i+=10
		response = requests.get(api)
		html = response.content
		if(html == ""):
			break
		list = html.split('\n')
		list = list[1:]
		string = '\n'.join(list)
		with open('latest.csv','a+') as file:
			file.write(string)
	except:
		print("Done2")
		break
		
		

