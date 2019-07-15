import time

link = "http://selenium1py.pythonanywhere.com/catalogue/coders-at-work_207/"


def test_guest_should_see_button_add_to_basket(browser):
    browser.get(link)
    classNameToBasket = "btn-add-to-basket"
    btnToBasket = browser.find_elements_by_class_name(classNameToBasket)
    # print( btnToBasket )
    assert len(
        btnToBasket) == 1, "Too much buttons or button isn't exist"  # если кнопок с таким селектором больше 1 или они отсутствуют падает
    # time.sleep(30)
