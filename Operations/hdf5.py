import h5py
from time import sleep
data = h5py.File('data_prepro.h5', 'r+')

import h5py
filename = 'data_prepro.h5'
f = h5py.File(filename, 'r')

# List all groups
print("Keys: %s" % f.keys())
keys = list(f.keys())

for key in keys:
    group_key = key
    # Get the data
    print(group_key)
    print(f[group_key].shape)
    data = list(f[group_key])
    print(data[0])

