import tqdm as tqdm
import requests
import os
import urllib
import re
import os
import string

url = raw_input("Enter the url : ")
name = raw_input("Enter the name : ")

def download(url,name):
	chunk_size = 1024
	r = requests.get(url, stream = True)
	total_size = int(r.headers['content-length'])
	with open(name, 'wb') as f:
		for data in tqdm(iterable = r.iter_content(chunk_size = chunk_size), total = total_size/chunk_size, unit = 'KB'):
			f.write(data)
download(url,name)
