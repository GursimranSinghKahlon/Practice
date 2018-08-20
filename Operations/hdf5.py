import h5py

data = h5py.File('TRAREAP12903D09025.h5', 'r+')

for key in data.keys():
    print(key) #Names of the groups in HDF5 file.

#Get the HDF5 group
group = data[key]

#Checkout what keys are inside that group.
for key in group.keys():
    print(key)
    data = group[key].value
    print(data)