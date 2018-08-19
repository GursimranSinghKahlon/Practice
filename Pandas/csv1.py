import pandas as pd

def binary_search(sdf, key):
    start = 0
    end = len(df.index) - 1
    while start <= end:
        mid = int((start + end)/2)
        #print("Mid = "+str(mid))
        if key == sdf.iloc[mid].CLASSNBR:
            print("\nEntered number %d is present at position: %d" % (key, mid))
            return mid
        elif key < sdf.iloc[mid].CLASSNBR:
            end = mid - 1
        elif key > sdf.iloc[mid].CLASSNBR:
            start = mid + 1
    print("\nElement not found!")
    return -1

def insert_item(df):
    line = {}
    #i = 0 
    for column_name in df.columns:
        line[column_name] = input("Enter the {} : ".format(column_name))

    print(line)
    #row = DataFrame(line, index=[3])
    #df2 = concat([df.ix[:2], row, df.ix[3:]]).reset_index(drop=True)
      


df = pd.read_csv("course.csv")
df.sort_values(by='CLASSNBR')

print(df.head())
print(df.columns)
#print(df[df.CLASSNBR == 3587])

total = 0
while(1):
    class_no = int(input("Enter the class no. : "))
    index = binary_search(df, class_no)
    if(index==-1):
        print("Enter correct details. ")
        continue
    item_details = df.iloc[index]
    total += int(item_details.CREDITS)
    print("Name : " + str(item_details.COURSE_TITLE) + " Total : " + str(total))



