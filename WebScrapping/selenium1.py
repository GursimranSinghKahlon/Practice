from selenium import webdriver

path_to_chromedriver = '/home/gursimran/Documents/chromedriver' # change path as needed
browser = webdriver.Chrome(executable_path = path_to_chromedriver)
url = 'https://www.google.com/?gws_rd=ssl'
browser.get(url)
