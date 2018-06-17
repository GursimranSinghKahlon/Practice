from selenium import webdriver
from selenium.webdriver.common.keys import Keys

driver = webdriver.Firefox()
driver.get("https://vtop.vit.ac.in/student/stud_login.asp")
#assert "Python" in driver.title
elem = driver.find_element_by_name("regno")
elem.clear()
elem.send_keys("16BIT0214")

elem = driver.find_element_by_name("passwd")
elem.clear()
elem.send_keys("16BIT0214")


'''
elem.send_keys("16BIT0214",Keys.TAB)
elem = driver.find_element_by_name("imgCaptcha")
https://vtop.vit.ac.in/student/captcha.asp
'''

#elem = driver.find_element_by_name("vrfcd")

'''elem.send_keys(Keys.RETURN)
assert "No results found." not in driver.page_source
driver.close()'''
