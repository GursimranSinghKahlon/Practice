from selenium import webdriver
from selenium.webdriver.common.keys import Keys

browser = webdriver.Firefox()
browser.get("https://vtopbeta.vit.ac.in/vtop/")
browser.find_element_by_css_selector('.btn-primary').click()
browser.switch_to_window(browser.window_handles[1])

#css-selector: .btn-primary
#css-path: html body.skin-blue-light.layout-top-nav div.wrapper div.content-wrapper div.container section.content div.row div.col-sm-12.col-md-6 div.box.box-primary.box-solid div.box-body button.btn.btn-primary.pull-right
#xpath: /html/body/div/div[2]/div/section/div[2]/div[1]/div/div[2]/button

'''
elem.send_keys("16BIT0214",Keys.TAB)
elem = browser.find_element_by_name("imgCaptcha")
https://vtop.vit.ac.in/student/captcha.asp
'''

#elem = browser.find_element_by_name("vrfcd")

'''elem.send_keys(Keys.RETURN)
assert "No results found." not in browser.page_source
browser.close()'''
