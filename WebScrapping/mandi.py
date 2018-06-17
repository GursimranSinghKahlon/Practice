import requests
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
		
		
#view csv
def view_csv(filename = 'latest.csv'):
	import numpy as np
	data = np.genfromtxt(filename,delimiter=',',names=True, dtype = None)
	data_array = np.recfromcsv(filename)
	print(data)
	print(data_array)
#view_csv();

#ifttt notify
def notification(v1, v2, v3, trig_name = "new_update", api_key = "cuUnAP0bG4MIevmfZeXs98",):
	data = {"value1" : 1, "value2" : 2, "value3" : 3}
	requests.post("https://maker.ifttt.com/trigger/{trig}/with/key/{key}".format(trig = trig_name, key = api_key), data)
#notification(1,2,3)
