import json
from pprint import pprint

with open('data/vqa_raw_train.json') as f:
    data = json.load(f)

pprint(data[5]['ques_id'])